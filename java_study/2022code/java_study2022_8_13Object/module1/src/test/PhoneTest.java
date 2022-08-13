package test;

public class PhoneTest {
    public static void main(String[] args) {

        Phone p=new Phone();

        p.brand="小米";
        p.price=700.5;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playGame();
    }
}
