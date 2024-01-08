package inheritance;

public class Employee {
    private int income;
    private String name;

    public int getIncome() {
        return income;
    }

    public Employee setIncome(int income) {
        this.income = income;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

   protected int calculateBonus() {
        return 0;
    }

    protected void printCode(){}
}
