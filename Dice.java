import java.util.Random;
import java.util.Scanner;
public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        int di = rand.nextInt(6) + 1;
        sum += di;
        System.out.println("Dic 1: " + di);
        di = rand.nextInt(6) + 1;
        sum += di;
        System.out.println("Dic 2: " + di);
        System.out.println("Total value: " + sum);
        
    }
}