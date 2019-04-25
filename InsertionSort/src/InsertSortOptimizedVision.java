public class InsertSortOptimizedVision {
    // 算法中不允许产生任何实例
    private InsertSortOptimizedVision(){}
    public static void sort(Comparable[]arr){
        for(int i=1;i<arr.length;i++){
            Comparable temp = arr[i];
            int j;
            for(j=i;j>0;j--){
                if(temp.compareTo(arr[j-1])<0){
                    arr[j] = arr[j-1];
                }else{
                    break;
                }
            }
            arr[j] = temp;
            /*int j;
            for(j=i;j>0&&temp.compareTo(arr[j-1])<0;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;*/
        }
    }
    public static void main(String[]args){
        Integer[]arr = new Integer[]{10,9,8,7,6,5,4,3,2,1};
        InsertSortOptimizedVision.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
