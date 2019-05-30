class  Minwiki7456
{
	public static void main(String[] args) 
	{
		int[] a=new int[]{2,5,8,11,23,24};
		int[] b=new int[]{4,6,8,12,16,19,19,29};
		System.out.print("median="+findMedian(a,b));		
	}
	private static double findMedian(int[] a,int[] b)
	{
		int m=a.length,n=b.length;
		int ileft=0,iright=m,half=(m+n+1)/2;
		while(ileft<=iright)
		{
			int i=(ileft+iright)/2;
			int j=half-i;
			if(i<iright&&a[i]<b[j-1])
			{
				ileft=i+1;
			}
			else if(i>ileft&&b[j]<a[i-1])
			{
				iright=i-1;
			}
			else
			{
				int maxleft=0;
				if(i==0)
				{
					maxleft=b[j-1];
				}
				else if(j==0)
				{
					maxleft=a[i-1];
				}
				else
				{
					maxleft=a[i-1]>b[j-1]?a[i-1]:b[j-1];
				}
				if((m+n)%2!=0)
				{
					return maxleft;
				}
				int minright=0;
				if(i==m)
				{
					minright=b[j];
				}
				else if(j==m)
				{
					minright=a[i];
				}
				else
				{
					minright=a[i]>b[j]?b[j]:a[i];
				}
				System.out.println("ileft="+ileft+",iright="+iright);
				System.out.println("i="+i+",j="+j);
				System.out.println("maxleft="+maxleft+",minright="+minright);
				return (maxleft+minright)/2.0;
			}
		}
		return 0.0;
	}
}
