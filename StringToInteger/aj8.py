class Solution(object):
    def atoi(self,s):
        digits='0123456789'
        s = s.lstrip()
        if (len(s) >= 1 and s[0] in digits) or (len(s) >= 2 and s[0] in "+-" and s[1] in digits):
            s_num = s[0]
            for char in s[1:]:
                if char not in digits:
                    break
                s_num += char
            num = int(s_num)
            if num < -2**31:
                return -2**31
            elif num > (2**31 - 1):
                return 2**31 - 1
            return num
        return 0
if __name__ == "__main__":
    solve = Solution()
    print(solve.atoi('4193 with words'))
    
