class Solution(object):
    def findSubstring(self, s, words):
        """
        :type s: str
        :type words: List[str]
        :rtype: List[int]
        """
        res = []
        if len(words) == 0:
            return res
        if len(s) < len(words[0]):
            return res
        len_word, flag, temp_len = len(words[0]), 0, 0
        i = 0
        while i < len(s):
            if s[i:i+len_word] in words:
                if flag == 0:
                    res.append(i)
                    flag = 1
                i += len_word
                temp_len += len_word               
            else:
                flag = 0
                temp_len = 0
                i += 1
        if temp_len == len(s):
            return []
        return res

solve = Solution()
print(solve.findSubstring("barfoothefoobarman", ["foo","bar"]))
print(solve.findSubstring("wordgoodgoodgoodbestword", ["word","good","best","word"]))
