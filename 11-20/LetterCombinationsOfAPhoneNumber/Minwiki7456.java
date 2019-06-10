import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		String str = scan.next();
		System.out.println("result:"+letterCombinations(str));
	}
	private static List<String> letterCombinations(String str)
	{
		List<String> results = new LinkedList<>();
		if(str.length()==0)
			return results;
		results.add("");
		/*
		Map<Character, String> map = new HashMap<Character, String>();
		map.put('2',"abc");
		map.put('3',"def");
		map.put('4',"ghi");
		map.put('5',"jkl");
		map.put('6',"mno");
		map.put('7',"pqrs");
		map.put('8',"tuv");
		map.put('9',"wxyz");
		*/
		String[] dic = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		/*
		int[] amount = new int[]{3,3,3,3,3,4,3,4};
		int num =  Integer.parseInt(str);
		String tempStr = "";
		*/
		for(int i=0;i<str.length();i++)
		{
			List<String> tempRes = new LinkedList<>();
			String letters=dic[str.charAt(i)-'2'];
			for(int j=0;j<letters.length();j++)
			{
				for(int k=0;k<results.size();k++)
				tempRes.add(results.get(k)+letters.charAt(j));
			}
			results=tempRes;
		}
		return results;
	}
}
