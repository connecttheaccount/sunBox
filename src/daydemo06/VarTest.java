package daydemo06;
/*
变量的使用
   1、格式：数据类型 变量名 = 变量值;
   2、变量必须先声明在使用
 */
public class VarTest {
    public static  void  main(String[] args){
        //定义
        int myAge =12;
        //使用
        System.out.println(myAge);
        //定义float类型时，变量要以f或F结尾
        float f1 = 12.3f;
        System.out.println(f1);
        //通常定义浮点型变量时用double
        //字符型：char (1个字符等于两个字节)
        //定义char类型变量时通常使用单引号,内部只能写一个字符
        char c1 ='A';
        System.out.println(c1);
        //会报错，当用到一个字符串时需要用到String
        //char c2 = 'cd';
        //char类型表示方式：1、声明一个字符2、转义字符3、使用Unicode表示字符型常量
        char cs = '\n';
        System.out.print(cs);
        //布尔型：boolean
        //只有两个值：true false
        //常常在条件判断或循环结构中使用
        boolean a1=true;
        System.out.print(a1);

        boolean isMarried = true;
        if(isMarried){
            System.out.println("很遗憾");
        }else {
            System.out.println("捏可以");
        }
    }
}
