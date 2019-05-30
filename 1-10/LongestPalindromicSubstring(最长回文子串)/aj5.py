class Solution:
    def longestPalindrome(self,s):
        dic={}
        for i in range(len(s)):
            for j in range(len(s)):
                if s[j:i:-1]==s[i:j:]:
                    dic[i]=j-i
        k=list(dic.keys())[list(dic.values()).index(max(dic.values()))]
        v=max(dic.values())
        return s[k:v+k+1:]
if __name__=='__main__':
    solve=Solution()
    print(solve.longestPalindrome('asdfgfdsao'))
    
