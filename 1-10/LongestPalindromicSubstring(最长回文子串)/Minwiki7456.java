import java.util.Scanner;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("最长回文子串:"+manacher(str));
    }
	private static String manacher(String str)
	{
		//插入$,#
		String str2 ="$#";
		for(int i=0;i<str.length();i++)
		{
			str2+=str.charAt(i);
			str2+="#";
		}
		int id=0,mx=0,resCenter=0,resLen=0;
		/*
		id和mx为已知的可延伸至最右的最长子串的中心店和右边界
		resCenter和resLen为已找到的最长子串的中心店和半径
		*/
		int[] p = new int[str2.length()];//p[i]为str2每个节点的最长回文半径
		for(int i=1;i<str2.length()-1;i++)
		{
			p[i]=mx>i? Math.min(p[2 * id - i], mx - i) : 1;
			while (((i - p[i])>=0) && ((i + p[i])<str2.length()-1) && (str2.charAt(i + p[i]) == str2.charAt(i - p[i])))
                ++p[i];
			if (mx < i + p[i]) 
			{
				mx = i + p[i];
				id = i;
			}
			if (resLen < p[i]) 
			{
				resLen = p[i];
				resCenter = i;
			}
		}
		return str.substring((resCenter-resLen)/2,(resCenter-resLen)/2+resLen-1);//由中心点和半径可得最长回文子串首尾索引
	}
}
