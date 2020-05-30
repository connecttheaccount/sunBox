package demo01;
/*
狗前两年的年龄相当于人类的10.5岁之后每增加一年就增加4岁
从键盘输入狗的年龄打印出相当于人类的年龄
若输入负数提示输入错误
 */

import java.util.Scanner;

public class demoif04 {
    public static void main(String[] args){
        //实例化Scanner类
        Scanner scan = new Scanner(System.in);
        //获取输入的值
        System.out.println("请输入狗狗的年龄");
        double d = scan.nextDouble();
        //狗前两年的年龄是10.5往后每一年是相当于人的4岁
        //5岁就是：10.5+10.5+4+4+4
        //6岁就是：10.5+10.5+4+4+4+4
        if(d>=0&&d<=2){
            System.out.println("相当于人的年龄"+d*10.5);
        }else if(d>2){
            System.out.println("相当于人的年龄："+(2*10.5+(d-2)*4));
        }
        else{
            System.out.println("输入错误");
        }
    }
}
