package xunhuan;

import java.util.Scanner;

public class loop_test4 {
    public static void main(String[] args) {
        //判断一个数是不是质数
        //1.键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int input=sc.nextInt();
        boolean flag=true;

        //2.判断
        for (int i = 2; i < input; i++) {
            if(input % i == 0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(input+"是一个质数");
        }else{
            System.out.println(input+"不是一个质数");
        }
    }
}
