import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        String ins = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text (min 5 symbol)");
        if (sc.hasNextLine()) {
            ins = sc.nextLine();
        }
        if (ins.length() < 5) {
            System.out.println("Enter the normal text!");
            ins = sc.nextLine();
        }
        System.out.println("Most repetitive word in this string: " + getMostRepetitiveWord(clearString(ins)));

    }

    public static String getMostRepetitiveWord(String in) {
        String[] wordArr = in.split(" ");
        int maxCounter = 0;
        String repWord = null;
        for (int i = 0; i < wordArr.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < wordArr.length - 1; j++) {
                if (wordArr[i].equalsIgnoreCase(wordArr[j])) {
                    counter++;
                }
                if (counter >= maxCounter) {
                    maxCounter = counter;
                    repWord = wordArr[i];
                }
            }

        }
        return repWord;
    }

    public static String clearString(String in) {
        in = in.replaceAll("[^а-яёА-Я a-zA-Z]", "");
        /*in = in.replaceAll("[,.:;!?]", " ");*/
        in = in.replaceAll("  ", " ");
        in = in.toLowerCase();
        return in;
    }
}
