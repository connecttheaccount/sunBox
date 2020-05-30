package demo01;
/*
if选择结构和Scanner联系
首先实例化Scanner类
定义变量接受输入的值，根据输入的值进行判断
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class demoif01 {
    public static void main(String[] args){
        //实例化Scanner类
        Scanner scan = new Scanner(System.in);
        //友情提示
        System.out.println("请输入成绩：");
        //接受输入的值
        int cj = scan.nextInt();
        //根据输入的值进行判断
        if(cj>=90){
            System.out.println("您的成绩为："+cj+"成绩很好");
        }else if(cj>=80){
            System.out.println("成绩良好");
        }else if(cj>=60){
            System.out.println("成绩及格");
        }else{
            System.out.println("不及格");
        }
    }
}
