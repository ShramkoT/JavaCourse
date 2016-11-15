package module10.task2;

public class MyOwnExeption extends Exception {
    private String a;

    public MyOwnExeption(String a) {
        this.a = a;
    }

    public void printString() throws Throwable {

        System.out.println("String is: " + a);
        throw new Throwable();
    }
}
