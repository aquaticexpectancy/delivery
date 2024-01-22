public class task_18 {
    public static void check(String a) {
        String firstChar = String.valueOf(a.charAt(0));
        if (firstChar.equals("a")) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }

    public static void main(String[] args) {
        check("abcde");
    }
}