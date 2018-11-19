package priactice;

public class Rabbit {
	
	//古典问题
	//有一对兔子，从出生后起每个月都会生出一对小兔子，小兔子长到三个月之后，每个月都会生出一对兔子
	//假设兔子都不会死，每个月的兔子总数是多少？
	public static void main(String[] args) {
			
		int f1=1,f2=1,f,M=24;
		for(int i=3;i<=M;i++) {
			f=f2;
			System.out.println("f:"+f);
			f2=f1+f2;
			System.out.println("f2:"+f2);
			f1=f;
			System.out.println("f1："+f1);
			System.out.println("第："+i+"个月的兔子对数："+f2);
		}
	}

}
