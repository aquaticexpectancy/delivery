public class task_11 {
    public static void check(int a) {


        if ( a > 0 && a < 5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        check(5);
        check(0);
        check(-3);
        check(2);
    }
}