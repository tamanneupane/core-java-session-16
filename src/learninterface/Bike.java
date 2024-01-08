package learninterface;

public class Bike extends PublicTransport implements Vehicle{
    private String name;
    private int speed;

    public String getName() {
        return name;
    }

    public Bike setName(String name) {
        this.name = name;
        return this;
    }

    public int getSpeed() {
        return speed;
    }

    public Bike setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    @Override
    int calculateFair() {
        return 0;
    }

    @Override
    public void startEngine() {
        System.out.println("starting bike");

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public void accelerate() {
        System.out.println("accelerating bike");
    }
}
