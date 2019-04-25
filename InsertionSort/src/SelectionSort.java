public class SelectionSort {
    // 算法中不允许产生任何实例
    private SelectionSort(){}
    public static void sort(Comparable[]arr){
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex].compareTo(arr[j])>0)
                    minIndex = j;
            }
            Comparable temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
