
import java.util.Random;
public class wordlist
{
    public static void main (String args[])
    {
        String[] words = {"Monkey", "Giraffe", "Octopus", "Computer", "Hoodie", "Trousers", "Desktop", "Copper",
                "Unite", "Decisive", "Notice", "Educated", "Explain", "Branch", "Talented", "Punishment", "Apparel", "Dangerous",
                "Coherent", "Government", "Defeated", "Pumped", "History", "Troubled", "Heartbreaking","Knowing",
                "Interest", "Mountain", "Window", "Interest", "Inconclusive", "Balance", "Freezing", "Challenge", "Brutally",
                "Creative", "definitive", "negative", "molecular", "Blushing", "entertain", "Believing", "Adherence",
                "Official", "Victory", "Billionaire", "Correlation", "Popular", "Attitude", "Amplitude"};
        Random x = new Random();
        int index = x.nextInt(words.length + 1);
        String word = words[index];
        System.out.println(word);
        //System.out.println(index);
        //System.out.println(words.length);
       
    }

}