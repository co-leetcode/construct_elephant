import re
class Solution(object):
    def myAtoi(self, s):
        temp = '0123456789'
        res_str = ''
        flag = 0
        for i in range(len(s)):
            if s[i] is not ' ' and s[i] not in temp and s[i] is not '-':
                flag = 0
                break
            elif s[i] is not ' ' and (s[i] in temp or s[i] is'-'):
                flag = 1
                break
        if flag == 0 or len(s) == 0:
            return 0
        else:
            for i in range(len(s)):
                if (s[i] is '-' and res_str is '') or (s[i] in temp):
                    res_str += s[i]
        res = int(res_str)
        if res < -(2**31):
            return -(2**31)
        if res > (2**31) -1:
            return (2**31) -1
        else:
            return res
    
    def myAtoi2(self, s):
        pattern = re.compile(' *[\+\-]?[0-9]+')
        matcher = re.match(pattern, s)
        if matcher is not None:
            res = int(matcher.group(0))
        else:
            return 0
        if res < -(2**31):
            return -(2**31)
        elif res > (2**31) -1:
            return (2**31) -1
        else:
            return res

if __name__ == "__main__":
    solve = Solution()
    print(solve.myAtoi2('42'))
    print(solve.myAtoi2(' -42'))
    print(solve.myAtoi2('4193 with words'))
    print(solve.myAtoi2('words and 987'))
    print(solve.myAtoi2('-91283472332'))