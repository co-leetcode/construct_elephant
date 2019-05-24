class Solution:
    def findMedianSortedArrays(self, nums1, nums2) :
        while (len(nums1) + len(nums2)) > 2:
            if nums1 and nums2:
                if nums1[0] < nums2[0]:
                    nums1.pop(0)
                else:
                    nums2.pop(0)
                if nums1 and nums2:
                    if nums1[-1] > nums2[-1]:
                        nums1.pop(-1)
                    else:
                        nums2.pop(-1)
                elif nums1 is []:
                    nums2.pop(-1)
                else:
                    nums1.pop(-1)
            elif nums1 is []:
                nums2.pop(0)
                nums2.pop(-1)
            else:
                nums1.pop(0)
                nums1.pop(-1)      
        tmp = nums1 + nums2
        return (tmp[0]+tmp[-1])/2

if __name__ == "__main__":
    solve = Solution()
    print(solve.findMedianSortedArrays([1,2,3,4,5], [6,7,8,9,10]))
