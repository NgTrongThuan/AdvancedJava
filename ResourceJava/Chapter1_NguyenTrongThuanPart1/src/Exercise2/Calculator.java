package Exercise2;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version 1
 * class operator + - * /
 */
public class Calculator {

    public double firstNumber;
    public double secondNumber;

    public Calculator() {
    }
    
    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    /* Function calculate add 2 numbers
     ---Output: a + b
     */

    public double calculateAddition() {
        return this.firstNumber + this.secondNumber;
    }

    /* Function calculate sub 2 numbers
     ---Output: a - b
     */
    public double calculateSubtraction() {
        return this.firstNumber - this.secondNumber;
    }

    /* Function calculate multi 2 numbers
     ---Output: a * b
     */
    public double calculateMultiplication() {
        return this.firstNumber * this.secondNumber;
    }

    /* Function calculate devise 2 numbers
     ---Output: a / b
     */
    public double calculateDevision() {
        if (this.secondNumber == 0) { // exception /0
            throw new ArithmeticException("devise for 0");
        }
        return this.firstNumber / this.secondNumber;
    }
}
