package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数,获取其中的个位,十位,百位

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();

        //2.获取
        int gewei = number % 10;
        int shiwei = number / 10 % 10;
        int baiwei = number / 100 % 10;

        //3.打印
        System.out.println("各位是:" + gewei);
        System.out.println("十位是:" + shiwei);
        System.out.println("百位是:" + baiwei);
    }
}
