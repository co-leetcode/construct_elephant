import java.util.Scanner;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("result:"+soluton(num));
    }
	private static boolean soluton(int num)
	{
		if(num<0||(num%10==0&&num>0))
			return false;
		int num2=0;
		while(num!=0)
		{
			if(num==num2||(num/10==num2))
				return true;
			num2=num2*10+num%10;
			num=num/10;
		}
		if(num2==num)
			return true;
		else
			return false;
	}
}
