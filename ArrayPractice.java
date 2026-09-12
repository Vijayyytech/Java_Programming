import java.util.Scanner;

public class ArrayPractice{
    public static void main(String[] args){
        // System.out.println("Enter Array size:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0; i<marks.length; i++)
        System.out.print(marks[i] +" "); 
        
      /*  System.out.println("Enter number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter number of columns:");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        System.out.println("Enter the matrix elements:");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix elements are:");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println(" ");
        } */
    
  }   
}
