package ua.cherednyk.hw5;

public class sxfds {
    public static void main(String[] args) {
        int[] array1 = {5, 4, 3, 2, 1};
        int[] array2 = {1, 2, 3, 4, 5};
        int[][] array3 = {
                {1, 3},
                {2, 1},
        };

        System.out.println(isDescending(array1));
        System.out.println(isDescending(array2));
        System.out.println(isDescending(array3));
    }

    public static boolean isDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDescending(int[][] array) {
        int totalElements = array.length * array[0].length;

        for (int i = 1; i < totalElements; i++) {
            int currentRow = i / array[0].length;
            int currentCol = i % array[0].length;
            int previousRow = (i - 1) / array[0].length;
            int previousCol = (i - 1) % array[0].length;

            if (array[currentRow][currentCol] > array[previousRow][previousCol]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
