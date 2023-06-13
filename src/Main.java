import java.lang.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principle : ");
        int principle = sc.nextInt();
        while(principle<1000 || principle>1_000_000){
            System.out.println("Enter amount between the range $1,000 to $1m");
            System.out.print("Principle : ");
            principle = sc.nextInt();
        }
        System.out.print("\nRate of interest : ");
        float rateOfInterest = sc.nextFloat();
        while(rateOfInterest<0 || rateOfInterest>10){
            System.out.println("Enter value between the range 0.1 to 10");
            System.out.print("\nRate of interest : ");
            rateOfInterest = sc.nextFloat();
        }
        rateOfInterest=rateOfInterest/100/12;
        System.out.print("\nno. of years : ");
        int noOfYears = sc.nextInt();
        while(noOfYears<1|| noOfYears>30){
            System.out.println("Enter value between the range 1 to 30");
            System.out.print("\nno. of years : ");
            noOfYears = sc.nextInt();
        }
        noOfYears=noOfYears*12;
        double mortgage = ( principle * rateOfInterest * Math.pow( (1+rateOfInterest), noOfYears))/(Math.pow((1+rateOfInterest), noOfYears) - 1);
        System.out.println("\nMortgage : "+mortgage);
    }
}