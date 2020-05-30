package demo01;

import java.util.Scanner;

/*
if选择结构和Scanner类练习
由键盘输入三个整数分别存入三个变量中并对其进行排序
 */
public class demoif02 {
    public static void main(String[] args){
        //对Scanner类进行实例化
        Scanner scan = new Scanner(System.in);
        //定义三个变量接受输入的值
        int num,num1,num2;
        num = scan.nextInt();
        num1 = scan.nextInt();
        num2 =scan.nextInt();
        //根据值进行判断
        if(num > num1){
            if(num > num2){
                System.out.println("最大值为"+num);
            }else{
                System.out.println("max为："+num2);
            }
        }else{
            if(num1 > num2){
                System.out.println("max为"+num1);
            }else{
                System.out.println("maxwei"+num2);
            }
        }
    }
}
