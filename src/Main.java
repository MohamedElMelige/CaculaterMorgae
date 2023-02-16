import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int principal = (int) readNumber("Principal :", 1000, 1_000_000);
        float annual = (float) readNumber("Annual Interest Rate :", 1, 30);
        int period = (int) readNumber("Period (Years) :", 1, 30);
        double mortgage=caculaterMorgae(principal, annual, period);
        String mortgageFormatted = String.format("%.2f", mortgage);
        System.out.println("MORTGAGE");
        System.out.println("--------------------");
        System.out.println("MONTHLY PAYMENTS: $" + mortgageFormatted);
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("--------------------");
        for (int i = 1; i <= period * 12; i++)
            paymentSchedule(principal, annual, period);
        }
        public static void paymentSchedule(int principal, double annual, int period) {
            final byte MONTHS_IN_YEAR = 12;
            final byte PERCENT = 100;
            double monthly = annual / MONTHS_IN_YEAR / PERCENT;
            int numberOfPayments = period * MONTHS_IN_YEAR;
            for (int i = 1; i <= period * 12; i++) {
                double balance = principal * (Math.pow(1 + monthly, numberOfPayments) - Math.pow(1 + monthly, i)) / (Math.pow(1 + monthly, numberOfPayments) - 1);
                String balanceFormatted = String.format("%.2f", balance);
                System.out.println("$" + balanceFormatted);
            }
        }
    public  static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
    public static double caculaterMorgae(int principal, double annual, int period) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        double monthly = annual / MONTHS_IN_YEAR / PERCENT;
        int numberOfPayments = period * MONTHS_IN_YEAR;
        return principal * (monthly * Math.pow(1 + monthly, numberOfPayments) / (Math.pow(1 + monthly, numberOfPayments) - 1));
    }
}