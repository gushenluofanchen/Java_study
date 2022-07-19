package xunhuan;

import java.net.SocketTimeoutException;

public class while_test {
    public static void main(String[] args) {
        int x=1234;
        int temp=x;
        int num=0;

        while(temp!=0)
        {
            int ag=temp%10;
            temp=temp/10;
            num=num*10+ag;
        }
        System.out.println(temp);
        System.out.println(x);
        System.out.println(num);

        System.out.println(num==x);
    }

}
