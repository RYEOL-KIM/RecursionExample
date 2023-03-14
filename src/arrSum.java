import java.util.Arrays;

public class arrSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int result = arrSum(arr);
        System.out.println(result);
    }

    public static int arrSum(int[] arr) {

        if (arr.length == 0) return 0;

        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return arr[0] + arrSum(tail);
    }
}


