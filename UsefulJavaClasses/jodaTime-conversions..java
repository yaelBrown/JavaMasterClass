import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import static org.aspectj.bridge.Version.getTime;

public class test {
    // Must convert to date to Long in miliseconds
    private static String formatDate(Long d) {
        DateTime dt = new DateTime(d);

        // Change the string for the pattern to convert to date.
        // https://www.joda.org/joda-time/key_format.html
        DateTimeFormatter fmt = DateTimeFormat.forPattern("MMM dd, yyyy");

        return dt.toString(fmt);
    }

    public static void main(String[] args) {

        Long exampleDate = getTime();

        System.out.println("exampleDate = " + exampleDate);
        System.out.println("formatDate(exampleDate) = " + formatDate(exampleDate));
    }
}