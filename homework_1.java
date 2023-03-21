public class homework_1 {
    public static void main(String arg[]) {
        double p = 70;
        double s = 25;
        double d = 53;
        double c = 19;
        double t = 41;
        p = p * 0.77;
        s = s * 0.37;
        d = d * 0.44;
        t = t * 0.32;
        double sum = p + s + d + c + t;
        if (sum <= 312) {
            System.out.println("Нужно " + sum + " серебряных монет. Хватит на покупки");
        } else {
            System.out.println("Нужно " + sum + " серебряных монет. Не хватит на покупки");
        }
    }
}
