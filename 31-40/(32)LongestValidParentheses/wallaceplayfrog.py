class Solution(object):
    def longestValidParentheses(self, s):
        """
        :type s: str
        :rtype: int
        """
        length = 0
        stack = []
        for i in s:
            if i is '(':
                stack.append(0)
            else: 
                if len(stack) > 1: 
                    val = stack.pop() 
                    stack[-1] += val + 2 
                    length = max(length, stack[-1]) 
                else: 
                    stack = [0] 
        
        return longest
