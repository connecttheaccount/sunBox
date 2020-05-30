package demo01;
/*
声明两个double变量，从键盘获取值，判断第一个数大于10.0第二个数小于20.0，打印两数之和
否则打印两数乘积

 */

import java.util.Scanner;

/**
 * @author casper
 * @version 1.0
 */

public class demoif03 {
    public static void main(String[] args){
        //实例化Scanner类
        Scanner scan = new Scanner(System.in);
        //定义double变量
        double d1,d2;
        //获取输入的值
        System.out.println("请输入第一个double值");
        d1 = scan.nextDouble();
        System.out.println("请输入第二个double值");
        d2 = scan.nextDouble();
        if(d1>10.0){
            if(d2<20.0){
                System.out.println(d1+d2);
            }else{
                System.out.println(d1*d2);
            }
        }else{
            System.out.println(d1*d2);
        }



    }
}
