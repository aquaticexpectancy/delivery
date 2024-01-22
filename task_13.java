public class task_13 {
    public static void check(int a) {


        if ( a == 1 || a < 1) {
            System.out.println(a + 7.0);
        } else {
            System.out.println(a / 10.0);
        }
    }

    public static void main(String[] args) {
        check(5);
        check(0);
        check(-3);
        check(2);
    }
}