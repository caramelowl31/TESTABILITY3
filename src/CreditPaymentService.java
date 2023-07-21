public class CreditPaymentService {
    public double calculate(
            int sum,
            double percent,
            int months
    ) {
        double percentPerMonth = percent / 100 / months;

        return sum * (percentPerMonth + (percentPerMonth / (Math.pow(1 + percentPerMonth, months) - 1)));
    }
}
