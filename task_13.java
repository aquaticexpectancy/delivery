public class task_13 {
    public static void check(int a, int b) {


        if ( a <= 1 && b >= 3) {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }
    }

    public static void main(String[] args) {
        check(1,3);
        check(0,6);
        check(3,5);
    }
}