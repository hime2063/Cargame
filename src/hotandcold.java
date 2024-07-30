import java.util.Scanner;

public class hotandcold {
    public static void main(String[] args) {
        int ans = 99;
        int guess1;
        int diff;
        System.out.println("Guess a number");
        Scanner sc = new Scanner(System.in);
        guess1 = sc.nextInt();
        if(guess1 == ans){
            System.out.println("Correct guess");
        }
        else{
            while(guess1 != ans){
                System.out.println("Guess again");
                guess1 = sc.nextInt();
                diff = Math.abs(guess1 - ans);
                if(diff<=10){
                    System.out.println("Really hot");
                }
                else if (diff>10 && diff<=100){
                    System.out.println("hot");
                }
                else if (diff>100 && diff<=1000){
                    System.out.println("Cold");
                }
                else{
                    System.out.println("really cold");
                }
            }
        }

    }
}
