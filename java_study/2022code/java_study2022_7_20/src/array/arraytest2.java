package array;

public class arraytest2 {
    public static void main(String[] args) {
        //求最大值
        int[]arraytest2=new int[]{33,5,22,44,55};
        int max=arraytest2[0];

        for (int i = 0; i < arraytest2.length; i++) {
            if(arraytest2[i]>max){
                max=arraytest2[i];
            }
        }
        System.out.println(max);
    }
}
