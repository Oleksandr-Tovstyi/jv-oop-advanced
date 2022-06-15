package core.basesyntax;

public class Square extends Figure implements Drawable {
    private double side;

    public Square(Colors color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Color: " + super.getColor() + "\nSide: " + side);
    }
}
