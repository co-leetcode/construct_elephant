class Solution(object):
    def reverse(self, x):
        x_str = str(x)
        x_revstr = ''
        while x_str:
            x_revstr += x_str[-1]
            x_str = x_str[:len(x_str) - 1]
            #print(x_str)
        if x >= 0:
            if int(x_revstr) > (2 ** 31) - 1:
                return 0
            else:
                return int(x_revstr)
        else:
            x_revstr = x_revstr[:len(x_revstr) - 1]
            if int(x_revstr) * -1 < -2 ** 31:
                return 0
            else:
                return int(x_revstr) * -1

if __name__ == '__main__':
    solve = Solution()
    print(solve.reverse(123))
    print(solve.reverse(-123))
    print(solve.reverse(120))