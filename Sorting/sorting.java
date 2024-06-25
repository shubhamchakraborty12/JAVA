
public class sorting {
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

    public static void main(String[] args) {
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

}