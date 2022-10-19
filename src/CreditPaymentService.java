public class CreditPaymentService {
    public int calculate(int loan, int period, float interest) {
        float monthlyRate = interest / 12 / 100;
        double numerator = Math.pow((1 + monthlyRate), period);
        double denominator = Math.pow((1 + monthlyRate), period) - 1;
        double multiplier = monthlyRate * (numerator / denominator);
        return (int) Math.floor(multiplier * loan);
    }
}
