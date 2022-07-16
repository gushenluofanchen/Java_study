package LogicOperatorTest;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LogicOperatorTest {
    public static void main(String[] args) {
        //键盘录入两个数字
        //如果其中一个是6,输出true
        //如果它们的和是6的倍数,输出true
        //其他都是false

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int number2 = sc.nextInt();

        boolean result=number1==6 || number2==6 || (number1=number2)%6==0;

        System.out.println(result);

    }
}
