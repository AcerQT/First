package priactice;

public class Rabbit {
	
	//�ŵ�����
	//��һ�����ӣ��ӳ�������ÿ���¶�������һ��С���ӣ�С���ӳ���������֮��ÿ���¶�������һ������
	//�������Ӷ���������ÿ���µ����������Ƕ��٣�
	public static void main(String[] args) {
			
		int f1=1,f2=1,f,M=24;
		for(int i=3;i<=M;i++) {
			f=f2;
			System.out.println("f:"+f);
			f2=f1+f2;
			System.out.println("f2:"+f2);
			f1=f;
			System.out.println("f1��"+f1);
			System.out.println("�ڣ�"+i+"���µ����Ӷ�����"+f2);
		}
	}

}
