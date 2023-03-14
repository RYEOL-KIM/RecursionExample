import java.util.Arrays;

public class Solution9 {
    public static void main(String[] args) {
        String result = Arrays.toString(take(3, new int[]{1,2,3,4}));
        System.out.println(result);
    }

    public static int[] take(int num, int[] arr) {
        if(num >= arr.length) {
            return arr;
        }

        if(num == 0 || arr.length == 0) {
            return new int[]{};
        }

        int[] tail = Arrays.copyOfRange(arr, 0, arr.length -1);

        return take(num, tail);
    }
}
