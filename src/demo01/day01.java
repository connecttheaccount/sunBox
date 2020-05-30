package demo01;

/**
 * @author
 * @version 1.0
 * 变量：必须先声明后使用
 * 变量只在其自己的作用域中有效
 * 同一个作用域内不可以声明两个同名的变量
 */
/*
Java中常用数据类型
整形：byte（-128~127）、short、int、long
字符型:char
定义char类型通常使用一对单引号，内部只能写一个字符
浮点型:double、float
布尔型:boolean
Boolean只能去true或false
常常在条件判断或循环结构中使用
使用long类型要用L结尾
使用float类型要用F结尾
 */

public class day01 {
    public static void main(String[] args){
        //定义变量 变量类型 变量名=变量值
        int myAge = 2;
        System.out.println(myAge);
        boolean isMarry=true;
        if(isMarry){
            System.out.println("你不能参加，很遗憾");
        }else{
            System.out.println("你可以");
        }



    }
}
