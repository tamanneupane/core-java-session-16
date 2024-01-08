package inheritance;

public class Dog extends Animal {


    public Dog(String name, int age) {
        super(name, age);
    }

    private int barkingPower;

    public int getBarkingPower() {
        return barkingPower;
    }

    public Dog setBarkingPower(int barkingPower) {
        this.barkingPower = barkingPower;
        return this;
    }

//    @Override
//    void walk() {
//        System.out.println("dog is walking");
//    }

}
