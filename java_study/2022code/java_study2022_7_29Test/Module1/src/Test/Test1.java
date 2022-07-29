package Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //机票价格按照淡季旺季，头等舱经济舱收费，输入机票原价，月份和头等舱或者经济舱
        //按照如下规则计算机票价格：
        //旺季（5-10月）头等舱9折经济舱8.5折
        //淡季（11月到来年四月）头等舱7折经济舱6.5折

        //1.键盘录入机票原价，月份，头等舱或者经济舱
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket=sc.nextInt();
        System.out.println("请输入月份");
        int month=sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
        int seat=sc.nextInt();

        //2.判断月份
        if(month>=5&&month<=10){
            //旺季
            //判断是头等舱还是经济舱
            ticket=getPrice(ticket,seat,0.9,0.85);
        }else if(( month >= 11 && month <= 12)||(month >= 1 && month <= 4)){
            ticket=getPrice(ticket,seat,0.7,0.65);
        }else{
            System.out.println("输入的月份不合法");
        }

        System.out.println(ticket);
    }

    public static int getPrice(int ticket,int seat,double v0,double v1){
        if(seat==0){
            ticket=(int)(ticket*v0);
        }else if(seat==1){
            ticket=(int)(ticket*v1);
        }else{
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}
