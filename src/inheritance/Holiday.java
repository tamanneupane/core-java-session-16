package inheritance;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Holiday extends GregorianCalendar {


    public Holiday() {
        super(2023, Calendar.DECEMBER, 25);
    }

    public boolean isHoliday() {
        return get(Calendar.DAY_OF_MONTH) == Calendar.getInstance().get(DAY_OF_MONTH);
    }
}
