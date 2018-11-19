package priactice;

public class Prime {

	//判断101-200之间有多少素数，并输出所有数
	//素数含义：用一个数除2到Math.sqrt(),如果能被整除，则表明此数
	//不是素数，反之是。
	public static void main(String[] args) {
		int count = 0;
		for(int i=101;i<=200;i+=2) {
			boolean b=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					b=false;
					break;
				}else {
					b=true;
				}
			}
		if(b=true) {
			count++;
			System.out.println(i);
		}
	}
		System.out.println("素数的个数是"+count);
	}

}
