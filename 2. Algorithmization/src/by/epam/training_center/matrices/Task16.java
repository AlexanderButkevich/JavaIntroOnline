package by.epam.training_center.matrices;

public final class Task16 {
    public static int[][] solution(int n) {
        if (n<3) {
            return null;
        }
        int[][] matrix = new int[n][n];

        if (n%2 != 0) {
            oddMagicSquare(matrix, 0);
        } else if (n%4 == 0) {
            doubleEvenMagicSquare(matrix);
        } else {
            singleEvenMagicSquare(matrix);
        }

        return matrix;
    }

    private static int[][] oddMagicSquare(int[][] matrix, int offset) {
        int size = matrix.length;
        int i = 0;
        int j = size / 2;
        int count = 0;
        while (++count <= size*size) {
            matrix[i][j] = count + offset;
            int nextI = i == 0 ? size-1 : i-1;
            int nextJ = j == size-1 ? 0 : j+1;
            if (matrix[nextI][nextJ] == 0) {
                i = nextI;
                j = nextJ;
            } else {
                i++;
            }
        }
        return matrix;
    }

    private static void singleEvenMagicSquare(int[][] matrix) {
        int size = matrix.length;
        int subSize = size/2;
        int step = subSize*subSize;

        insert(matrix, oddMagicSquare(new int[subSize][subSize], 0), 0,0);
        insert(matrix, oddMagicSquare(new int[subSize][subSize], step), subSize,subSize);
        insert(matrix, oddMagicSquare(new int[subSize][subSize], 2*step), 0,subSize);
        insert(matrix, oddMagicSquare(new int[subSize][subSize], 3*step), subSize, 0);

        sectSwap(matrix);
    }

    private static void doubleEvenMagicSquare(int[][] matrix) {
        int size = matrix.length;
        int maxNum = size*size;
        boolean flag = true;
        int count = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j==size/2 || (j==0 && i==size/2)) {
                    flag = !flag;
                }
                matrix[i][j] = flag ? count : maxNum - count + 1;
                count++; flag = !flag;
            }
        }
    }

    private static void insert(int[][] to, int[][] from, int i0, int j0) {
        for (int i = 0; i < from.length; i++) {
            System.arraycopy(from[i], 0, to[i + i0], j0, from[i].length);
        }
    }

    private static void sectSwap(int[][] matrix) {
        int size = matrix.length;
        int height = size/2;
        int width = height/2;
        int j = 0;
        while (j<size) {
            for (int i = 0; i < height; i++) {
                swap(matrix, i, j, i+height, j);
            }
            if (++j == width) {
                j = size-width+1;
            }
        }
        swap(matrix, width, 0, height+width, 0);
        swap(matrix, width, width, height+width, width);
    }

    private static void swap(int[][] matrix, int i0, int j0, int i1, int j1) {
        int swapInt = matrix[i0][j0];
        matrix[i0][j0] = matrix[i1][j1];
        matrix[i1][j1] = swapInt;
    }
}
