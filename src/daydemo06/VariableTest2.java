package daydemo06;
/*
基本数据类型之间的运算规则
1、自动类型提升
byte -->short --> int --> long --> float --> double
当byte、short、
2、强制类型转换,自动类型提升的逆运算
需要使用强转符()
强制类型转换可能导致精度损失

 */
public class VariableTest2 {
    public static  void  main(String[] args){
        byte b1 = 2;
        int i1 = 12;
        int b2 = b1+i1;
        //强制类型转换
        double d1 =12.3;
        int i2 =(int)d1;
        System.out.println(i2);
        long l1 = 123;
        short s=(short)l1;
        System.out.println(s);
        //String 属于引用数据类型，声明String类型时，使用一对“”
        //String 可以和八中基本数据类型做运算且运算只能是连接运算
        int number = 1001;
        String number1 ="学号";
        System.out.println(number1+number);
        //  练习
        char c ='a';
        int num = 10;
        String str ="hello";
        System.out.printf(c+num+str);
        //练习:输出* *
        System.out.println('*'+'\t'+'*');
        String str1=123+"";
        System.out.println(str1);


    }
}
