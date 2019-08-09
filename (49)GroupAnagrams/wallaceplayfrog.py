import collections

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        ans = {}
        for each in strs:
            tmp = tuple(sorted(each))
            if tmp in list(ans.keys()):
                ans[tmp].append(each)
            else:
                ans[tmp] = []
                ans[tmp].append(each)
        return ans.values()

    #官解牛逼
    def _groupAnagrams(self, strs):
        ans = collections.defaultdict(list)
        for each in strs:
            ans[tuple(sorted(each))].append(each)
        return ans.values()

solve = Solution()
print(solve.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
