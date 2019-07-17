class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        res = []
        def backtrack(S = '', left = 0, right = 0):
            if len(S) == 2 * n:
                res.append(S)
                return
            if left < n:
                print(S)
                backtrack(S+'(', left+1, right)
            if right < left:
                print(S)
                backtrack(S+')', left, right+1)
        
        backtrack()
        return res

solve = Solution()
print(solve.generateParenthesis(3))