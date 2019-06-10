class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """ 
        lookup = {
            "2":"abc",
            "3":"def",
            "4":"ghi",
            "5":"jkl",
            "6":"mno",
            "7":"pqrs",
            "8":"tuv",
            "9":"wxyz"
        }
        if not digits:
            return []
        n = len(digits)
        res = []
        def helper(i,tmp):
            if i == n:
                res.append(tmp)
                return 
            for alp in lookup[digits[i]]:
                helper(i+1,tmp+alp)
        helper(0,"")
        return res
if __name__ == "__main__":
    solve = Solution()
    print(solve.letterCombinations('23'))
