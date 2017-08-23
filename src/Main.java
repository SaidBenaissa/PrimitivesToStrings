import java.text.NumberFormat;

/**
 * Created by benaissa on 8/23/17.
 */
public class Main {
    public static void main(String [] args)
    {
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue = 10_000_000;
//        String fromLong = Long.toString(longValue);
//        System.out.println(fromLong);

//        In otherwise we can use the NumberFormat Class
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);


    }
}
