import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Age : ");
        int age = sc.nextInt();
        System.out.println("you are "+age);
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.println("you are "+name);
    }
}