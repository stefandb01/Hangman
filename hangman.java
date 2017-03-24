import java.util.Scanner;
public class hangman
{

    public static void hangman()
    {
        Scanner scan = new Scanner(System.in);
        int counter=0;
        String[]array=new String[26];
        for(int f = 0; f<27; f++)
        {
            System.out.println("Enter a guess");
            counter++;
            String guess=scan.next();

            array[f]=guess;
            if(guess.equals("quit"))
            {
               // for(int l=0;l<
                System.out.println("you guessed:" + ""  + array);
                
                break;

            }
            System.out.println("Your total number of guesses is:"+""+counter);

        }
    }

    public static void sampleMethod()
    {
        int x=0;
        Scanner scan = new Scanner(System.in);
        int counter=0;

        System.out.println("Please enter a word to use in the game");
        String word = new String();
        int l =word.length();
        word = scan.next();
        String[]array= word.split("");
        System.out.println("Enter a guess");
        String guess=scan.next();

        for(int i= 0; i < l; i++)
        {
            for(int f= 0; f < l; f++)
            {
                if(guess.equals(array[f]))

                {
                    System.out.println("found at");
                    System.out.println(word.indexOf(guess));
                    System.out.println("Enter a guess");
                    guess=scan.next();
                    x++;

                }
            }
            if(x==0)
            {
                System.out.println("incorrect guess again");
                guess=scan.next();
                counter++;
            }

        }
    }
}
