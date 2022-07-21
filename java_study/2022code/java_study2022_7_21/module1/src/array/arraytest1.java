package array;

public class arraytest1 {
    public static void main(String[] args) {
        //交换数组中的数据顺序
        //1.定义数组
        int []arraytest1=new int[]{1,2,3,4,5};

        //2.利用循环交换顺序
        for (int i=0,j=arraytest1.length-1;i<j;i++,j--){
            int temp=arraytest1[i];
            arraytest1[i]=arraytest1[j];
            arraytest1[j]=temp;
        }
        
        //3.打印数组
        for (int i = 0; i < arraytest1.length; i++) {
            System.out.println(arraytest1[i]);
        }
            
        }
    }

