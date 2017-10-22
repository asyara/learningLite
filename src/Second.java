public class Second {


    public static void main(String[] args) {
        int size = args.length;
        int[] argum = new int[size];
        for (int i = 0; i < args.length; i++) {
            argum[i] = Integer.parseInt(args[i]);
        }
        int max = argum[0];
        for (int i = 1; i < argum.length; i++) {
            if (max < argum[i]) {
                max = argum[i];
            }
        }
        System.out.println("max = " + max);
    }
}
