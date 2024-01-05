public class ShapeFactory {
    public static Shape getShape(ShapeEnum shapeEnum){
        return switch (shapeEnum.getDescizione()) {
            case "Cerchio" -> new Cerchio();
            case "Rettangolo" -> new Rettangolo();
            case "Triangolo" -> new Triangolo();
            default -> null;
        };
    }
}
