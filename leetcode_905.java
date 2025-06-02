import java.util.Arrays;

public class leetcode_905 {
    public static void main(String[] args) {
        int[] sample = {1, 2, 3, 4};
        int[] solution = solution(sample);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] arr) {
        int[] sarr = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sarr[evenIndex++] = arr[i];
            } else {
                sarr[oddIndex--] = arr[i];
            }
        }

        return sarr;
    }
}
