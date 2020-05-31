package demo02;

import java.util.Scanner;

/*
从键盘接收整数参数。如果该数为1-7，打印对应的星期值，否则打印“非法参数”。
 */
public class testIf {
    public static void main(String[] args){
        //友情提示
        System.out.println("请输入：");
        //使用Scanner类
        Scanner sc = new Scanner(System.in);
        //获取输入的值
        int voe = sc.nextInt();
        if(voe>=1&&voe<=7){
            if(voe==1){
                System.out.println("今天是星期一");
            }else if(voe==2){
                System.out.println("今天是星期二");
            }else if(voe==3){
                System.out.println("今天是星期三");
            }else if(voe==4){
                System.out.println("今天是星期四");
            }else if(voe==5){
                System.out.println("今天是星期五");
            }else if(voe==6){
                System.out.println("今天是星期六");
            }else if(voe==7){
                System.out.println("今天是星期日");
            }
        }else {
            System.out.println("非法参数");
        }
    }
}
