public class MortgageCalculator {
    final private static byte MONTHS_IN_YEAR = 12;
    final private static byte PERCENT = 100;
    private  int principal;
    private  double annual;
    private  int period;
    public MortgageCalculator(int principal, double annual, int period) {
        this.principal = principal;
        this.annual = annual;
        this.period = period;
    }
    public void paymentSchedule() {

        double monthly = getMonthly();
        int numberOfPayments = getNumberOfPayments();
        for (int i = 1; i <= period * 12; i++) {
            double balance = principal * (Math.pow(1 + monthly, numberOfPayments) - Math.pow(1 + monthly, i)) / (Math.pow(1 + monthly, numberOfPayments) - 1);
            String balanceFormatted = String.format("%.2f", balance);
            System.out.println("$" + balanceFormatted);
        }
    }

    public  double calculatorMortgage() {
        double monthly = getMonthly();
        int numberOfPayments = getNumberOfPayments();
        double mortgage= principal * (monthly * Math.pow(1 + monthly, numberOfPayments) / (Math.pow(1 + monthly, numberOfPayments) - 1));
        String mortgageFormatted = String.format("%.2f", mortgage);
        return Double.parseDouble(mortgageFormatted);
    }

    private int getNumberOfPayments() {
        return period * MONTHS_IN_YEAR;
    }

    private double getMonthly() {
        return annual / MONTHS_IN_YEAR / PERCENT;
    }



    public int getPeriod() {
        return period;
    }
}
