class Solution:
    def ispalindrome(self, x):
        if x<0:
            return False
        else:
            x=str(x)
            if x==x[::-1]:
                return True
            else:
                return False
if __name__ == "__main__":
    solve = Solution()
    print(solve.ispalindrome(1221))
