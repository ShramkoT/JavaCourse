package module10.task4;

public class Main {
    public static void main(String[] args) {
        try {
            f();
        }
        catch (IndexOutOfBoundsException e){
            throw new NullPointerException();
        }
    }

    static void f(){
        g();
    }

    static void g(){
        throw new IndexOutOfBoundsException();
    }
}
