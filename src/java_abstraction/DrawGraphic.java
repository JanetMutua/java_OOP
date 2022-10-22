package java_abstraction;

public abstract class DrawGraphic {
    int x, y; //accessible by all child classes.

    //constructor

    DrawGraphic(){
        System.out.println("Hi Janny");
    }

    // concrete method
    void makeDrawing(int xAxis, int yAxis){
        System.out.println("Make a drawing with x-axis as " +x+ "and y-axis as " + y);
    }
    //abstract methods
    abstract void draw();
    abstract void measure();
}
