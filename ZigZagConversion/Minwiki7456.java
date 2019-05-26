import java.util.Scanner;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int num = scan.nextInt();
		if(num==1)//num为1时直接输出字符串
		{
			System.out.println(str);
			return;
		}
		char[][] results=solution(str,num);
		for(int i=0;i<results.length;i++)//输出结果
		{
			for(int j=0;j<results[i].length;j++)
			{
				if(results[i][j]!=0)
				{
					System.out.print(results[i][j]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
    }
	private static char[][] solution(String str,int num)
	{
		char[][] results=new char[num][str.length()/2];
		for(int i=0;i<str.length();i++)
		{
			int p=i%(2*num-2),tmp=i/(2*num-2);
			if(p<num)
			{
				results[p][tmp*(num-1)]=str.charAt(i);
			}
			else
			{
				results[2*num-2-p][1+p-num+tmp*(num-1)]=str.charAt(i);
			}
		}
		return results;
	}
}
