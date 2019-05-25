class Solution:
    def longestPalindrome(self, s):
        if not s :
            return ""
        res = ""
        n = len(s)
        dp = [[0] * n for i in range(n)]
        #print(dp)
        max_len = float("-inf")#负无穷，小于任意数
        for i in range(n):
            for j in range(i,-1,-1):
                if s[i] == s[j] and (i - j < 2 or dp[i-1][j+1]):
                    dp[i][j] = 1
                if dp[i][j] and  max_len < i - j + 1:
                    #print("i,j",i,j)
                    res = s[j:i+1]
                    max_len = i - j + 1
                for k in range(n):
                    print(dp[k])
                print('\n')
        return res
        
if __name__ == "__main__":
    solve = Solution()
    print(solve.longestPalindrome('wacdmasdsabb'))