public class Main {
    public static void main(String[] args) {
        Shape cerchio = ShapeFactory.getShape(ShapeEnum.CERCHIO);
        Shape rettangolo = ShapeFactory.getShape(ShapeEnum.RETTANGOLO);
        Shape triangolo = ShapeFactory.getShape(ShapeEnum.TRIANGOLO);

        cerchio.draw();
        rettangolo.draw();
        triangolo.draw();
    }
}