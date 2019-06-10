class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
        closest = nums[0]+nums[1]+nums[2]
        
        for i in range(len(nums)-2):
            left, right = i+1, len(nums)-1
            
            while left < right:
                total = nums[i] + nums[left] + nums[right]
                
                if total == target:
                    return target
                
                if abs(total-target) < abs(closest-target):
                    closest = total
                    
                if total < target:
                    left += 1
                elif total > target:
                    right -= 1
        
        return closest

if __name__ == "__main__":
    solve = Solution()
    print(solve.threeSumClosest([-1, 2, 1, -4],1))
