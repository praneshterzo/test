import java.lang.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){//for loop
            System.out.println(i);
        }
        int[] array = {1, 2, 3, 4, 5, 6, 6};
        for(int i:array){//for-each loop
            System.out.println(i);
        }
        int i=0;
        while(i<10){//while
            System.out.println(i+" time");
            i++;
        }
        do{//do...while
            System.out.println("Time "+i);
            i++;
        } while(i>0);

        while(true){//runs forever
            System.out.println("hello");
            if(i==50){
                break;//break the loop
            }
            i+=1;
        }
    }
}