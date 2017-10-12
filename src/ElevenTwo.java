public class ElevenTwo {
    public static void main(String[] args) {
        int value = 3;
        int fact = factorialWithoutRec(value);
        System.out.println(fact);


    }

    public static int factorialWithoutRec(int value) {
        int result = 1;
        for(int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
