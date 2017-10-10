import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Eith {
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
        String[] result = sortedForRepetitive(getRepetitiveWords(ins));


        for (String i : result
                ) {
            System.out.println(i);
        }
    }


    public static String[] getRepetitiveWords(String in) {
        ArrayList listArr = new ArrayList();
        String[] wordArr = Five.clearString(in).split(" ");
        Collections.addAll(listArr, wordArr);
        String[] results = new String[listArr.size()];
        for (int i = 0; i < listArr.size(); i++) {
            int counter = 1;
            for (int j = i + 1; j < listArr.size(); j++) {
                if (listArr.get(i).equals(listArr.get(j))) {
                    counter++;
                    listArr.remove(j);
                    j--;
                }
            }
            results[i] = "Word \"" + listArr.get(i) + "\" repeated " + counter + " times";
        }
        int count = 0;
        for (String i : results
                ) {
            if(i != null) {
                count++;
        }
        }
        String[] resulted = new String[count];
        for(int i = 0; i < resulted.length; i++) {
            resulted[i] = results[i];
        }
        return resulted;
    }

    private static String[] sortedForRepetitive(String[] arrIn) {
        String saver;
        for (int i = 0; i < arrIn.length; i++) {
            int first = parseInt(arrIn[i].replaceAll("[\\D]", ""));
            for (int j = i + 1; j < arrIn.length; j++) {
                int second = parseInt(arrIn[j].replaceAll("[\\D]", ""));
                if (second > first) {
                    saver = arrIn[i];
                    arrIn[i] = arrIn[j];
                    arrIn[j] = saver;
                    first = second;
                }
            }
        }
        return arrIn;
    }
}
