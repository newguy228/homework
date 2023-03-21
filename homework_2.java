public class homework_2 {
    public static void main(String[] args) {
        double t = 14000;
        double c = 1000;
        double s = 2500;
        double b = 0.05;
        int m = 0;
        while (c < t) {
            c = c + c * b;
            c = c + s;
            m++;
        }
        System.out.println("За " + m + " месяцев можно накопить на телескоп. Накоплено " + c + " монет");
    }
}


