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

	}
}