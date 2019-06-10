import java.util.Stack;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		System.out.println("resulst:"+isValid("{}[]({})"));

	}
	private static Boolean isValid(String str)
	{
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			switch(str.charAt(i))
			{
				case '(':
					stack.push('(');
					break;
				case '[':
					stack.push('[');
					break;
				case '{':
					stack.push('{');
					break;
				case ')':
					if((!stack.empty())&&stack.peek()=='(')
						stack.pop();
					else
						return false;
					break;
				case ']':
					if((!stack.empty())&&stack.peek()=='[')
						stack.pop();
					else
						return false;
					break;
				case '}':
					if((!stack.empty())&&stack.peek()=='{')
						stack.pop();
					else
						return false;
					break;
				
			}
		}
		if(stack.empty())
			return true;
		return false;
	}
}
