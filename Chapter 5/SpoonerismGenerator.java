import java.util.Scanner;

public class SpoonerismGenerator {
   public static void main(String[] args) {
      run();
   }
   
   public static String getWord() {
      Scanner scanner = new Scanner(System.in);
      return scanner.nextLine();
   }
   
   public static int vowelIndex(String word) {
      String vowels = "AEIOUaeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return 0;
   }
   
   public static void run() {
      System.out.print("Enter the first word: ");
      String word1 = getWord();
      System.out.print("Enter the second word: ");
      String word2 = getWord();
      
      int vowelIndex1 = vowelIndex(word1);
      int vowelIndex2 = vowelIndex(word2);
      
      if (vowelIndex1 <= 0 || vowelIndex2 <= 0) {
            System.out.println(word1 + " and "+ word2 + " are not good words to spoonerize.");
        } else {
            String spoonerizedWord1 = word2.substring(0, vowelIndex2) + word1.substring(vowelIndex1);
            String spoonerizedWord2 = word1.substring(0, vowelIndex1) + word2.substring(vowelIndex2);

            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }
   }
}