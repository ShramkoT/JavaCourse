package module10.task5;

public class Main {
    public void test() throws FirstExeption, SecondExeption, ThirdExeption{
        int count = 0;
        if (count == 0) {
            throw new FirstExeption();
        }
        if (count != 1) {
            throw new SecondExeption();
        }
        if (count != 2) {
            throw new ThirdExeption();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.test();
        } catch (FirstExeption | SecondExeption | ThirdExeption e) {
            System.out.println(e);

        }
    }
}
