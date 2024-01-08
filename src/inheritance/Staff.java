package inheritance;

public class Staff extends Employee{
    String staffCode;
    @Override
    public void printCode() {
        System.out.println("STAFF CODE IS : " + this.staffCode);
    }
}
