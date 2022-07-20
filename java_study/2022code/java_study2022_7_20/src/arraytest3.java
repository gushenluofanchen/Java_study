import java.util.Random;

public class arraytest3 {
    public static void main(String[] args) {

        //定义数组
        int[]arraytest3=new int[10];

        //获取随机数存到arraytest3中
        for (int i = 0; i < arraytest3.length; i++) {
            Random r=new Random();
            int number=r.nextInt(100+1);
            arraytest3[i]=number;
        }

        //遍历数组
        for (int i = 0; i < arraytest3.length; i++) {
            System.out.print(arraytest3[i]+" ");
        }

        //求和
        int sum=0;
        for (int i = 0; i < arraytest3.length; i++) {
            sum+=arraytest3[i];
        }
        System.out.println("数组中所有数据的和是"+sum);

        //求平均值
        int avg=sum/arraytest3.length;
        System.out.println("数组中所有的数据的平均值是"+avg);

        //统计有多少个数据比平均值少
        int count=0;
        for (int i = 0; i < arraytest3.length; i++) {
            if(arraytest3[i]<avg){
                count++;
            }
        }
        System.out.println("数组中有"+count+"个数据比平均值少");

    }
}
