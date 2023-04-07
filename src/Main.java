public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal :", 1000, 1_000_000);
        float annual = (float) Console.readNumber("Annual Interest Rate :", 1, 30);
        int period = (int) Console.readNumber("Period (Years) :", 1, 30);
        var calculator = new MortgageCalculator(principal, annual, period);
        var report = new MortgageReport(calculator);
        report.printCacluterMortgage();
        report.printPaymentSchedule();
    }
}