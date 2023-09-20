public class Main {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double harmonic = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmonic = harmonic + (1 / numbers[i]);
        }

        System.out.print(numbers.length / harmonic);

    }
}