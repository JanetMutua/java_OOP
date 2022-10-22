package java_inheritance;

class MountainBike extends Bicycle{

    public int seatHeight;

    //child constructor

    public MountainBike(int seatHeight, int gear, int speed){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    //method

    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }

}
