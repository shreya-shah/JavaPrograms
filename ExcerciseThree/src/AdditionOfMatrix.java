import java.util.Scanner;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];

        System.out.print("Enter elements of first matrix: ");
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.print("Enter elements of second matrix: ");
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        AdditionOfMatrix additionOfMatrix = new AdditionOfMatrix();
        int[][] thirdMatrix =  additionOfMatrix.addTwoMatrix(rows,columns,firstMatrix,secondMatrix);

        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(firstMatrix[i][j]+" ");
            }

            System.out.println();
        }

        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(secondMatrix[i][j]+" ");
            }

            System.out.println();
        }

        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(thirdMatrix[i][j]+" ");
            }

            System.out.println();
        }
    }

    public int[][] addTwoMatrix(int rows, int columns, int[][] firstMatrix, int[][] secondMatrix) {
        if(firstMatrix==null || secondMatrix==null){
            return null;
        }
        int[][] thirdMatrix = new int[rows][columns];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                thirdMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        return thirdMatrix;
    }

}
