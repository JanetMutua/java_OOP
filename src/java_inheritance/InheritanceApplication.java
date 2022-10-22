package java_inheritance;

class InheritanceApplication {
    public static void main(String[] args) {
        MountainBike yeezy = new MountainBike(24, 2, 45);
        System.out.println("Seat height " + yeezy.seatHeight);
        System.out.println("Gear " + yeezy.gear);
        System.out.println("Initial speed " + yeezy.speed);
        yeezy.accelerate(23);
        System.out.println("Accelerate now! " + (yeezy.speed));
        yeezy.applyBrake(18);
        System.out.println("Reduce speed Jeremy! " + yeezy.speed);

    }

}
