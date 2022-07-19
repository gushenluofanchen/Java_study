package xunhuan;

import java.util.Scanner;

public class looptest3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int input=sc.nextInt();

        int i=1;
        for(i=1;i<=input;i++){
            if(i*i==input){
                System.out.println(i+"就是input的平方根");
                break;
            }else if(i*i>input){
                System.out.println((i-1)+"就是input平方根的整数部分");
                break;
            }
        }
    }
}
