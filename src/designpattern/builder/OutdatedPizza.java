package designpattern.builder;

public class OutdatedPizza {

    private String crustType;
    private String sauceType;
    private int sizeInInches;
    private boolean isVegetarian;
    private String[] toppings;

    public OutdatedPizza(String crustType, String sauceType, int sizeInInches, boolean isVegetarian, String[] toppings) {
        this.crustType = crustType;
        this.sauceType = sauceType;
        this.sizeInInches = sizeInInches;
        this.isVegetarian = isVegetarian;
        this.toppings = toppings;
    }

    public OutdatedPizza() {
    }

    public String getCrustType() {
        return crustType;
    }

    public OutdatedPizza setCrustType(String crustType) {
        this.crustType = crustType;
        return this;
    }

    public String getSauceType() {
        return sauceType;
    }

    public OutdatedPizza setSauceType(String sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    public int getSizeInInches() {
        return sizeInInches;
    }

    public OutdatedPizza setSizeInInches(int sizeInInches) {
        this.sizeInInches = sizeInInches;
        return this;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public OutdatedPizza setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
        return this;
    }

    public String[] getToppings() {
        return toppings;
    }

    public OutdatedPizza setToppings(String[] toppings) {
        this.toppings = toppings;
        return this;
    }
}
