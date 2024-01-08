package designpattern.builder;

public class Car {
    private String make;
    private String model;
    private int year;
    private double mileage;
    private boolean isElectric;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.mileage = builder.mileage;
        this.isElectric = builder.isElectric;
    }


//    public void setMake(String make) {
//        this.make = make;
//    }


    //    private boolean isAllWheelDrive;
//
//    private boolean isAutomatic;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String make;
        private String model;
        private int year = 2023;
        private double mileage = 1000;
        private boolean isElectric = false;


        public Builder make(String make) {
            this.make = make;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }


        public Builder year(int year) {
            this.year = year;
            return this;
        }


        public Builder mileage(double mileage) {
            this.mileage = mileage;
            return this;
        }

        public Builder electric(boolean electric) {
            isElectric = electric;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }


}
