import java.util.Scanner;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("result:"+atoi(str));
    }
	private static int atoi(String str)
	{
		int res=0,i=0,flag=1;
		while(i<str.length())
		{
			if(str.charAt(i)==' ')
			{
				i++;
				continue;
			}
			else
			{
				break;
			}
		}
		if(str.length()<=i)
			return 0;
		if(str.charAt(i)=='-')
		{
			flag=-1;
			i++;
		}
		else if(str.charAt(i)=='+')
		{
			i++;
		}
		else if((str.charAt(i)<'0'||str.charAt(i)>'9'))
		{
			return 0;
		}
		while(i<str.length())
		{
			if(str.charAt(i)<'0'||str.charAt(i)>'9')
				break;
			if(res>214748364||(res==214748364&&str.charAt(i)>'7'))
			{
				if(flag>0)
					return Integer.MAX_VALUE;
				else
					return Integer.MIN_VALUE;
			}
			res=res*10+str.charAt(i)-48;
			i++;
		}
		return res*flag;
	}
}
