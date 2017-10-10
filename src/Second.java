
public class Second {


    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 - 50);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("max = " + Second.searchMax(arr));

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

}
