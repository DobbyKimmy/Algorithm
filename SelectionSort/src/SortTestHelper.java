import java.lang.reflect.*;

public class SortTestHelper {
    // 不允许产生任何实例
    private SortTestHelper(){}

    // 生成有n个元素的随机数组，每个数组的随机范围为
    // :[rangeL,rangeR]
    public static Integer[]generateRandomArray(int n,int rangeL,int rangeR){
        assert rangeL <= rangeR;
        Integer[]arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i] = new Integer((int)(Math.random()*(rangeR-rangeL+1)+rangeL));
        }
        return arr;
    }
    // 打印arr数组所有的内容
    public static void printArray(Object[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(',');
        }
        System.out.println();
        return;
    }
    // 判断arr数组是否有序
    public static boolean isSorted(Comparable[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].compareTo(arr[i+1])>0)
                return false;
        }
        return true;
    }

    // 测试排序算法排序arr数组得到的结果的正确性以及算法运行时间
    public static void testSort(String sortClassName,Comparable[]arr){
        // 通过Java的反射，通过排序算法的类名，运行排序函数对测试数组进行排序
        try{
            // 通过反射的Class.forName获得排序函数的Class对象
            Class sortClass = Class.forName(sortClassName);
            // 通过排序函数的Class对象获得排序方法
            Method sortMethod = sortClass.getMethod("sort",new Class[]{Comparable[].class});
            // 排序参数只有一个是可比较的数组arr
            Object[]params = new Object[]{arr};

            long startTime = System.currentTimeMillis();
            // 调用排序函数
            sortMethod.invoke(null,params);
            long endTime = System.currentTimeMillis();

            assert isSorted(arr);

            System.out.println(sortClassName+":"+(endTime-startTime)+"ms");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
