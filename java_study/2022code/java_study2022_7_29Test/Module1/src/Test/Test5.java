package Test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //6名评委打分，分数范围是0-100之间的整数
        //选手最后的得分是，去掉一个最高分去掉一个最低分的其他四名评委的平均分

        //1.定义一个数组，用来存储6名评委的打分
        int[]scoreArr=getScore();
        //2.求最大值
        int max=getMax(scoreArr);
        //3.求最小值
        int min=getMin(scoreArr);
        //4.求六个评委的总分
        int sum=getSun(scoreArr);
        //5.（总分-最大值-最小值）/4
        int avg=(sum-max-min)/(scoreArr.length-2);
        System.out.println("选手的最终得分为"+avg);

    }

    //求六位评委的总分
    public static int getSun(int[] scoreArr){
        int sum=0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum=sum+scoreArr[i];
        }
        return sum;
    }

    //求最大值
    public static int getMax(int[] scoreArr){
        int max=scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i]>max){
                max=scoreArr[i];
            }
        }
        return max;
    }

    //求最小值
    public static int getMin(int[] scoreArr){
        int min=scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i]<min){
                min=scoreArr[i];
            }
        }
        return min;
    }

    //getScore
    //我要干嘛？定义一个数组，用来存储6名评委的打分
    //需要什么？都不需要
    //干完这件事情，是否需要返回？必须返回数组
    public static int[] getScore(){
        int[] Score=new int[6];
        //键盘录入分数
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < Score.length; ) {
            System.out.println("请输入评委的打分");
            int score=sc.nextInt();
            if(score >= 0 && score <= 100){
                Score[i]=score;
                i++;
            }else{
                System.out.println("打分有误，请重新输入");
            }
        }
        return Score;
    }
}
