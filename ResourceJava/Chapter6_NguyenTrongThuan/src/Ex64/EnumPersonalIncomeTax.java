package Ex64;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 14/09/2016
 * @version 1 
 * ------------------------- 
 * Create e number PersonalIncomeTax
 */
public enum EnumPersonalIncomeTax {

    RATE1(5000000, 0.05, 250000),
    RATE2(10000000, 0.1, 500000),
    RATE3(18000000, 0.15, 1200000),
    RATE4(32000000, 0.2, 2800000),
    RATE5(52000000, 0.25, 5000000),
    RATE6(80000000, 0.3, 8400000),
    RATE7(0, 0.35, 0);

    private double salaryTax;
    private double taxRate;
    private double maxOfTax;

    private EnumPersonalIncomeTax(double salaryTax, double taxRate, double maxOfTax) {
        this.salaryTax = salaryTax;
        this.taxRate = taxRate;
        this.maxOfTax = maxOfTax;
    }

    public double getSalaryTax() {
        return salaryTax;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getMaxOfTax() {
        return maxOfTax;
    }
    /**
     * 
     * Function calculate Personal Income Tax
     * Input: salaryTax
     * Output: Personal Income Tax as double
     */
    public double calculatePersonalIncomeTax(double salaryTax) {
        double result = 0;
        switch (this) {
            case RATE1:
                result = salaryTax * RATE1.getTaxRate();
                break;
            case RATE2:
                result = (salaryTax - RATE1.getSalaryTax()) * RATE2.getTaxRate()
                        + RATE1.getMaxOfTax();
                break;
            case RATE3:
                result = (salaryTax - RATE2.getSalaryTax()) * RATE3.getTaxRate()
                        + RATE2.getMaxOfTax() + RATE1.getMaxOfTax();
                break;
            case RATE4:
                result = (salaryTax - RATE3.getSalaryTax()) * RATE4.getTaxRate()
                        + RATE3.getMaxOfTax() + RATE2.getMaxOfTax() + RATE1.getMaxOfTax();
                break;
            case RATE5:
                result = (salaryTax - RATE4.getSalaryTax()) * RATE5.getTaxRate()
                        + RATE4.getMaxOfTax() + RATE3.getMaxOfTax() + RATE2.getMaxOfTax()
                        + RATE1.getMaxOfTax();
                break;
            case RATE6:
                result = (salaryTax - RATE5.getSalaryTax()) * RATE6.getTaxRate()
                        + RATE5.getMaxOfTax() + RATE4.getMaxOfTax() + RATE3.getMaxOfTax()
                        + RATE2.getMaxOfTax() + RATE1.getMaxOfTax();
                break;
            case RATE7:
                result = (salaryTax - RATE6.getSalaryTax()) * RATE7.getTaxRate()
                        + RATE6.getMaxOfTax() + RATE5.getMaxOfTax() + RATE4.getMaxOfTax()
                        + RATE3.getMaxOfTax() + RATE2.getMaxOfTax() + RATE1.getMaxOfTax();
                break;
        }
        return result;
    }
}