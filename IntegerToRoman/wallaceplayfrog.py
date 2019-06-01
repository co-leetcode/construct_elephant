class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        d = {1 : 'I',
            4 : 'IV',
            5 : 'V',
            9 : 'IX',
            10 : 'X',
            40 : 'XL',
            50 : 'L',
            90 : 'XC',
            100 : 'C',
            400 : 'CD',
            500 : 'D',
            900 : 'CM',
            1000 : 'M'}
        l = []
        for key in d.keys():
            l.append(key)
        l.sort(reverse = True)
        res = ''
        for key in l:
            temp = num // key
            if temp == 0:
                continue
            else:
                res += d[key] * temp
                num -= temp * key 
            if num == 0:
                break
        return res

if __name__ == "__main__":
    solve = Solution()
    print(solve.intToRoman(58))
        