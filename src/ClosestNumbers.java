public class ClosestNumbers {

    private static final int[] NUMBERS = {23, 45, 67, 123, 26, 33, 31, 4};

    public static void main(String[] args) {
        int[] result = calculateClosestNumbers(NUMBERS); // should return [33,31]
        for (int arrResult: result) {
            System.out.println(arrResult);
        }
    }

    // Implement a method that takes an array and returns an array with
    // the two consecutive items that have the smallest difference between them
    private static int[] calculateClosestNumbers(int[] numbers) {
        int[] diffMin = new int[2];
        int minDif = -1;

        for (int i = 0; i < numbers.length-1; i++) {
           if( Math.abs(numbers[i] - numbers[i + 1]) < minDif || minDif == -1){
               minDif = Math.abs(numbers[i] - numbers[i + 1]);
               diffMin[0] = numbers[i];
               diffMin[1] = numbers[i + 1];
           }
        }
        return diffMin;
    }
}