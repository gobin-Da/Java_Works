import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currentTime = time.format(timeFormat);
        System.out.println(currentTime);
    }
}
