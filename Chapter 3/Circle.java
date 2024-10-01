public class Circle {
    public double radius;
    public double diameter;
    public double area;

    public Circle() {
        this.radius = 1;
        calDiameterAndArea();
    }

    public void setRadius(double rad) {
        radius = rad;
        calDiameterAndArea();
    }

    private void calDiameterAndArea() {
        diameter = 2 * radius; 
        area = Math.PI * radius * radius;    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}
