package operator;

public class operator {
    public static void main(String[] args) {
        short a=10;
        a+=10;//隐藏了一个强制类型转换,等同于a=(short)(a+10)
        System.out.println();

        int number1=10;
        int number2=20;

        int max=number1>number2?number1:number2;
        System.out.println(max);

        System.out.println(number1>number2?number1:number2);

    }
}
