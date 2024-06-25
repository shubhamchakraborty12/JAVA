import java.util.*;
public class Practice {
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //selection sort
    public static void selectionSort(){
        int arr[] = {7,8,3,1,2};
        int n = arr.length;

        //Time Complexity = O(n^2)
        //selection sort
        for(int i = 0;i < n-1; i++){
            int smallest = i;
            for(int j = i+1; j < n; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    //bubble sort
    public static void bubbleSort(){
        int arr[] = {7,8,3,1,2};
        int n = arr.length;
        //time complexity = O(n^2)
        //bubble sort
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void insertionSort(){
        int arr[] = {7,8,3,1,2};
        int n = arr.length;


        //insertion sort
        for(int i = 1; i < n; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = current;
        }
        printArray(arr);
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++; idx1++;
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for(int i = 0, j = si; i<merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
   
    public static void divide(int arr[], int si, int ei) {
        if(si>=ei) {
            return;
        }
        
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }
    
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);
        //print
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
}
}