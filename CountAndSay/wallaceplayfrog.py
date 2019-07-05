class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        count = 1
        r = '1'
        res = ''
        k = 1
        while k < n:
            t = r
            i = 0
            while i < len(t):
                if i + 1 >= len(t):
                    res += str(count) + str(t[i])
                    count = 1
                    break
                if t[i] == t[i + 1]:
                    count += 1
                    i += 1
                else:
                    res += str(count) + str(t[i])
                    count = 1
                    i += 1
            r = res
            res = ''
            k += 1
        return r

solve = Solution()
for i in range (1, 10):
    print(solve.countAndSay(i))