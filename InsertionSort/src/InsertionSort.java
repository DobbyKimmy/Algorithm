public class InsertionSort {
    // 算法中不允许生成任何实例
    private InsertionSort(){}
    public static void sort(Comparable[]arr){
        // 插入排序从i=1开始，因为第0个元素已经是排好序的了
        for(int i=1;i<arr.length;i++){
            /*int k = i;
            while(k>0 && arr[k].compareTo(arr[k-1])<0){
                Comparable temp = arr[k];
                arr[k] = arr[k-1];
                arr[k-1] = temp;
                k--;
            }*/
            /*for(int j=i;j>0;j--){
                if(arr[j].compareTo(arr[j-1])<0){
                    Comparable temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }*/
            for(int j=i;j>0&&arr[j].compareTo(arr[j-1])<0;j--){
                Comparable temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
    public static void main(String[]args){
        /*Integer[]arr = SortTestHelper.generateRandomArray(10000,1,3);
        SortTestHelper.testSort("InsertionSort",arr);
        Integer[]arr2 = SortTestHelper.generateRandomArray(10000,1,3);
        SortTestHelper.testSort("SelectionSort",arr2);
        Integer[]arr3 = SortTestHelper.generateRandomArray(10000,1,3);
        SortTestHelper.testSort("InsertSortOptimizedVision",arr3);*/
        /*-----------------------------------------------------------------*/
        Integer[]arr4 = SortTestHelper.generateNearlyOrderedArray(1000,100);
        SortTestHelper.printArray(arr4);
        SortTestHelper.testSort("InsertSortOptimizedVision",arr4);
        SortTestHelper.printArray(arr4);
        Integer[]arr5 = SortTestHelper.generateNearlyOrderedArray(1000,100);
        SortTestHelper.printArray(arr5);
        SortTestHelper.testSort("SelectionSort",arr5);
        SortTestHelper.printArray(arr5);
    }
}
