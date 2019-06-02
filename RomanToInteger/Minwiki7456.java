import java.util.Scanner;
import java.util.HashMap;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str=scan.next();
		System.out.println("result:"+solution(str));
	}
	private static int solution(String str)
	{
		//int[] nums=new int[]{1000,500,100,50,10,5,1};
		//char[] strs=new char[]{'M','D','C','L','X','V','I'};
		int num=0;
		HashMap<Character,Integer> rome=new HashMap<Character,Integer>();
		rome.put('M',1000);
		rome.put('D',500);
		rome.put('C',100);
		rome.put('L',50);
		rome.put('X',10);
		rome.put('V',5);
		rome.put('I',1);
		int i=1;
		while(i<str.length())
		{
			if(rome.get(str.charAt(i))>rome.get(str.charAt(i-1)))
			{
				num+=rome.get(str.charAt(i))-rome.get(str.charAt(i-1));
				i=i+2;
			}
			else
			{
				num+=rome.get(str.charAt(i-1));
				i++;
			}
		}
		if(i==str.length())
			num+=rome.get(str.charAt(i-1));
		return num;

    }
}

