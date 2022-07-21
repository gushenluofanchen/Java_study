package array;

import java.util.Random;

public class arraytest2 {
    public static void main(String[] args) {
        //打乱数组中的数据
        //1.定义数组
        int []arraytest2=new int[]{1,2,3,4,5};

        //2.循环遍历数组,从arraytest2[0]开始逐个打乱顺序
        Random r=new Random();
        for (int i = 0; i < arraytest2.length; i++) {
            int random=r.nextInt(5);
            int temp=arraytest2[i];
            arraytest2[i]=arraytest2[random];
            arraytest2[random]=temp;
        }

        //3.遍历数组打印
        for (int i = 0; i < arraytest2.length; i++) {
            System.out.print(arraytest2[i] + " ");
        }
    }
}
