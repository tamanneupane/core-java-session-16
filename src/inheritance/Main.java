package inheritance;

import generic.Generic;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.setName("tom");
//        cat.setAge(3);
//        cat.setMeowPower(10);
//        cat.walk();
//        cat.eat();
//
//
//        Dog dog = new Dog();
//        dog.setName("tommy");
//        dog.setAge(5);
//        dog.setBarkingPower(30);
//        dog.walk();
//        dog.eat();

        Dog dog = new Dog("tommy", 10);
//
//        System.out.println(dog.getName());
//        System.out.println(dog.getAge());

//        Manager manager = new Manager();
//        manager.setName("HARI");
//        manager.setIncome(1000);
//        System.out.println(manager.calculateBonus());
//
//        Manager manager2 = new Manager();
//        manager.setName("SAM");
//        manager.setIncome(2000);
//        System.out.println(manager2.calculateBonus());
//
//        Staff staff = new Staff();
//        staff.setName("RAM");
//        staff.setIncome(200);
//        System.out.println(staff.calculateBonus());

//        Employee manager = new Manager();
//        manager.setName("HARI");
//        manager.setIncome(1000);
//        System.out.println(manager.calculateBonus());
//
////
////        Employee manager2 = new Manager();
////        manager.setName("SAM");
////        manager.setIncome(2000);
////        System.out.println(manager2.calculateBonus());
////
////        Employee staff = new Staff();
////        staff.setName("RAM");
////        staff.setIncome(200);
////        System.out.println(staff.calculateBonus());
////        Employee ram = new Employee();
////        ram.setIncome(200);
////
////        Employee hari = new Manager();
////        hari.setIncome(2000);
////
////        Employee rami = new Staff();
////        rami.setIncome(2000);
////
//        Manager boss = new Manager();
//
//        boss.setName("boss");
//        boss.setIncome(1000000);
//        boss.managerCode = "12"; //OK
//
//
////        Employee manger = new Manager();
////        Employee staff = new Staff();
////
////
////        Number integer = new Integer(1);
////        Number floating = new Float(1);
////        Object integer = new Integer(1);
////        Object floating = new Float(1);
//
//        Manager manger = new Manager();
//        manger.setName("ram");
//        manger.managerCode = "Asdfa";
//
//
//        Employee staff = new Staff();
//        staff.setName("sam");
//
//        Object manger1 = new Manager();
//
//        Manager manager2 = (Manager) manger1;
//        manager2.managerCode = "Asdf";
//        manager2.setName("Adsf");
//        manager2.calculateBonus();

//        Object staff1 = new Staff();


//
//        Employee[] staff = new Employee[3];
//        staff[0] = boss;
//        Manager[] staff = new Manager[3];
//        staff[0] = boss;
//        staff[0].managerCode = ":1324";

//
//        if (ma is of type 1) action 1 (ma);
//else if (ma is of type 2) action 2 (ma);
        Manager manager = new Manager();
//        manager.managerCode = "1234sfdg2";

        Employee staff = new Staff();

        staff = manager;

//        staff.staffCode = "dafsd23";

        Generic<Manager> managerGeneric = new Generic<>();
        Generic<Employee> staffGeneric = new Generic<>();


//        staffGeneric = managerGeneric;

//
        printCode(staff);
        printCode(manager);
        Holiday christmas = new Holiday();

        System.out.println(christmas.isHoliday());

//        christmas.add(Calendar.DAY_OF_MONTH,10);

        System.out.println(christmas.isHoliday());

    }

    public static void printCode(Employee employee) {
        employee.printCode();
    }
}
