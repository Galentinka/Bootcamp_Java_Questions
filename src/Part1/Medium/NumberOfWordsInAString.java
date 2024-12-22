package Part1.Medium;

public class NumberOfWordsInAString {

    public static void main(String[] args) {

        String inputString = "Hello, my name is Galina Ivanova";

        int wordCount = countWords(inputString);

        System.out.println("The number of words in this string is: " + wordCount);
    }

    public static int countWords(String string) {

        if (string.isEmpty()) {
            return 0;
        }

        String[] words = string.split("\\s+");

        return words.length;
    }
}
