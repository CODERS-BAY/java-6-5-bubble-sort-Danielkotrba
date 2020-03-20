import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {86, 78, -48, 4, 9 - 8};
        System.out.println(Arrays.toString(numbers));
        array(numbers);
    }
    private static void array(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
}