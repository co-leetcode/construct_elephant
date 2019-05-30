import java.util.Scanner;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("result:"+solution(num));
    }
	private static int solution(int num)
	{
		int result=0,tmp=0;
		do
		{
			if(result>214748364)
				return 0;
			if(result<-214748364)
				return 0;
			tmp=num%10;
			result=result*10+tmp;
			num=num/10;
		}
		while (num!=0);
		return result;
	}
}
