package priactice;

public class Prime {

	//�ж�101-200֮���ж��������������������
	//�������壺��һ������2��Math.sqrt(),����ܱ����������������
	//������������֮�ǡ�
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
		System.out.println("�����ĸ�����"+count);
	}

}
