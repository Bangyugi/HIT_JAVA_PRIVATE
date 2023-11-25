import java.sql.Date;
import java.text.SimpleDateFormat;

public class Lmao {
    public static void main(String[] args) {
        Date date = new Date(900);

        // Create a SimpleDateFormat object with the desired format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Format the Date object
        String formattedDate = sdf.format(date);

        // Print the formatted date
        System.out.println(formattedDate);
    }
}
