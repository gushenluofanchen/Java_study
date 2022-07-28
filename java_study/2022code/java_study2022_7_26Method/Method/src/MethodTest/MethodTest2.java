package MethodTest;

public class MethodTest2 {
    public static void main(String[] args) {
        //1.定义数组
        int[]arr=new int[]{1,5,7,3,8,10};
        //2.调用方法
        int max=getMax(arr);

        //3.打印
        System.out.println(max);

    }

    public static int getMax(int[]arr){
        int max =arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[0]) {
                max=arr[i];
            }
        }
        return max;
    }
}
