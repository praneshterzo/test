import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principle : ");
        int principle = sc.nextInt();
        System.out.print("\nRate of interest : ");
        float rateOfInterest = sc.nextFloat()/100/12;
        System.out.print("\nno. of years : ");
        int noOfYears = sc.nextInt()*12;
        double mortgage = ( principle * rateOfInterest * Math.pow( (1+rateOfInterest), noOfYears))/(Math.pow((1+rateOfInterest), noOfYears) - 1);
        System.out.println("Mortgage : "+mortgage);
        int a=(int)(Math.random()*75);
        if(a>20){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        boolean res = a>50;
        String s = a>50 ? "It is more thn 50" : "it is less than 50";
        System.out.println(s);
    }
}