package inheritance;

public class Manager extends Employee {
    String managerCode;
//    @Override
//    public int calculateBonus() {
////        return (int) (super.getIncome() * 0.20) + 100;
//        return super.getIncome();
//    }


    @Override
    public void printCode() {
        System.out.println("MANGER CODE IS : " + this.managerCode);
    }
}
