/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

/**
 *
 * @author hv
 */
public class LinearEquation {

    public double a;
    public double b;
    public final double GREATESTVALUE = 999999;
    public final double LEASTVALUE = -999999;

    public LinearEquation() {
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

    public double getGREATESTVALUE() {
        return GREATESTVALUE;
    }

    public double getLEASTVALUE() {
        return LEASTVALUE;
    }

    /* Function find root of linear Equation
    ---Input: integer a, b
    ---Output: root of linear Equation
    */
    public double findRoot() {
        double root = 0;
        if (a == 0) {
            if (b == 0) {
                root = GREATESTVALUE;
            } else {
                root = LEASTVALUE;
            }
        } else {
            root = -b / a;
        }
        return root;
    }
}
