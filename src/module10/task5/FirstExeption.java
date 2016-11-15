package module10.task5;

public class FirstExeption extends Exception {
    private String notice = "one";

    public FirstExeption(){
    }

    public FirstExeption(String notice) {
        this.notice = notice;
    }
}
