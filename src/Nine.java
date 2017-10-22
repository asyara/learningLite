public class Nine {
    public static void main(String[] args) {

        int[][] arr = new int[5][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100 - 1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int summ = countSum(arr[i]);
            System.out.println("the sum of " + i + " array elements = " + summ);
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int[] helper;
            for (int j = i + 1; j < arr.length; j++) {
                if (countSum(arr[i]) > countSum(arr[j])) {
                    helper = arr[i];
                    arr[i] = arr[j];
                    arr[j] = helper;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int summ = countSum(arr[i]);
            System.out.println("the sum of " + i + " array elements = " + summ);
        }
        System.out.println();
    }


    private static int countSum(int[] arr) {
        int sum = 0;
        for (int i : arr
                ) {
            sum += i;
        }
        return sum;
    }

    private static int[] sortedBubble(int[] arr) {
        int helper;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    helper = arr[i];
                    arr[i] = arr[j];
                    arr[j] = helper;
                }
            }
        }
        return arr;
    }
}



