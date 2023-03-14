public class Factorial {
    public static void main(String[] args) {
        int result = factorial2(5);

        System.out.println(result);
    }

    public static int factorial1(int number){
        int result = 1;
        for (int count = number; count > 0; count--) {
            result = result * count;
        }
        return result;
    }

    public static int factorial2(int number){
        if(number <= 1) {
            return 1;
        }
        return number * factorial2(number - 1);
    }
}
