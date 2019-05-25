class Solution(object):
    def lengthOfLongestSubstring(self, s):
        slist = list(s)
        sum = 0
        d = []
        for i in slist:
            if i in d:
                search = d.index(i)
                d.append(i)
                d = d[search + 1:]
            else:
                d.append(i)
                if len(d) > sum:
                    sum = len(d)
        return sum

if __name__=="__main__":
    solve = Solution()
    print(solve.lengthOfLongestSubstring('abcabcbb'),
        solve.lengthOfLongestSubstring('bbbbb'),
        solve.lengthOfLongestSubstring('pwwkew'),
        solve.lengthOfLongestSubstring('werttywsgva'))
