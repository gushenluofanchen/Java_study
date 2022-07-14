package Operator;

public class Operator {
    public static void main(String[] args){
        //+
        System.out.println(2+3);
        //-
        System.out.println(7-5);
        //*
        System.out.println(6*7);

        //如果有小数参与运算,计算结果可能不精确(和小数的存储有关,javase进阶学习)
        System.out.println(1.1+1.01);
        System.out.println(1.1-1.01);
        System.out.println(1.1*1.01);

        System.out.println(1.1+1.1);
    }
}
