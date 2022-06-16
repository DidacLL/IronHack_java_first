import java.util.Random;

public class RandCalc {
    public static void main(String[] args) {
        Random rand = new Random();
        String winner;
        int even=0;
        int odd=0;
        for(int i=0;i<100;i++){
            if (rand.nextInt() % 2 == 0) even++;
            else odd++;
        }
        winner=even>=odd?"even":"odd";
        System.out.println(even+ " even(head), "+ odd+" odd(tail)");
        System.out.println(winner + " Win!");
    }

}
