package module10.task5;

public class ThirdExeption extends Exception{
    private String notice = "three";

    public ThirdExeption(){
    }

    public ThirdExeption(String notice) {
        this.notice = notice;
    }
}
