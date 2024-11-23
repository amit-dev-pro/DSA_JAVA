import java.util.Scanner;

public class transpose {
    static void printRadhaKrishna(){
        System.out.println("RADHA KRISHNA");
    }
    static void printMatrix(int[][] matrix){

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix, int r, int c){
        int[][]ans=new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){

                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }

    public static void InPlaceTransposeMatrix(int[][] matrix, int r, int c){

        for(int i=0; i<r; i++){
            for(int j=i; j<c; j++){

                //swap matrix
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }



    public static void main(String[] args) {
        printRadhaKrishna();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter row number ");
        int r=sc.nextInt();
        System.out.println("enter the column number");
        int c=sc.nextInt();
        int [][]matrix=new int[r][c];
        System.out.println("enter the "+r*c+" elements ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

//        int[][] ans=transposeMatrix(matrix,r,c);
         InPlaceTransposeMatrix(matrix,r,c) ;

        printMatrix(matrix);
    }
}
