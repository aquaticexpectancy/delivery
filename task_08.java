public class Main {
    public static void check(Object a) {
        if ("1".equals(String.valueOf(a))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        check("1");
        check(1);
        check(3);
    }
}
