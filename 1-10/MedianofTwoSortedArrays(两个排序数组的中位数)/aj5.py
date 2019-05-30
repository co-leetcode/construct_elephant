class Solution:
    def findMedianSortedArrays(self, nums1, nums2):
        for i in range(len(nums2)):
            nums1.append(nums2[i])
        nums1 = sorted(nums1)
        l = len(nums1)
        if l % 2 == 0:
            return (nums1[l//2] + nums1[l//2-1]) / 2
        else:
            return float(nums1[l//2])
if __name__=="__main__":
    solve=Solution()
    print(solve.findMedianSortedArrays([1,2,4,6],[9,7,8]))        
