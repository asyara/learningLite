import java.util.Arrays;
import java.util.Scanner;

public class Ten {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int num = input.nextInt();
        int arr [] = new int[num];
        System.out.println("Введите " + num + " чисел");
        int counter;
        for (counter = 0; counter < num; counter++)
            arr[counter] = input.nextInt();
        Arrays.sort(arr);
        System.out.println("Введите элемент для бинарного поиска: ");
        int item = input.nextInt();
        binarySearch(arr, item);
    }


    public static void binarySearch(int[] array, int item) {
        int first = 0;
        int last = array.length - 1;
        int position;
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");
        } else {
            System.out.println("Элемент не найден в массиве.");
        }
    }
}