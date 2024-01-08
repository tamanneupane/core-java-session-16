package learninterface;

public class Pizza {


    public Pizza() {

    }

    public static class PizzaMaker {
        String name;
        int price;

        public PizzaMaker(String name, int price) {
            this.name = name;
            this.price = price;
        }

        private void makePizza() {
            System.out.println("Making pizza  of " + name + " and of price " + price);
        }
    }
}
