public class Shorting2 {
    static void insertionSort(int[] arr){
        int n = arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j+1]>arr[j]){
                    arr[j] = count;
                    arr[j+1]=arr[j];
                    count=arr[j+1];

                }
            }
        }

    }
public static void main(String[] args) {
    int[] arr={12,11,13,5,6};
    insertionSort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

}    
}
