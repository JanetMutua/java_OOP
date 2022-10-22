package java_abstraction;

public class AbstractionImplementation {

    public static void main(String[] args) {
        DrawGraphic circle = new DrawCircle();
        circle.draw();
        circle.measure();
    }
}
