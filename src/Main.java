import java.lang.*;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat curr = NumberFormat.getCurrencyInstance();
        String re= curr.format(1234567.98765);
        System.out.println(re);
        NumberFormat perc = NumberFormat.getPercentInstance();
        String res = perc.format(1234567.98765);
        System.out.println(res);
    }
}