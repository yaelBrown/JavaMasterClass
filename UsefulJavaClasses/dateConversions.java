import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class dateConversions {

    public static void main(String[] args) {

//        Date now = new Date();
//        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        System.out.println("sdf.format(a) = " + sdf.format(now));

        Date utilDate = new java.util.Date();
        Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println("utilDate:" + utilDate);
        System.out.println("sqlDate:" + sqlDate);


    }

}
