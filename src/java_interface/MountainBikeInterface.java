package java_interface;

public class MountainBikeInterface implements BicycleInterface{
    // properties

    //applying encapsulation using private and getters and setters
    private int bikeSpeed;
    private int seatHeight;

    // constructor
    public MountainBikeInterface(int bikeSpeed, int seatHeight){
        this.bikeSpeed = bikeSpeed;
        this.seatHeight = seatHeight;
    }

    //calling the interface methods from the parent class
    @Override
    public void accelerate(int addSpeed) {
        bikeSpeed += addSpeed;
    }
    @Override
    public void addBrake(int reduceSpeed) {
        bikeSpeed -= reduceSpeed;
    }

    //getters and setters

    public int getSpeed(){
        return bikeSpeed;
    }

    public void setSpeed(int newSpeed){
        this.bikeSpeed = newSpeed;
    }

    public int getSeatHeight(){
        return seatHeight;
    }

    public void setSeatHeight(int newSeatHeight){
        this.seatHeight = newSeatHeight;
    }
}
