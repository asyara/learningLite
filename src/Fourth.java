import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {

        String insertedText = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text (min 5 symbol)");
        if (sc.hasNextLine()) {
            insertedText = sc.nextLine();
        }
        if (insertedText.length() < 5) {
            System.out.println("Enter the normal text!");
            insertedText = sc.nextLine();
        }
        System.out.println("the longest word - " + findLongestWord(deleteAllPunctuation(insertedText)));

    }

    private static String findLongestWord(String clearText) {
        String[] words = (clearText.split(" "));
        String longest = "l";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        return longest;
    }

    private static String deleteAllPunctuation(String inputText) {
        inputText.replace(",", " ");
        inputText.replace(".", " ");
        inputText.replace(":", " ");
        inputText.replace(";", " ");
        inputText.replace("!", " ");
        inputText.replace("?", " ");
        inputText.replace("\"", " ");
        inputText.replace(" - ", " ");
        inputText.replace("  ", " ");
        return inputText;
    }


}
