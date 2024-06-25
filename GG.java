import java.util.*;
public class GG{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the row of 2-D array: ");
    int n = sc.nextInt();
    System.out.print("Enter the column of 2-D array: ");
    int m = sc.nextInt();
    int matrix[][] = new int[n][m];

    for(int i = 0; i<n; i++){
      for(int j = 0; j<m; j++){
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("The spiral order of matrix is: ");

    int rowStart = 0;
    int rowEnd = n-1;
    int colStart = 0;
    int colEnd = m-1;

    while(rowStart <= rowEnd && colStart <= colEnd){
      //moving left to right
      for(int col = colStart; col<= colEnd; col++){
        System.out.print(matrix[rowStart][col] + " ");
      }

      rowStart++;
      //moving top to bottom
      for(int row = rowStart; row<= rowEnd; row++){
        System.out.print(matrix[row][colEnd]+ " ");
      }
      
      colEnd--;

      //moving right to left
      for(int col=colEnd; col>=colStart; col--){
        System.out.print(matrix[rowEnd][col]+" ");
      }

      rowEnd--;

      //moving bottom to top or center
      for(int row = rowEnd; row>= rowStart; row--){
        System.out.print(matrix[row][colStart]+" ");
      }
      colStart++;

      System.out.println();

    }
  }
}