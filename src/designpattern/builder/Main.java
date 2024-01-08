package designpattern.builder;

public class Main {

    public static void main(String[] args) {

//        Car tesla = new Car("tesla", "23", 2023, 32, true, false, true);
//        Car tesla2 = new Car("tesla", "23", 2023, 32, true, true, true);
//        Car tesla3 = new Car("tesla", "23", 2023, 32, true, false, true);

//       new Car.Builder();
//        new Car(new Car.Builder());
        Car electric = Car.builder()
                .make("tesla")
                .mileage(23)
                .year(1230)
                .electric(true)
                .model("234")
                .build();

        Car engine = Car.builder()
                .make("toya")
                .model("123")
                .build();


        System.out.println(engine.getMake());
        System.out.println(engine.getModel());
        System.out.println(engine.isElectric());
        System.out.println(engine.getMileage());
        System.out.println(engine.getYear());

    }


//    public static void main(String[] args) {
//        OutdatedPizza outdatedPizza1 = new OutdatedPizza(null, "alfredo", 12, false, new String[]{"cheese", "mushroom"});
//
//        OutdatedPizza outdatedPizza2 = new OutdatedPizza();
//        outdatedPizza2.setCrustType("thick");
//        outdatedPizza2.setSauceType("alfredo");
//        outdatedPizza2.setSizeInInches(12);
//        outdatedPizza2.setVegetarian(false);
//        outdatedPizza2.setToppings(new String[]{"cheese", "mushroom"});
//
//
//        Pizza pizza = Pizza.builder().build();
//
//        Pizza pizza2 = Pizza.builder()
//                .sizeInInches(24)
//                .build();
//
//        Pizza pizza3 = Pizza.builder()
//                .sizeInInches(24)
//                .vegetarian(false)
//                .crustType("thin")
//                .toppings(new String[]{"cheese", "mushroom"})
//                .build();
//    }
}
