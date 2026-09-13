//寻找导包写在主函数前面
import java.util.Scanner;
public class Scan {
	public static void main(String[] args){
//创建对象表示我要用这个类
		Scanner sc = new Scanner(System.in);
		//接受数据用变量i
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println(i);
		System.out.println(j);
	}
}