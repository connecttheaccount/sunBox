package demo01;
/*
comment:注释
对所写的程序解释说明增强可读性
调试所写的代码
注释分为三种
单行注释 //

多行注释:是不可以嵌套使用的
文档注释：是Java特有的



 */

/**
 * 文档注释：
 * 注释内容可以被jdk提供的工具Javadoc所解析，
 * 生成一套以网页文件形式体现的该程序的说明文档
 * @author caspar 作者
 * @version v1.0 版本号
 * 使用javadoc解析
 * Javadoc -d 名字 -author -version 源文件名字
 * idea 使用javadoc解析选择tool工具栏》generate Javadoc
 * 参数说明
 *
 * 1.Whole project:整个项目都生成文档
 *
 * 2.Custom scope 自定义范围。如下：
 *
 * （1）project files 项目文件，
 *
 * （2）project production files 项目产品文件，
 *
 * （3）project test files 项目的测试文件， 未知范围，class hierarchy 类层
 *
 * 3.include test source 包含测试目录
 *
 * 4.include JDK and … 包含jdk和其他的第三方jar
 *
 * 5.link to JDK documentation…链接到JDK api
 *
 * 6.output directy 生成的文档存放的位置
 *
 * （1）private、package、protected、public 生成文档的级别（类和方法）
 *
 * （2）右边的Generate…是选择生成的文档包含的内容，层级树、导航、索引..
 *
 * （3）再右边是生成的文档包含的内容信息，作者版本等信息
 *
 * 7.Locale 语言类型,zh-CN
 *
 * 8.Other command line arguments 其他参数
 *
 * 9.Maximum heep… 最大堆栈
 *
 *
 */
/*
在一个源文件中可以声明多个class，但只能最多有一个类声明为public
而且声明为public的类名必须与源文件名相同
 */
/*
pringln:先输入后换行
print:输出不换行
 */
public class Coment {
    //主方法，程序的入口
     public static void main(String[] args){//arguments：参数
         //输出语句，表示输出到控制台
         System.out.println("HelloJava");
    }
}

