public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Сумма кредита: 1000000   Срок кредитования 1 год   Процентная ставка 9.99%");
        System.out.println("Ежемесячный платеж составляет: " + service.calculate(1000000, 1, 9.99));
        System.out.println( );
        System.out.println("Сумма кредита: 1000000   Срок кредитования 2 года   Процентная ставка 9.99%");
        System.out.println("Ежемесячный платеж составляет: " + service.calculate(1000000, 2, 9.99));
        System.out.println();
        System.out.println("Сумма кредита: 1000000   Срок кредитования 3 года   Процентная ставка 9.99%");
        System.out.println("Ежемесячный платеж составляет: " + service.calculate(1000000, 3, 9.99));
    }
}
