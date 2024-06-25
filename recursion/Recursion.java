package recursion;
import java.util.*;
public class Recursion {
   public static int calcPower(int x, int n){
    if(n == 0){
        return 1;
    }

    if(x == 0){
        return 0;
    }
    int xpownm1 = calcPower(x, n-1);
    int xpown = x * xpownm1;
    return xpown;
   }

   public static void printFib(int a, int b, int n){
        if(n == 0){
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        printFib(b, c, n - 1);
   }

   public static int printFact(int n){
    if(n == 0 || n==1){
        return 1;
    }
    
    int fact_nm1 = printFact(n - 1);
    int fact_1 = n * fact_nm1;
    return fact_1;
   }

   public static void printSum(int i, int n, int sum){
    if(i == n){
        sum += i;
        System.out.println(sum);
        return;
    }
    sum += i;
    printSum(i + 1, n, sum);
    

   }

   public static void printRev(String str, int idx){
    if(idx == 0){
        System.out.print(str.charAt(idx) + " ");
        return;
    }
    System.out.print(str.charAt(idx) + " ");
    printRev(str, idx - 1);
   }

   public static int first = -1;
   public static int last = -1;

   public static void findOccurance(String str, int idx, char element){
    if(idx == str.length()){
        System.out.println(first);
        System.out.println(last);
        return;
    }
    char currChar = str.charAt(idx);
    if(currChar == element){
        if(first == -1){
            first = idx;
        }
        else{
            last = idx;
        }
    }

    findOccurance(str, idx + 1, element);
   }

   public static boolean isSorted(int arr[], int idx){
    if(idx == arr.length - 1){
        return true;
    }
    
    if(arr[idx] < arr[idx + 1]){
        //array is sortred till now
        return isSorted(arr, idx + 1);
    }
    else{
        return false;
    }
   }

   public static void moveAllX(String str, int idx, int count, String newString){
    
    if(idx == str.length()){
        for(int i = 0; i<count; i++){
            newString += 'x';
        }
        System.out.println(newString);
        return;
    }
    char currChar = str.charAt(idx);
    if(currChar == 'x'){
        count++;
        moveAllX(str, idx + 1, count, newString);
    }
    else{
        newString += currChar;
        moveAllX(str, idx + 1, count, newString);
    }
   }

   public static boolean[] map = new boolean[26];


   public static void removeDuplicates(String str, int idx, String newString){
    if(idx == str.length()) {
        System.out.println(newString);
        return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar - 'a'] == true) {
        removeDuplicates(str, idx + 1, newString);
    }
    else{
        newString += currChar;
        map[currChar - 'a'] = true;
        removeDuplicates(str, idx + 1, newString);
    }
   }

   public static void subsequences(String str, int idx, String newString, HashSet<String> set){
    if(idx == str.length()){
        if(set.contains(newString)){
            return;
        }
        else{
            System.out.println(newString);
            set.add(newString);
            return;
        }
    }
    char currChar = str.charAt(idx);
    //to be 
    subsequences(str, idx + 1, newString + currChar, set);

    //not to be
    subsequences(str, idx + 1, newString, set);
   }


   public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

   public static void printComb(String str, int idx, String combination){
    if(idx == str.length()){
        System.out.println(combination);
        return;
    }
    
    char currChar = str.charAt(idx);
    String mapping = keypad[currChar - '0'];

    for(int i = 0; i<mapping.length(); i++){
        printComb(str, idx + 1, combination + mapping.charAt(i));
    }
   }

   public static void printPerm(String str, String permutation){
    if(str.length() == 0){
        System.out.println(permutation);
        return;
    }
    for(int i = 0; i<str.length(); i++){
        char currChar = str.charAt(i);
        String newStr = str.substring(0, i) + str.substring(i + 1);
        printPerm(newStr, permutation + currChar);
    }
   }

   public static int countPaths(int i, int j, int n, int m){
    if(i == n || j == m){
        return 0;
    }
    
    if(i == n-1 && j == m-1){
        return 1;
    }

    //move downwards
    int downPaths = countPaths(i + 1, j, n, m);

    //move right
    int rightPaths = countPaths(i, j + 1, n, m);

    return downPaths + rightPaths;
   }

   public static int placeTiles(int n, int m){
    if(n == m){
        return 2;
    }
    if(n < m){
        return 1;
    }

    //vertically
    int vertPlacements = placeTiles(n - m, m);

    //Horizontally
    int horPlacements = placeTiles(n - 1, m);
    return vertPlacements + horPlacements;

   }

   public static int callGuests(int n){
    if(n <= 1){
        return 1;
    }
    
    //single
    int ways1 = callGuests(n-1);
    //pairs
    int ways2 = (n-1) * callGuests(n-2);
    return ways1 + ways2;
   }

   public static void printSubset(ArrayList<Integer> subset){
    for(int i = 0; i<subset.size(); i++){
        System.out.print(subset.get(i));
    }
    System.out.println();
   }
   public static void findSubsets(int n, ArrayList<Integer> subset){
    if(n == 0){
        printSubset(subset);
        return;
    }
    
    //add hoga
    subset.add(n);
    findSubsets(n - 1, subset);
    //add nhi hoga
    subset.remove(subset.size()-1);
    findSubsets(n-1, subset);
   }

    public static void main(String[] args) {
      int n = 3;
      ArrayList<Integer> subset = new ArrayList<>();
      findSubsets(n, subset);
    }
}