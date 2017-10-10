public class Third {

    public static void main(String[] args) {
        int [] testArr = {-87,9,-87,6,10,4,3,2,7};
        Third.searchMostIterativeOrMax(testArr);
    }

    public static void searchMostIterativeOrMax(int[] array) {

        int mostIterative = 0;
        int iterative = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            if (array[i] > max) {
                max = array[i];
            }
            for (int j = i + 1; j < (array.length); j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            if (counter >= iterative) {
                iterative = counter;
                mostIterative = array[i];
            }
        }
        if(iterative >= 1) {
            System.out.println("число, которое повторяется больше всего раз = " + mostIterative);
        }
        else if(iterative < 1) {
            System.out.println("повторяющихся чисел нет, max = "+ max);
        }

    }
}
