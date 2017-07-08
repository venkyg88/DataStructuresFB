/**
 * Created by venkat on 7/5/17.
 */
public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = { {1, 9, 9, 2},
                {9, 7, 7, 9},
                {9, 7, 7, 9},
                {3, 9, 9, 4},
                {3, 9, 9, 4}
        };

        /*for (int i = 0 ; i < matrix.length; i++) {
            for( int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");

        }*/

        System.out.print("Rows :"+matrix.length);
        System.out.print("Columns :"+matrix[0].length);
    }

    boolean rotate(int matrix[][]){
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }

        int n = matrix.length;

        for (int layer = 0; layer < n /2; layer++) {

            int first = layer;
            int last = n - 1 - layer;

            for(int i = first ; i < last; i++) {
                int offset = i - first;

                int top = matrix[i][first];

                //left -> top
                matrix[i][first] = matrix[last - offset][first];

                //bottom -> left
                matrix[last - offset][first] = matrix[last][last-offset];

                //top -> right
                matrix[i][last] = top;
            }
        }

        return true;
    }
}
