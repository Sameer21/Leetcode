public class leetcode_74 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}

        };
        int target = 13;
    }

    static boolean searchMatrix(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target) {
                    return true;
                }
                
            }
        }
        return false;
    }

}

