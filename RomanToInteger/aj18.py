class Solution(object):
    def romanToInt(self, s):
        num_tuple = [1000, 500, 100, 50, 10, 5, 1]
        roman_tuple = ['M', 'D', 'C', 'L', 'X', 'V', 'I']
        merge_dic = dict(zip(roman_tuple, num_tuple))
        num = 0
        for i in range(len(s)-1):
            if merge_dic[s[i]] < merge_dic[s[i+1]]:
                num -= merge_dic[s[i]]
            else:
                num += merge_dic[s[i]]
        num += merge_dic[s[-1]]
        return num


if __name__ == '__main__':
    s = Solution()
    print(s.romanToInt("IV"))
