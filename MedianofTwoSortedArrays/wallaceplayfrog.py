class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        for i in nums2:
            nums1.append(i)
        tmp = list(set(nums1))
        tmp.sort()
        if len(tmp) % 2 == 1:
            return tmp[len(tmp)//2]
        else:
            return (tmp[len(tmp)//2] + tmp[len(tmp)//2 - 1])/2

if __name__ == "__main__":
    solve = Solution()
    print(solve.findMedianSortedArrays([1,2,3,4,5], [6,7,8,9,10]))
