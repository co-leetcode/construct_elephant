import java.util.Scanner;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String p = scan.next();
		System.out.println("result:"+soluton(s,p));
    }
	private static boolean soluton(String s, String p)
	{
        if (p.isEmpty())
			return s.isEmpty();
        boolean firstMatch = (!s.isEmpty()&&(p.charAt(0)==s.charAt(0)||p.charAt(0) == '.'));
        if (p.length() >= 2 && p.charAt(1) == '*')
		{
            return (soluton(s, p.substring(2))||(firstMatch && soluton(s.substring(1), p)));
        }
		else
		{
            return firstMatch && soluton(s.substring(1), p.substring(1));
        }
    }
	
}

