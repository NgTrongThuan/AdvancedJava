/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4;

import Exercise3.Line;
import Exercise3.Point;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version 1 class circle
 */
public class Circle {

    private Point pointO;
    private Point pointR;
    final double PI = 3.14;

    public Circle() {
    }

    public Circle(Point pointO, Point pointR) {
        this.pointO = pointO;
        this.pointR = pointR;
    }

    public Point getPointO() {
        return pointO;
    }

    public void setPointO(Point pointO) {
        this.pointO = pointO;
    }

    public Point getPointR() {
        return pointR;
    }

    public void setPointR(Point pointR) {
        this.pointR = pointR;
    }

    
    /**
     * function calculate radius of Circle
     * Output: radius of circle
     */
    
    public double calculateRadius(){
        Line l = new Line();
        l.setFirstPoint(pointO);
        l.setSecondPoint(pointR);
        return l.calculateDistance();
    }
    /**
     * Function find Perimeter of circle Output: return Perimeter of circle as
     * double type
     */
    public double calculatePerimeter() {      
        return this.calculateRadius() * 2 * PI;
    }

    /**
     * function find area of circle output: return area of circle as type double
     */
    public double calculateArea() {
        return PI * Math.pow(this.calculateRadius(), 2);
    }
}
