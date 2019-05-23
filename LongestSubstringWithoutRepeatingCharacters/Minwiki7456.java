import java.util.Scanner;
import java.util.HashSet;
class  Minwiki7456
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		String str = scan.next();
		int start=0,end=0,max=0;
		HashSet<Character> set=new HashSet<Character>();
		while(end<str.length())	
		{
			if(!set.contains(str.charAt(end)))
			{
				set.add(str.charAt(end));
				end++;
				max=(max>(end-start))?max:(end-start);
			}
			else
			{
				set.remove(str.charAt(start));
				start++;
			}
		}
		System.out.println("Max:"+max);
	}
}
