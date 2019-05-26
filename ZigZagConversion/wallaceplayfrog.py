class Solution(object):
    def convert(self, s, numRows):
        res = [''] * numRows
        if numRows == 1 or numRows > len(s):
            return s
        i, j, k = 0, 1, 0
        while k < len(s):
            res[i] += s[k]
            if i == numRows - 1:
                j = -1
            elif i == 0:
                j = 1
            i += j
            k += 1
            print(res)
        return ''.join(res)

if __name__ == '__main__':
    solve = Solution()
    print(solve.convert('LEETCODEISHIRING', 3))