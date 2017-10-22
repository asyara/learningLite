import java.util.*;

public class Seven {
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
        String[] words = Five.clearString(ins).split(" ");
        alphabetSort(words);
        for (String i : words) {
            System.out.print(i + " ");
        }

    }

    public static void alphabetSort(String[] words) {

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String helper;
                int sub1 = (int) words[i].substring(0, 1).charAt(0);
                int sub2 = (int) words[j].substring(0, 1).charAt(0);
                if (sub2 < sub1) {
                    helper = words[i];
                    words[i] = words[j];
                    words[j] = helper;
                }
            }
        }

    }

}
