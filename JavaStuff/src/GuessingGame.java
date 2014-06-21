import java.util.*;
public class GuessingGame{
    public static void main(String[] args){
        System.out.println("This is a hiaku");
        System.out.println("Please do enjoy it while you");
        System.out.println("Play my guessing game");
        System.out.println();
        int Maxnumber = 100;
        Random r = new Random();
        int number = r.nextInt(Maxnumber)+1;
        Scanner console = new Scanner(System.in);
        int guesses = 1;
        int TotalGuesses = 0;
        int TimesPlayed = 0;
        int BestGame =0;

        System.out.println("I'm thinking of a number between 1 and " + Maxnumber);
        System.out.print("Your guess?");
        int guess = console.nextInt();
        while (guess != number){
            if(guess < number){
                System.out.println("It's higher.");
                System.out.print("Your guess?");
                guesses++;
            }else {System.out.println("It's lower.");
                System.out.print("Your guess?"); 
                guesses++;
            }
            guess = console.nextInt();
        }
        TotalGuesses+=guesses;
        TimesPlayed++;
        BestGame+=guesses;
        System.out.println("You got it right in " + guesses + " guesses!");
        System.out.print("Play Again?");
        String pa = console.next();
        System.out.println();
        while(pa.startsWith("y")){
            guesses = 1;
            number = r.nextInt(Maxnumber)+1;
            System.out.println("I'm thinking of a number between 1 and " + Maxnumber);
            System.out.print("Your guess?");
            guess = console.nextInt();
            while (guess != number){
                if(guess < number){
                    System.out.println("It's higher.");
                    System.out.print("Your guess?");
                    guesses++;
                }else {System.out.println("It's lower.");
                    System.out.print("Your guess?"); 
                    guesses++;
                }
                guess = console.nextInt();
            }
            if(guesses < BestGame){
                BestGame = guesses;
            }
            TotalGuesses+=guesses;
            TimesPlayed++;
            System.out.println("You got it right in " + guesses + " guesses!");
            System.out.print("Play Again?");
            pa = console.next();
            System.out.println();
        }
        System.out.println();
        System.out.println("Your overall results :");
        System.out.println("Total games     =" + TimesPlayed);
        System.out.println("Total guesses   =" + TotalGuesses);
        System.out.println("Guesses/game    =" + (double)TotalGuesses/TimesPlayed);
        System.out.println("Best game       =" + BestGame);

    }
}