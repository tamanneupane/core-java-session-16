package designpattern.builder;

public class Pizza {
    private String crustType;
    private String sauceType;
    private int sizeInInches;
    private boolean isVegetarian;
    private String[] toppings;


    private Pizza(Builder builder) {
        crustType = builder.crustType;
        sauceType = builder.sauceType;
        sizeInInches = builder.sizeInInches;
        isVegetarian = builder.isVegetarian;
        toppings = builder.toppings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private String crustType;
        private String sauceType;
        private int sizeInInches;
        private boolean isVegetarian;
        private String[] toppings;


        public Builder crustType(String crustType) {
            this.crustType = crustType;
            return this;
        }

        public Builder sauceType(String sauceType) {
            this.sauceType = sauceType;
            return this;
        }

        public Builder sizeInInches(int sizeInInches) {
            this.sizeInInches = sizeInInches;
            return this;
        }

        public Builder toppings(String[] toppings) {
            this.toppings = toppings;
            return this;
        }

        public Builder vegetarian(boolean vegetarian) {
            isVegetarian = vegetarian;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
