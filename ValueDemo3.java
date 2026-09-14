//学习运算符和运算表达式
public class ValueDemo3{
	public static void main(String[] args){
		//小数的运算不一定精确，整数运算只能得整数
		System.out.println(10/3);
		System.out.println(10.0/3);
		//%计算各个位和%10/10一起用
		int i = 123;
		int j = i%10;
		i = i/10;
		int o = i%10;
		i = i/10;
		int n = i;
		System.out.println(j);
		System.out.println(o);
		System.out.println(n);
		//隐形转换小转大顺序byte<short<int<long<float<double
		//强制转化可以实现大转小
		double a = 100.0;
		int b = (int)a;
		//当+出现字符串时代表连接符号
		//“123”+123 = “123123”
		//byte short char 类型计算时优先转化为int，字符会根据Adcll码表转换
		char c = 'a';
		int result = (c + 0);
		//结果是97
		int x= 10;
//后++：先用后加
//先把x变量中的值拿出来用，赋值给y，然后再进行自增。
//赋值给y的值是自增前的。
		int y = x++;// x=11 y= 10
//先++：先加后用
//先把x进行自增，然后把自增后的结果赋值给左边的变量

//先把x自增，变成12
		int Z = ++x;
		System.out.println("x:"+x);//12
		System.out.println("y:"+ y);//10
		System.out.println("z:"+ Z);//12
		//赋值运算符，关系运算符，优化写法
		//逻辑运算符*异或（相同false不同true），取反！（ture为false）
		//三元运算符
		System.out.println(a>b?a:b);
		//结果为true为a,false为b
		//原码补码反码
		//原码就是二进制，补码就是取反，补码就是加一
		//正数原码反码补码都是本身，负数反码符号位不变其余取反补码是反码加一
		//计算机是补码相加

	}
}
