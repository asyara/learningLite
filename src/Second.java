import java.util.Scanner;

public class Second {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите набор чисел");
        String arguments = input.nextLine();
        int max = searchMax(convertToIntArray(arguments));
        System.out.println("max = " + max);

    }

    public static int searchMax(int[] arr1) {
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        return max;
    }

    public static int[] convertToIntArray(String args) {
        args = args.replaceAll(" +"," ");
        String[] argsArr = args.split(" ");
        int[] arr = new int[argsArr.length];
        for(int i = 0; i < argsArr.length; i++) {
            argsArr[i] = argsArr[i].replaceAll(" ","");
            arr[i] = Integer.parseInt(argsArr[i]);
        }
        return arr;
    }

}
