package module3.task1;

public class Bird extends Animal  {
    String fly;
    String sing;
    String Bird;

    public Bird(String walk, String fly, String sing, String bird) {
        super(walk);
        this.fly = fly;
        this.sing = sing;
        Bird = bird;
    }
    void fly () {
        System.out.println("I am walking");
        System.out.println("I am flying");
        System.out.println("I am singing");
        System.out.println("I am Bird");
    }
}
