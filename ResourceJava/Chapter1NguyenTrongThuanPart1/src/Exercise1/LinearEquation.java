/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version 1
 * class linear equation
 */
public class LinearEquation {
    double a;
    double b;

    public LinearEquation() {
    }

    public LinearEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    /* Function calculate root of linear Equation
    ---Input: integer a, b
    ---Output: root of linear Equation
    */
    public double calculateRoot() {
        double root = 0;
        if (this.a == 0) {
            if (this.b == 0) {
                root = Double.MAX_VALUE; // equation have more root is return a constant
            } else {
                root = Double.MIN_VALUE; // equation have not root is return a constant
            }
        } else {
            root = -this.b / this.a;
        }
        return root;
    }
}

