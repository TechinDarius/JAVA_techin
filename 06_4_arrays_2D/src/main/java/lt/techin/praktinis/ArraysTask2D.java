package lt.techin.praktinis;

import java.sql.Array;
import java.util.Arrays;

public class ArraysTask2D {

    /**
     * Returns the maximum value in the 2D array arr.
     *
     * @param arr The 2D array to be processed.
     * @return The maximum value in the array.
     */


    public static void main(String[] args) {
        int arr[][] = {
                // {1}
//                {4,5,6},
//                {7,8,9}
//                {8, 1, 6},
//                {3, 5, 7},
//                {4, 9, 2}
                {1, 2, 3}, {2, 3, 4}, {3, 4, 1}
                //{1, 2, 3}, {3, 1, 2}, {2, 3, 1}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        //max(arr)
//        System.out.println(max(arr));//6
//        //rowSum(arr,0);
//        System.out.println(rowSum(arr, 1));//15
//        //columnSum(arr,0);
//        System.out.println(columnSum(arr, 1));//7
//        allRowSums(arr);
//        System.out.println(Arrays.toString(allRowSums(arr)));
//        isRowMagic(arr);
//        System.out.println(isRowMagic(arr));
//        isColumnMagic(arr);
        //System.out.println(isColumnMagic(arr));
        //isSquare(arr);
        //System.out.println(isSquare(arr));
        //System.out.println(isMagic(arr));
        System.out.println(isLatin(arr));
        //System.out.println(isSequence(arr));

    }

    public static int max(int[][] arr) {
        // throw new UnsupportedOperationException();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i + "" + j + "\n");
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Returns the sum of the elements in Row x of arr.
     *
     * @param arr The 2D array to be processed.
     * @param x   The row index.
     * @return The sum of elements in the specified row.
     */
    public static int rowSum(int[][] arr, int x) {
        //throw new UnsupportedOperationException();
        int rowSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == x) {
                for (int j = 0; j < arr[i].length; j++) {
                    rowSum += arr[i][j];
                }
            }

        }
        return rowSum;
    }

    /**
     * Returns the sum of the elements in Column x of arr.
     *
     * @param arr The 2D array to be processed.
     * @param x   The column index.
     * @return The sum of elements in the specified column.
     */
    public static int columnSum(int[][] arr, int x) {
        //throw new UnsupportedOperationException();
        int colSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == x) {
                    colSum += arr[i][j];
                }
            }
        }
        return colSum;
    }

    /**
     * Calculates the row sum for every row in arr and returns each of the values in an array.
     *
     * @param arr The 2D array to be processed.
     * @return An array containing the sum of elements in each row.
     */
    public static int[] allRowSums(int[][] arr) {
        //throw new UnsupportedOperationException();
        int[] allRowSum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            allRowSum[i] = rowSum(arr, i);
        }

        return allRowSum;
    }

    /**
     * Checks if the array arr is row-magic, which means that every row has the same row sum.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is row-magic, false otherwise.
     */
    public static boolean isRowMagic(int[][] arr) {
        //throw new UnsupportedOperationException();
        for (int i = 1; i < arr.length; i++) {
            if (allRowSums(arr)[i] != allRowSums(arr)[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the array arr is column-magic, which means that every column has the same column sum.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is column-magic, false otherwise.
     */
    public static boolean isColumnMagic(int[][] arr) {
        //throw new UnsupportedOperationException();
        for (int i = 0; i < arr.length - 1; i++) {
            if (columnSum(arr, i) != columnSum(arr, i + 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the array arr is square, i.e., every row has the same length as arr itself.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is square, false otherwise.
     */
    public static boolean isSquare(int[][] arr) {
        //throw new UnsupportedOperationException();
        int i = arr.length;
        int j = arr[i - 1].length;
        if (i == j) {
            return true;
        }
        return false;

    }

    /**
     * Checks if the array arr is a magic square, meaning it is square, and all row sums, column sums,
     * and the two diagonal-sums are equal.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a magic square, false otherwise.
     */
    public static boolean isMagic(int[][] arr) {
        //throw new UnsupportedOperationException();
        if (!isSquare(arr) || !isColumnMagic(arr) || !isRowMagic(arr)) {
            return false;
        }
        int diagSum1 = 0;
        int diagSum2 = 0;
        int k = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    diagSum1 += arr[i][j];
                }
                if (j == k) {
                    diagSum2 += arr[i][k];
                }
            }
            k--;
        }
        return diagSum2 != diagSum1 || diagSum2 != columnSum(arr, 0) ? false : true;
    }

    /**
     * Checks to see if the array arr is a Latin square, meaning it must be square, and each row and each column
     * must contain the values 1, 2, ..., n with no repeats.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a Latin square, false otherwise.
     */
    public static boolean isLatin(int[][] arr) {
        //throw new UnsupportedOperationException();
        int sumR = rowSum(arr, 0);
        int sumC = columnSum(arr, 0);
        if (sumR != sumC) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (sumR != rowSum(arr, i) || sumC != columnSum(arr, j)) {
                    return false;
                }
                for (int k = 0; k < arr.length; k++) {
                    if (j != k && arr[i][j] == arr[i][k] || i != k && arr[i][j] == arr[k][j]) {
                        return false;
                    }
                }
            }
        }
        return isSquare(arr) ? true : false;
    }

    /**
     * Checks to see if the array arr is square and contains each of the digits from 1 to n*n, e.g., 1, 2, ..., 16 for a 4 x 4 array.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a sequence, false otherwise.
     */
    public static boolean isSequence(int[][] arr) {
        //throw new UnsupportedOperationException();
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != n) {
                    return false;
                }
                n++;
            }
        }
        return true;
    }


}
