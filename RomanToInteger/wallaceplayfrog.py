class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        d = {'I' : 1,
            'IV' : 4,
            'V' : 5,
            'IX' : 9,
            'X' : 10,
            'XL' : 40,
            'L' : 50,
            'XC' : 90,
            'C' : 100,
            'CD' : 400,
            'D' : 500,
            'CM' : 900,
            'M' : 1000}
        s_list = list(s)
        res = 0
        t1, t2 = '', ''
        while s_list:
            t1 = s_list.pop()
            if len(s_list) > 0:
                t2 = s_list.pop()
            else:
                t2 = ''
            t3 = t2 + t1
            if t3 in d:
                res += d[t3]
            else:
                res += d[t1]
                s_list.append(t2)
        return res

if __name__ == "__main__":
    solve = Solution()
    print(solve.romanToInt('IV'))