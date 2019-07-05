class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        count = 1
        res = ''
        i = 0
        while i < len(n) - 1:
            if n[i] == n[i+1]:
                count += 1
                i += 1
                if i >= len(n) - 1:
                    res += str(count) + str(n[i])
                    break
            else:
                res += str(count) + str(n[i])
                count = 1
                i += 1
        return res

solve = Solution()
print(solve.countAndSay('1211'))