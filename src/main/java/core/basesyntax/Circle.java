package core.basesyntax;

public class Circle extends Figure implements Drawable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Color: " + super.getColor() + "\nRadius: " + radius);
    }
}
