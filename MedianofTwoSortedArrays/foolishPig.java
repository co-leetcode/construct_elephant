package com.LeetCode;

public class foolishPig {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		int b[] = {1,2,3,4,5,6};
		System.out.println(find(a,b));
	}
	//返回较大数字
	public static double returnMax(double a,double b) {
		if(a>b)
			return a;
		else
			return b;
	}
	//返回较小数字
	public static double returnMin(double a,double b) {
		if(a<b)
			return a;
		else
			return b;
	}
	//查找中位数
	public static double find(int[] a,int[] b) {
		if(a.length>b.length)
			return find(b,a);		//保证是在长度小的数组中查找切割的合适位置
		int length = a.length+b.length;
		int cut1 = 0;		//数组1切割的合适位置
		int cut2 = 0;		//数组2切割的合适位置
		int cutL = 0;  		//开始切割的变化范围
		int cutR = a.length;
		while(cut1<=a.length) {
			cut1 = (cutR-cutL)/2+cutL;		//二分查找更新每次切割的位置
			cut2 = (length/2)-cut1;
			//初始化切割后所查找到的中位数
			double L1 = a[cut1-1];
			double L2 = b[cut2-1];
			double R1 = a[cut1];
			double R2 = b[cut2];
			//保证切割后两数组之间任意左边的元素都小于任意右边的元素,且使左右两边元素数目尽可能相同
			if(L1>R2) 
				cutR = cut1-1;
			else if(L2>R1)
				cutL = cut1+1;
			else {
				if(length%2==0) {		//若两数组长度和为偶数,则中位数为中间两数的平均数
					return (returnMax(L1,L2)+returnMin(R1,R2));
				}else {								//若两数组长度和为奇数,则中位数为最中间的数字
					return returnMin(R1,R2);		
				}
			}
		}
		return -1;
	}
}
