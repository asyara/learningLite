public class Eleven {
    public static void main(String[] args) {
        int value = 10;
        int fact = factorial(value);
        System.out.println(fact);


    }

    public static int factorial(int value) {

        if (value == 0) return 1;
        return value * factorial(value - 1);
    }
}
