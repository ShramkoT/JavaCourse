package module6;

public final class ArraysUtils {

    public static int sum(int[] array) {
        int sum = 0;
        for (int b = 0; b < array.length; b++) {
            sum = sum + array[b];
        }
        return sum;
    }

    public static int min(int[] array) {
        int min = 0;
        for (int b = 0; b < array.length; b++) {
            if (min > array[b])
                min = array[b];
        }
        return min;
    }

    public static int max(int[] array) {
        int max = 0;
        for (int b = 0; b < array.length; b++) {
            if (max < array[b])
                max = array[b];
        }
        return max;
    }

    public static int maxPositive(int[] array) {
        int maxPositive = array[0];
        for (int b = 0; b < array.length; b++) {
            if (maxPositive < array[b] && array[b] > 0)
                maxPositive = array[b];
        }
        return maxPositive;
    }

    public static long multiplication(int[] array) {
        long multiplication = 1;
        for (int b = 0; b < array.length; b++) {
            multiplication *= array[b];

        }
        return multiplication;
    }

    public static long modulus(int[] array) {

        long modulus = 1;
        long firstNumber = array[0];
        long lastNumber = array[array.length-1];
        modulus = firstNumber % lastNumber;
        return modulus;
    }

    public static int secondLargest(int[] array){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static int[] reverse(int[] array){
        int[] reverse = new int[array.length];
        int count = array.length - 1;
        for (int num : array){
            reverse[count--] = num;
        }
        return reverse;
    }

    public static int[] findEvenElements(int[] array){
        int evenElements = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                evenElements++;
            }
        }

        int[] evens = new int[evenElements];
        int count = 0;
        for (int i=0; i < array.length; i++ ){
            if (array[i] % 2 == 0){
                evens[count] = array[i];
                count++;
            }
        }
        return evens;
    }
}
