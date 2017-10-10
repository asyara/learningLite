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
        Arrays.sort(words);
        for (String i : words) {
            System.out.print(i + " ");
        }

    }
}
