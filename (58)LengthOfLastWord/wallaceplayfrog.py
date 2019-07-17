class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        string = s[::-1]
        string = string.strip(' ')
        res = 0
        for i in string:
            if i != ' ':
                res += 1
            if i == ' ':
                break
        return res

solve = Solution()
print(solve.lengthOfLastWord('hello world'))