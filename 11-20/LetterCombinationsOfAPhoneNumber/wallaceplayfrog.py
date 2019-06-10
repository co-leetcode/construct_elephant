class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        if not digits:
            return
        
        d = {
            '2':['a', 'b', 'c'],
            '3':['d', 'e', 'f'],
            '4':['g', 'h', 'i'],
            '5':['j', 'k', 'l'],
            '6':['m', 'n', 'o'],
            '7':['p', 'q', 'r', 's'],
            '8':['t', 'u', 'v'],
            '9':['w', 'x', 'y', 'z']
        }
        digit_l = list(digits)        
        res = ['']
        
        while digit_l:
            i = digit_l.pop(0)
            res_ = []
            for j in res:
                for k in d[i]:
                    res_.append(j+k)
            res = res_
        
        return res

if __name__ == "__main__":
    solve = Solution()
    print(solve.letterCombinations('23'))