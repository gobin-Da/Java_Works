import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateFormat {
    public static void main(String[] args) {
        Date date = new Date();

        DateFormat dateFormate = new SimpleDateFormat("dd/mm/yyyy");
        String currentDate = dateFormate.format(date);
        System.out.println("current date: "+currentDate);
    }
}
