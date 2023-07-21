public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        double percent = 9.99;
        System.out.println("1 год: " + (int) service.calculate(sum, percent, 12) + " рублей в месяц");
        System.out.println("2 года: "  + (int) service.calculate(sum, percent, 24) + " рублей в месяц");
        System.out.println("3 года: " + (int) service.calculate(sum, percent, 36) + " рублей в месяц");
    }
}
