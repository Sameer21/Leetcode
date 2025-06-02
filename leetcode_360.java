import java.util.Arrays;
import java.util.Scanner;

public class leetcode_360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values of a, b, and c separated by space:");
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);

        System.out.println("Enter the array elements separated by space:");
        String[] arrInputs = scanner.nextLine().split(" ");
        int[] arr = new int[arrInputs.length];
        for (int i = 0; i < arrInputs.length; i++) {
            arr[i] = Integer.parseInt(arrInputs[i]);
        }

        int[] result = sam(arr, a, b, c);
        System.out.println("The sorted array is:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] sam(int[] arr, int a, int b, int c) {
        int[] s = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int d = a * arr[i] * arr[i] + b * arr[i] + c;
            s[i] = d; // store the output of d in array s
        }
        Arrays.sort(s); // sort the array s
        return s;
    }
}