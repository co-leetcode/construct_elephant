class  Minwiki7456
{
	public static void main(String[] args)
	{
		
		String[] strs=new String[]{"flower","flow","flight"};
		System.out.println("result:"+solution(strs));
	}
	private static String solution(String[] strs)
	{
		if(strs.length==0)
            return "";
		String str =""+strs[0];
		for(int i=1;i<strs.length;i++)
		{	
			int j=0;
			while(j<str.length()&&j<strs[i].length())
			{
				if(str.charAt(j)!=strs[i].charAt(j))
				{
					str=str.substring(0,j);
					break;
				}
				j++;
			}
			if(j>=str.length()||j>=strs[i].length())
				str=str.substring(0,j);
		}
		return str;

    }
}

