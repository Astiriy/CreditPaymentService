public class CreditPaymentService {
    public int calculate(int sum, int years, double percent) {
        double monPercent = percent / 100 / 12;
        int months = (years * 12);
        int result = ((int) (sum * (monPercent + (monPercent / (Math.pow(1 + monPercent, months) - 1)))));
        return result;
    }
}
