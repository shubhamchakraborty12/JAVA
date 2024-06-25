package searching;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length-1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == key) {
                return mid;
            }
            else if(key>arr[mid]) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1};
        int key = 2;
        System.out.println("The key is present at position: "+binarySearch(arr, key));
    }
}
