public class Six {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int saver;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000 - 1);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    saver = arr[i];
                    arr[i] = arr[j];
                    arr[j] = saver;
            }
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
