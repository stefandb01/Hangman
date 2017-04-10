import java.util.Scanner;
import java.util.Random;
public class hangman12
{

    public static void ampleMethod()
    {

        {

            String words[] = {"monkey", "giraffe", "octopus", "computer", "hoodie", "trousers", "desktop", "copper",
                    "Unite", "Decisive", "Notice", "Educated", "explain", "branch", "talented", "punishment", "apparel", "dangerous",
                    "Coherent", "Government", "Defeated", "Pumped", "History", "Troubled", "Heartbreaking","Knowing",
                    "Interest", "Mountain", "Window", "Interest", "Inconclusive", "Balance", "Freezing", "Challenge", "Brutally",
                    "Creative", "definitive", "negative", "molecular", "Blushing", "entertain", "Believing", "Adherence",
                    "Official", "Victory", "Billionaire", "Correlation", "Popular", "Attitude", "Amplitude"};
            Random x = new Random();
            int index = x.nextInt(words.length);
            String wordR = words[index];

            System.out.println("Welcome to hangman! You are on death row.");
            System.out.println("The only way to be aquited is to not get hung! Good luck ;)");
            System.out.println("After a word is entered you will have to guess it 1 letter at a time.");
            System.out.println("The max amount of incorrect guesses is 6 so choose wisely!");
            final int MAX_GUESSES = 6;
            String incorLtrs[] = new String [MAX_GUESSES];
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a word,enter random if you want a random word.");

            String word = scan.next();
            if(word.equalsIgnoreCase("random"))
            {
                word=wordR;
            }
            String corLtrs[] = new String[word.length()];

            wipePage();

            System.out.println(" ______");
            System.out.println(" |    }");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_");
            System.out.println();
            for (int i = 0; i < word.length(); i++)
                System.out.print("_ ");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            boolean invalidInput = false;

            System.out.println("Enter a guess.");
            String guess = scan.next();
            for (int i = 0; i < MAX_GUESSES - 1; i++)
                if (incorLtrs[i] != null && incorLtrs[i].equalsIgnoreCase(guess))
                    invalidInput = true;

            for (int i = 0; i < word.length(); i++) // these search through both arrays to make sure the letter has not already been guessed
                if (corLtrs[i] != null && corLtrs[i].equalsIgnoreCase(guess))
                    invalidInput = true;

            if (guess.length() != 1)
                invalidInput = true;

            while (invalidInput)
            {
                System.out.println("You can't use that! Try again.");
                guess = scan.next();
                invalidInput = false;

                for (int i = 0; i < MAX_GUESSES - 1; i++)   //this code is the same as the code up there. It needs to check after every input.
                    if (incorLtrs[i] != null && incorLtrs[i].equalsIgnoreCase(guess))
                        invalidInput = true;

                for (int i = 0; i < word.length(); i++) 
                    if (corLtrs[i] != null && corLtrs[i].equalsIgnoreCase(guess))
                        invalidInput = true;

                if (guess.length() != 1)
                    invalidInput = true;
            }
            wipePage();

            boolean correct = false;
            boolean gameOver=false;
            int a=0;
            int b=0;
            int wrongCounter=0;
            int rightCounter=0;
            int counter=0;
            int f=0;
            int l = word.length(); 
            String [] gueses=new String[l+6];
            String str[]= word.split("");
            while(wrongCounter<6 && rightCounter<l)
            {
                //for( int i=0; i < l ;i++)
                // {
                invalidInput = false;
                correct = false;
                int first = 0;
                for (int second = 1; second <= word.length(); first++, second++)  // first and second parameter for substring, to grab 1 letter from the word at a time
                {

                    if (word.substring(first, second).equalsIgnoreCase(guess))
                    {
                        corLtrs[first] = guess; // insert the correct letter in the correct place
                        correct = true;
                    }

                }

                if (!correct)
                {
                    loop:
                    for (int i = 0; i < MAX_GUESSES; i++)
                    {
                        if (incorLtrs[i] == null)
                        {
                            incorLtrs[i] = guess;   // add it to the array of incorrect letters guessed
                            break loop;
                        }
                    }
                }

                for( f=0; f < l+1; f++)
                {

                    if(str[f].equalsIgnoreCase(guess))
                    {
                        rightCounter++;
                        counter++;
                        //System.out.println("letter found ");

                        gueses[f]=guess;

                    }

                }
                if(counter==0)
                {
                    //System.out.println(" incorrect");

                    wrongCounter++;
                    gueses[a]=guess;
                    a++;

                }
                switch (wrongCounter) // based on the amount of wrong answers, it shows the correct state of the hangman (how many body parts)
                {
                    case 0:
                    System.out.println(" ______");
                    System.out.println(" |    }");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println("_|_");
                    System.out.println();
                    break;
                    case 1:
                    System.out.println(" ______");
                    System.out.println(" |    }");
                    System.out.println(" |    O");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println("_|_");
                    System.out.println();
                    break;
                    case 2:
                    System.out.println(" ______");
                    System.out.println(" |    }");
                    System.out.println(" |    O");
                    System.out.println(" |    |");
                    System.out.println(" |");
                    System.out.println("_|_");
                    System.out.println();
                    break;
                    case 3:
                    System.out.println(" ______");
                    System.out.println(" |    }");
                    System.out.println(" |    O");
                    System.out.println(" |   /|");
                    System.out.println(" |");
                    System.out.println("_|_");
                    System.out.println();
                    break;
                    case 4:
                    System.out.println(" ______");
                    System.out.println(" |    }");
                    System.out.println(" |    O");
                    System.out.println(" |   /|\\");
                    System.out.println(" |");
                    System.out.println("_|_");
                    System.out.println();
                    break;
                    case 5:
                    System.out.println(" ______");
                    System.out.println(" |    }");
                    System.out.println(" |    O");
                    System.out.println(" |   /|\\");
                    System.out.println(" |   /");
                    System.out.println("_|_");
                    System.out.println();
                    break;
                    case 6:
                    System.out.println(" ______");
                    System.out.println(" |    }");
                    System.out.println(" |    O");
                    System.out.println(" |   /|\\");
                    System.out.println(" |   / \\");
                    System.out.println("_|_");
                    System.out.println();
                    break;
                }
                for (int i = 0; i < word.length(); i++)
                {
                    if (corLtrs[i] == null)
                        System.out.print("_ ");
                    else
                        System.out.print(corLtrs[i]+" ");
                }
                System.out.println();
                System.out.println();
                for (int i = 0; i < MAX_GUESSES; i++)
                {
                    if (incorLtrs[i] != null)
                        System.out.print(incorLtrs[i]+" ");
                }
                counter=0;
                if(wrongCounter<6 && rightCounter<l)
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("Enter another guess.");
                    guess = scan.next();

                    for (int i = 0; i < MAX_GUESSES - 1; i++)
                        if (incorLtrs[i] != null && incorLtrs[i].equalsIgnoreCase(guess))
                            invalidInput = true;

                    for (int i = 0; i < word.length(); i++) // these search through both arrays to make sure the letter has not already been guessed
                        if (corLtrs[i] != null && corLtrs[i].equalsIgnoreCase(guess))
                            invalidInput = true;

                    if (guess.length() != 1)
                        invalidInput = true;

                    while (invalidInput)
                    {
                        System.out.println("You can't use that! Try again.");
                        guess = scan.next();
                        invalidInput = false;

                        for (int i = 0; i < MAX_GUESSES - 1; i++)   //this code is the same as the code up there. It needs to check after every input.
                            if (incorLtrs[i] != null && incorLtrs[i].equalsIgnoreCase(guess))
                                invalidInput = true;

                        for (int i = 0; i < word.length(); i++) 
                            if (corLtrs[i] != null && corLtrs[i].equalsIgnoreCase(guess))
                                invalidInput = true;

                        if (guess.length() != 1)
                            invalidInput = true;
                    }
                    wipePage();
                }

                //  }
            }

            //System.out.println("Your guesses are:");
            /*int totalGuesses=counter+wrongCounter;
            for(int v=0;v<totalGuesses;v++)
            {

            System.out.print(gueses[v]+",");

            }*/

            //System.out.println("Your number of wrong guesses are:" + wrongCounter);
            //System.out.println("Your number of right guesses are:" + rightCounter);
            System.out.println();
            System.out.println();
            if(rightCounter==l)
            {
                System.out.println("You win!");
            }
            else
            {
                System.out.println("You lose! The word was "  +  word+".");

            }

        }
    }

    public static void wipePage () // prints blank 60 times so you can no longer see previous print statements
    {
        for (int i = 0; i < 60; i++)
            System.out.println();
    }

}

 
