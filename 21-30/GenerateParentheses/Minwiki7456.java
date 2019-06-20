import java.util.List;
import java.util.ArrayList;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		System.out.println(generateParenthesis(3));
	}
	private static List<String> generateParenthesis(int n)
	{
		//官方第三种方法
		List<String> ans = new ArrayList<>();
        if (n == 0)
		{
            ans.add("");
        }else
		{
            for (int c = 0; c < n; ++c)
                for (String left: generateParenthesis(c))
                    for (String right: generateParenthesis(n-1-c))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
	}
}