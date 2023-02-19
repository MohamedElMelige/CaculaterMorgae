public class MortgageReport {
    private static MortgageCalculator calculator;
    public MortgageReport(MortgageCalculator calculator) {
        MortgageReport.calculator = calculator;
    }

    public void printCacluterMortgage() {
        System.out.println("MORTGAGE");
        System.out.println("--------------------");
        System.out.println("MONTHLY PAYMENTS: $" + calculator.calculatorMortgage());
    }


    public void printPaymentSchedule() {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("--------------------");
        calculator.paymentSchedule();
    }
}
