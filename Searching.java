 public class Searching {
     public static int Binarysearch(int key,int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while(start<=end){
            if (key == arr[mid]) {
                return mid;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11};
        int key = 100;
        int index = Binarysearch(key,arr);
        System.out.println("Index of "+key+" is-: "+index);
        }
    }
