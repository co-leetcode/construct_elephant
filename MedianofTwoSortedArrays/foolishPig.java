package ţ����������;

public class foolishPig {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		int b[] = {1,2,3,4,5,6};
		System.out.println(find(a,b));
	}
	//���ؽϴ�����
	public static double returnMax(double a,double b) {
		if(a>b)
			return a;
		else
			return b;
	}
	//���ؽ�С����
	public static double returnMin(double a,double b) {
		if(a<b)
			return a;
		else
			return b;
	}
	//������λ��
	public static double find(int[] a,int[] b) {
		if(a.length>b.length)
			return find(b,a);		//��֤���ڳ���С�������в����и�ĺ���λ��
		int length = a.length+b.length;
		int cut1 = 0;		//����1�и�ĺ���λ��
		int cut2 = 0;		//����2�и�ĺ���λ��
		int cutL = 0;  		//��ʼ�и�ı仯��Χ
		int cutR = a.length;
		while(cut1<=a.length) {
			cut1 = (cutR-cutL)/2+cutL;		//���ֲ��Ҹ���ÿ���и��λ��
			cut2 = (length/2)-cut1;
			//��ʼ���и�������ҵ�����λ��
			double L1 = a[cut1-1];
			double L2 = b[cut2-1];
			double R1 = a[cut1];
			double R2 = b[cut2];
			//��֤�и��������֮��������ߵ�Ԫ�ض�С�������ұߵ�Ԫ��,��ʹ��������Ԫ����Ŀ��������ͬ
			if(L1>R2) 
				cutR = cut1-1;
			else if(L2>R1)
				cutL = cut1+1;
			else {
				if(length%2==0) {		//�������鳤�Ⱥ�Ϊż��,����λ��Ϊ�м�������ƽ����
					return (returnMax(L1,L2)+returnMin(R1,R2));
				}else {								//�������鳤�Ⱥ�Ϊ����,����λ��Ϊ���м������
					return returnMin(R1,R2);		
				}
			}
		}
		return -1;
	}
}
