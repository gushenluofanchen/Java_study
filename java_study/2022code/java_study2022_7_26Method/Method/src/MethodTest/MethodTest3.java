package MethodTest;

public class MethodTest3 {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5,6,7,8,9};

        int[] copy =copyofRange(arr,3,7);

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }

    public static int[] copyofRange(int[]arr,int from,int to){
        int[] newarr=new int[to-from];
        int index=0;
        for (int i = from; i < to; i++) {
            newarr[index]=arr[i];
            index++;
        }
        return newarr;
    }
}
