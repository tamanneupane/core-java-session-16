package array;

import java.util.Arrays;

public class YearlyExpenses {

    int[] expenses = new int[365];

    public void setExpenses(int expenses , int day) {
        this.expenses[day] = expenses;
    }

    public int getTotal(){
        return Arrays.stream(this.expenses).sum();
    }
}
