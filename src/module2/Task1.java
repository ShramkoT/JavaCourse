package module2;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {6, 32, 48, -35, 69, 87, -14, 54, 99, 22};
        double[] array1 = {6, 16.5, 48, -32.7, 69, 87.6, -14.2, 54, 99.8, 28};

        System.out.println("sum int = " + sum(array));
        System.out.println("sum double = " + sum(array1));
        System.out.println("max int = " + max(array));
        System.out.println("max double = " + max(array1));
        System.out.println("min int = " + min(array));
        System.out.println("min double = " + min(array1));
        System.out.println("maxPositive int = " + maxPositive(array));
        System.out.println("maxPositive double = " + maxPositive(array1));
        System.out.println("multi int =  " + multiplication(array));
        System.out.println("multi double =  " + multiplication(array1));
        System.out.println("mod int = " + modulus(array));
        System.out.println("mod double = " + modulus(array1));
        System.out.println("second largest element int = " + secondLargest(array));
        System.out.println("second largest element double = " + secondLargest(array1));
    }
    // sum int
    public static int sum(int[] array) {
        int sum = 0;
        for (int b = 0; b < array.length; b++) {
            sum = sum + array[b];
        }
        return sum;

    }
    // sum double
    public static double sum(double[] array) {
        double sum = 0;
        for (int b = 0; b < array.length; b++) {
            sum = sum + array[b];
        }
        return sum;
    }
    //max int
    public static int max(int[] array) {
        int max = 0;
        for (int b = 0; b < array.length; b++) {
            if (max < array[b])
                max = array[b];
        }
        return max;
    }
    //max double
    public static double max(double[] array) {
        double max = 0;
        for (int b = 0; b < array.length; b++) {
            if (max < array[b])
                max = array[b];
        }
        return max;
    }
    //min int
    public static int min(int[] array) {
        int min = 0;
        for (int b = 0; b < array.length; b++) {
            if (min > array[b])
                min = array[b];
        }
        return min;
    }
    //min double
    public static double min(double[] array) {
        double min = 0;
        for (int b = 0; b < array.length; b++) {
            if (min > array[b])
                min = array[b];
        }
        return min;
    }
    //maxPositive int
    public static int maxPositive(int[] array) {
        int maxPositive = array[0];
        for (int b = 0; b < array.length; b++) {
            if (maxPositive < array[b] && array[b] > 0)
                maxPositive = array[b];
        }
        return maxPositive;
    }
    //maxPositive double
    public static double maxPositive(double[] array) {
        double maxPositive = array[0];
        for (int b = 0; b < array.length; b++) {
            if (maxPositive < array[b] && array[b] > 0)
                maxPositive = array[b];
        }
        return maxPositive;
    }
    //multiplication int
    public static long multiplication(int[] array) {
        long multiplication = 1;
        for (int b = 0; b < array.length; b++) {
            multiplication *= array[b];

        }
        return multiplication;
    }
    //multiplication double
    public static double multiplication(double[] array) {

        double multiplication = 1;
        for (int b = 0; b < array.length; b++) {
            multiplication *= array[b];

        }
        return multiplication;
    }
    //modulus of first and last element int
    public static long modulus(int[] array) {

        long modulus = 1;
        long firstNumber = array[0];
        long lastNumber = array[array.length-1];
        modulus = firstNumber % lastNumber;
        return modulus;
    }
    //modulus of first and last element double
    public static double modulus(double[] array) {

        double modulus = 1;
        double firstNumber = array[0];
        double lastNumber = array[array.length-1];
        modulus = firstNumber % lastNumber;
        return modulus;
    }
    //second largest element int
    public static int secondLargest(int[] array){
        int max2 = 0;
        for (int b = 0; b < array.length; b++) {
            if(array[b]!=max(array)) {
                if (max2 < array[b])
                    max2 = array[b];
            }
        }
        return max2;
    }
    //second largest element double
    public static double secondLargest(double[] array){
        double max2 = 0;
        for (int b = 0; b < array.length; b++) {
            if(array[b]!=max(array)) {
                if (max2 < array[b])
                    max2 = array[b];
            }
        }
        return max2;
    }
}
