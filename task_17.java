public class task_17 {
    public static void determineDecade(int day) {
        if (day >= 1 && day <= 31) {
            int decade = (day - 1) / 10 + 1;
            System.out.println("Число " + day + " попадає в " + decade + " декаду місяца.");
        } else {
            System.out.println("номер між 1-31 будь ласка");
        }
    }

    public static void main(String[] args) {
        determineDecade(15);
    }
}
