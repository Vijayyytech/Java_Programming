import java.util.Scanner;
public class sum_of_matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int columns = sc.nextInt();

        int[][] a = new int[rows][columns];
        int[][] b = new int[rows][columns];
        int[][] sum = new int[rows][columns];

        System.out.println("Enter the elements of first matrix:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of the matrix is:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}