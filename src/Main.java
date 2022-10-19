public class Main {
    public static void main(String[] args) {
        float interest = 9.99F;
        int loan = 1_000_000;
        int period;
        int result;
        CreditPaymentService service = new CreditPaymentService();

        period = 12;
        result = service.calculate(loan, period, interest);
        System.out.println(result);

        period = 24;
        result = service.calculate(loan, period, interest);
        System.out.println(result);

        period = 36;
        result = service.calculate(loan, period, interest);
        System.out.println(result);
    }
}