class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        temp = []
        d = {')':'(', ']':'[', '}':'{'}
        for i in s:
            if i not in d:
                temp.append(i)
            elif i in d:
                top = temp.pop() if temp else '#'
                if d[i] != top:
                    return False
        return False if temp else True
if __name__ == "__main__":
    solve = Solution()
    print(solve.isValid('(((((())))))'))