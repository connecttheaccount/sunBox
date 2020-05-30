package demo01;

/**
 * 获取随机数
 * 形成公式
 * [a,b]:(int)(Math.random()*(b-a+1)+a)
 */
public class demo05 {
    public static void main(String[] args){
        //使用Math类生成随机数，范围是【0.0，1.0）；
        for (int i=0;i<=100;i++){
            double voe = (int)(Math.random()*90+10);//先乘后加形成了【10.0,100.0）同时使用强制类型装换变成整数
            System.out.println("第"+(i+1)+"个"+voe);
        }

    }

}
