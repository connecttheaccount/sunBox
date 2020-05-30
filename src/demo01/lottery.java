package demo01;

import java.util.Scanner;

/**
 * 程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
 *
 * 1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
 * 2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
 * 3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
 * 4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
 * 5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
 */
public class lottery {
    public static void main(String[] args){
        //使用Math类生成随机数字，公式【a,b】b-a+1)+a
        double voe = (int)(Math.random()*(99-1+1)+1);//使用强制类型装换生成整数
        int getShi = (int)voe/10;//随机数对10取整得到十位上的数字
        int getGe = (int)voe%10;//随机数对10取余得到各位上的数字
        System.out.println("产生的随机数："+voe);

        //使用Scanner类获取用户输入数字
        System.out.println("请输入数字:");
        Scanner sc = new Scanner(System.in);
        int vee = sc.nextInt();

        //对输入的数字去个位和十位上的数字
        int postShi = vee/10;
        int postGe = vee%10;

        //先对用户输入的数字进行判断
        if(vee>=1&&vee<100) {
            if (postShi == getShi && postGe == getGe) {
                System.out.println("恭喜你，奖励10000美金");
            } else if (postGe == getShi && postShi == getGe) {
                System.out.println("与预定的顺序不一致但数字相同奖励3000美金");
            } else if (postShi == getShi || postGe == getGe) {
                System.out.println("只才对一位奖励1000美金");
            } else if (postGe == getShi || postShi == getGe) {
                System.out.println("非顺序只猜对一位奖励500美金");
            } else {
                System.out.println("很遗憾没中奖，彩票作废");

            }
        }else {
            System.out.println("请输入正确数字");
        }



    }
}
