import java.lang.*;

public class Main {
    public static void main(String[] args) {
        final float pi = 3.14F;
        float r = 5.43F;
        double d = r+2*pi;
        int x = (int)d;
        String s = "10.0";
        System.out.println(x);
        System.out.println(Double.parseDouble(s));
    }
}