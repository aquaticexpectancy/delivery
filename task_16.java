public class task_16 {
    public static void getSeason(int num) {
        String result = "";
        switch (num) {
            case 1:
                result = "Зима";
                break;
            case 2:
                result = "Весна";
                break;
            case 3:
                result = "Літо";
                break;
            case 4:
                result = "Осінь";
                break;
            default:
                result = "некорректне значення";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        getSeason(1);  // Может принимать значения 1, 2, 3 или 4
    }
}
