package Test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //定义方法实现随机产生一个五位的验证码
        //验证码格式：长度是5，前四位是大写字母或者是小写字母，最后一位是数字

        //定义数组存放大写字母和小写字母
        char[]chs=new char[52];

        //创建random对象
        Random r=new Random();

        //创建result存放最终结果
        String result="";

        //为chs存放大小写字母
        for (int i = 0; i < chs.length; i++) {
            if(i<=25){
                chs[i]=(char)(97+i);
            }else{
                chs[i]=(char)(65+i-26);//已经循环26次
            }
        }

        //随机抽取四次chs索引，拼接到result
        for (int i = 0; i < 4; i++) {
            int randomIndex=r.nextInt(chs.length);
            result=result+chs[randomIndex];
        }

        //随机抽取0-9的数字，拼接到result
        int number=r.nextInt(10);
        result=result+number;

        //打印结果
        System.out.println(result);
    }
}
