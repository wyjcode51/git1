//学习if条件语句
public class ValueDemo4 {
	public static void main(String[] args){
		int wine = 2;
		if (wine>2){
			System.out.println("good guys");
		}
		else{
			System.out.println("hahaha");
		//if的嵌套
			int i = 0;
			if (i>0){
				i = 1;
			} else if (i<0) {
				i = -1;
			}
			else {
				i = 2;
			}
			System.out.println(i);
		}
		//switch语句要用break否则会穿透
		int day = 1;
		switch (day){
			case 1,2,3,4,5:
				System.out.println("工作日");
				break;
				case 6,7:
					System.out.println("休息日");
					break;
		}
		//for循环
		for(int j = 0;j<=5;j++){
			System.out.println("hello world");
		}
		//while循环
		int e = 5;
		while(e>0){
			System.out.println("hello world");
			e--;
		}
		//do while循环
		int h = 0;
		do {
			System.out.println("hello world");
		}
		while(h>0);
	}
}
