package java_inheritance;

class Bicycle {

    protected int gear;
    protected int speed;

    //base constructor

    public Bicycle(int startGear, int startSpeed){
        this.gear = startGear;
        this.speed = startSpeed;
    }

    //methods

    public void setGear(int initialGear){
        this.gear = initialGear;
    }

    public void applyBrake(int reduceSpeed){
        this.speed -= reduceSpeed;
    }

    public void accelerate(int addSpeed){
        this.speed += addSpeed;
    }

}
