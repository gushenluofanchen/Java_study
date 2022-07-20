package array;

public class arraytest1 {
    public static void main(String[] args) {

        int[] arrtest1=new int[]{1,2,3,4,5,6,7,8,9,10};
        int count=0;

        for (int i = 0; i < arrtest1.length; i++) {
            if(arrtest1[i]%3==0){
                count++;
            }
        }

        System.out.println("数组中能被3整除的数字有"+count+"个");

    }
}
