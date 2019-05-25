class Solution(object):
    def twosum(self, nums, target):
        d = {}
        i = 0
        for num in nums:
            for key in d.keys():
                if num + key == target:
                    return [d[key], i]
            d[num] = i
            i += 1

if __name__ == '__main__':
    solve = Solution()
    print(solve.twosum([2, 7, 11, 5], 9))
