import java.util.Objects;

public class Main {
    public static void a(String test) {
        String a = "test";
        if (Objects.equals(a, test)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
    public static void main(String[] args)  {
        a("test");
        a("тест");
        a("3");





    }


}
