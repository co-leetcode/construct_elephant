class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s)<2 or len(s)%2!=0:
            if s=='':
                return True
            else:
                return False
        count = 0
        length = len(s)
        while(count<length/2):
            s = s.replace("{}","").replace("[]","").replace("()","")
            count+=1
        if len(s)>0:
            return False
        else:
            return True
if __name__ == "__main__":
    solve = Solution()
    print(solve.isValid('(((((())))))'))
