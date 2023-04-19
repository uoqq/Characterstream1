package byteStrams1;

public class lab01 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();

        Rectangle rectangle = new Rectangle();
        RedShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();

    }
}
