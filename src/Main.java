public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        double percent = 9.99;
        int months = 12;
        double payPerMonth = service.calculate(sum, percent, months);
        System.out.println((int) payPerMonth);
    }
}
