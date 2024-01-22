public class task_14 {
    public static void check(int a, int b) {


        if ( a > 1 && a < 11 || b >= 6 && b < 14) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        check(1,3);
        check(0,6);
        check(3,5);
    }
}