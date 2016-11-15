package module10.task5;

public class SecondExeption extends Exception{
    private String notice = "two";

    public SecondExeption(){
    }

    public SecondExeption(String notice) {
        this.notice = notice;
    }
}
