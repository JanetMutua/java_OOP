package java_interface;

public class ImplementationInterface {

    public static void main(String[] args) {
        MountainBikeInterface newBike = new MountainBikeInterface(450, 34);

        System.out.println("My bike speed is: " + newBike.getSpeed());
        System.out.println("My bike seat height: " + newBike.getSeatHeight());

        //accelerate

        newBike.accelerate(70);
        System.out.println("New speed: "+ newBike.getSpeed());
        newBike.setSeatHeight(67);
        System.out.println("Set seat height to: " + newBike.getSeatHeight());

    }
}
