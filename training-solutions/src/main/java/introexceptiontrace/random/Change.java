package introexceptiontrace.random;

public class Change {

    public int[] changeNumbers() {
        int[] numbers = new RandomOperations().getNumbers();
//        for (int i = 0; i <= numbers.length - 1; i++) { <= helyett <
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        return numbers;
    }
}
