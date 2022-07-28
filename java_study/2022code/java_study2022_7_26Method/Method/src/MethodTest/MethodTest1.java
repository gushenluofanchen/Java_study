package MethodTest;

public class MethodTest1 {
    public static void main(String[] args) {
        //1.定义数组
        int []arr=new int[]{11,22,33,44,55};

        //2.调用方法
        printfArr(arr);
    }

    //定义方法
    public static void printfArr(int[]arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }
}
