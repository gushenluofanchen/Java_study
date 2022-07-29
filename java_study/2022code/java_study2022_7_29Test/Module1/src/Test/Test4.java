package Test;

import java.util.zip.DeflaterOutputStream;

public class Test4 {
    public static void main(String[] args) {
        //把一个数组中的元素复制到另一个数组中去

        //1.定义一个数组
        int[]Arr=new int[]{1,2,3,4,5};

        //2.定义一个新的数组
        int[]newArr=new int[Arr.length];

        //3.遍历Arr，得到每一个元素，依次存入到newArr中
        for (int i = 0; i < Arr.length; i++) {
            newArr[i]=Arr[i];
        }

        //4.遍历新的数组，打印
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
