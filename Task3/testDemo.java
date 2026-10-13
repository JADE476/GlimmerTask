package task3_3;

public class testDemo {
    public static void main(String[] args) {
        Penguin p = new Penguin("Pipi", 1);
        p.eat();
        p.sleep();
        p.introduction();

        Mouse m = new Mouse("Mickey", 2);
        m.eat();
        m.sleep();
        m.introduction();
    }
}
