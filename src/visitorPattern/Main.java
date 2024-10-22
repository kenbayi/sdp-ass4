package visitorPattern;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        drawing.addShape(new Circle(5));
        drawing.addShape(new Rectangle(4, 6));

        AreaCalculator areaCalculator = new AreaCalculator();
        drawing.calculateAreas(areaCalculator);
    }
}
