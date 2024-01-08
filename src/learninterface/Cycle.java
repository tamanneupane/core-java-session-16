package learninterface;

public class Cycle implements EVehicle {
    private String name;
    private int speed;

    public String getName() {
        return name;
    }

    public Cycle setName(String name) {
        this.name = name;
        return this;
    }

    public int getSpeed() {
        return speed;
    }

    public Cycle setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating cycle");

    }
}
