import java.util.Arrays;

public class Solution12 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = new Solution12().reverseArr(arr);
        System.out.println(Arrays.toString(result));
    }
    public int[] reverseArr(int[] arr){
        // TODO:
        // 빈 배열은 빈 배열 리턴
        // System.arraycopy(원본배열,복사시작인덱스,새배열,붙여넣기시작인덱스,복사갯수)
        // 배열 마지막 요소 + [제외한 나머지 배열] -> 길이가 0되면 빈배열

        if (arr.length == 0) {
            return new int[]{};
        }

        int[] head = Arrays.copyOfRange(arr, arr.length -1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length - 1));

        int[] merge = new int[arr.length];

        System.arraycopy(head, 0, merge, 0, 1);
        System.arraycopy(tail, 0, merge, 1, tail.length);

        return merge;

    }

}