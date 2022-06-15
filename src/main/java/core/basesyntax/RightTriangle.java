package core.basesyntax;

public class RightTriangle extends Figure implements Drawable {

    private double side;

    public RightTriangle(Colors color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side * Math.sqrt(3) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Color: " + super.getColor() + "\nSide: " + side);
    }
}
