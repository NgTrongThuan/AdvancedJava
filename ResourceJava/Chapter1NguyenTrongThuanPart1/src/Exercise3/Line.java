package Exercise3;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version 1
 * create class line
 */
public class Line {
    private Point firstPoint;
    private Point secondPoint;

    public Line() {
    }

    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }
    
    /**
     * function calculate distance 2 points
     * output: return distance between 2 points
     */ 
    public double calculateDistance(){
        double distance = Math.sqrt(Math.pow(this.getFirstPoint().getX() - this.getSecondPoint().getX(), 2) 
                + Math.pow(this.getFirstPoint().getY() - this.getSecondPoint().getY(), 2));
        return distance;
    }
}
