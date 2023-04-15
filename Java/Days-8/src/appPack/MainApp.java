package appPack;

public class MainApp {
    public static void main(String[] args) {

        Square square = new Square(4);

        Circle circle = new Circle();

        Triangle triangle = new Triangle();

        call(square);
        call(circle);
        call(triangle);

}
    public static void call(Drawing drawing){
        drawing.draw();
        if(drawing instanceof Square){
            Square square = (Square) drawing;
            square.action(10);
        }
    }
}
