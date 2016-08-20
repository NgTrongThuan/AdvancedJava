/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise5;

import Exercise3.Point;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version 1
 * class rectangle
 */
public class Rectangle {
    Point A;
    Point C;

    public Rectangle() {
    }

    public Rectangle(Point A, Point C) {
        this.A = A;
        this.C = C;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point A) {
        this.A = A;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point C) {
        this.C = C;
    }
    
    /**
     * function get height of rectangle
     * output: height of rectangle as double type
     */
    public double getHeight(){
        double height = Math.abs(this.A.getX() - this.C.getX());
        return height;
    }
    
    /**
     * function get weight of rectangle
     * output: weight of rectangle as double type
     */
    public double getWeight() {
        double weight = Math.abs(this.A.getY() - this.C.getY());
        return weight;
    }
    
    /**
     * function find perimeter of rectangle
     * output: perimeter of rectangle as double
     */
    public double calculatePerimeter(){
        double perimeter = (this.getHeight() + this.getWeight()) * 2;
        return perimeter;
    }
    
    /**
     * function find area of rectangle
     * output: area of rectangle as type double
     */
    public double calculateArea(){
        double area = this.getHeight() * this.getWeight();
        return area;
    }
}
