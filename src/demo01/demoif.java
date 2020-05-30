package demo01;
/*
if选择结构和输入Scanner练习题
声明两个整型变量，从键盘输入并判断两数之和，如果两数之和大于50打印hello world
 */
//导入Scanner包
import java.util.Scanner;

public class demoif {
    public static void main(String[] args){
        //实例化Scannerl
        Scanner user = new Scanner(System.in);
        System.out.println("请输入第一个值");
        //接受输入的值
        int a = user.nextInt();
        System.out.println("请输入第二个值");
        int b = user.nextInt();
        //System.out.println("您输入的第一个数为"+user.nextInt());
        //根据输入的值进行判断
        if(a+b>=50){
            System.out.println("Hello world");
        }else{
            System.out.println("您输入的第一个您输入的数字为："+a);
            System.out.println("您输入的第二个数字为："+b);
            System.out.println(a+"+"+b+"="+(a+b));
        }


    }
}
