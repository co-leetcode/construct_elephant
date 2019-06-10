import java.util.Scanner;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println("result:"+solution(num));
	}
	private static String solution(int num)
	{
		int[] nums=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] strs=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		String str="";
		for(int i=0;i<13;i++)
		{
			while(num>=nums[i])
			{
				num=num-nums[i];
				str=str+strs[i];
			}
		}
		return str;
    }
}

