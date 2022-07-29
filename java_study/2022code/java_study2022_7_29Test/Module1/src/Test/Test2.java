package Test;

public class Test2 {
    public static void main(String[] args) {
        //判断100-200之间的质数，并且打印出来
        int count=0;

        for (int i = 101; i <=200 ; i++) {
            Boolean flag=true;
            //判断每一个i是不是质数，不是质数的话，把flag变成flase
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("当前数字"+i+"是质数");
                count++;
            }
        }
        System.out.println("一共有"+ count +"个质数");
    }
}
