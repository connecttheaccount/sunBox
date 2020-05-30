package daydemo06;

import java.util.Arrays;

/*
面向对象，当实现功能时，不需要关心具体的步骤实现，而是找一个已经具有该功能的人来帮我实现
 */
public class demo01 {
    //定义一个数组进行打印
    public static void main(String[] args){
        //定义一个数组并打印,打印样式为{25,26,27,28,29}
        int array[]={25,26,27,28,29};
        //for循环遍历数组
        //面向过程，每一个步骤都有亲力亲为
        /*System.out.printf("{");
        for(int i=0;i<array.length;i++){
            if(i==array.length-1)
            {//如果是最后一个元素
                System.out.printf(array[i]+"}");
            }else {//如果不是最后一个元素
                System.out.printf(array[i] + ",");
            }
        }*/
        //使用面向对象找一个jdk中提供的array类，其中有一个tostring方法直接就能把数组变成想要的格式的字符串
        System.out.print(Arrays.toString(array));
    }
}
