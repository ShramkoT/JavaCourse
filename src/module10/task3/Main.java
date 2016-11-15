package module10.task3;

public class Main {
    public static void main(String[] args) {

        Integer a = null;

        try {
            System.out.println(a.longValue());

        } catch (NullPointerException n) {
            System.out.println("NullPointer - " + n);
        }
    }
}
