public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Quad("Quad");
        shape.print();

        shape = new Circle("Circle");
        shape.print();

        shape = new Oval("Oval");
        shape.print();

        shape = new Triangle("Triangle");
        shape.print();

        shape = new Rectangle("Rectangle");
        shape.print();

    }
}
