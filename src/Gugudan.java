public class Gugudan {

    public static void main(String[] args) {
        int level = 2;
        Gugudan1(2);
        System.out.println();
        Gugudan2(2,1);
    }

    public static void Gugudan1(int level) {

        for(int count = 1; count < 10; count++)
            System.out.printf("%d x %d = %d\n", level, count, level * count);
    }

    public static void Gugudan2(int level, int count) {

        if(count > 9) {
            return;
        }

        System.out.printf("%d x %d = %d\n", level, count, level * count);
        Gugudan2(level, ++count);
    }
}
