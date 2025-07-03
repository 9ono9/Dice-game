import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        int di = rand.nextInt(6) + 1;
        sum += di;
        System.out.println("Dic 1: " + di);
        di = rand.nextInt(6) + 1;
        sum += di;
        System.out.println("Dic 2: " + di);
        System.out.println("Total value: " + sum);
        if(sum > 7) {
            System.out.println("You won");
        } else {
            System.out.println("You lose");
        }
        
    }
}