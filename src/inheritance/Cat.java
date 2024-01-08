package inheritance;

public class Cat extends Animal {
    private int meowPower;

    public int getMeowPower() {
        return meowPower;
    }

    public Cat setMeowPower(int meowPower) {
        this.meowPower = meowPower;
        return this;
    }

    @Override
    void eat() {
        System.out.println("cat is eating");
    }
}
