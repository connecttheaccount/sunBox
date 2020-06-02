package demo02;

import java.util.Scanner;

//从键盘分别输入年、月、日，判断这一天是当年的第几天
public class TestDaysOfYear {
    public static void main(String[] args){
        //使用Scanner类获取输入信息
        System.out.println("请输入当前年份：");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println("请输入当前月份:");
        int month = input.nextInt();
        System.out.println("请输入当前日期：");
        int day = input.nextInt();
        switch (month){
            case 12:
                //十一月前的总天数
        }

    }
}
