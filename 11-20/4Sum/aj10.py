def four_sum(nums, target):
    nums.sort()
    res = []

    if len(nums) < 4 or not nums: return res
    if nums[-4] + nums[-3] + nums[-2] + nums[-1] < target: return res
    if nums[0] + nums[1] + nums[2] + nums[3] > target: return res
    
    for f in range(len(nums) - 3):
        if nums[f] + nums[-3] + nums[-2] + nums[-1] < target: 
            continue
        for t in range(f + 1, len(nums) - 2):
            if nums[f] + nums[t] + nums[-2] + nums[-1] < target: 
                continue

            l = t + 1
            r = len(nums) - 1
            if (f > 0 and nums[f] == nums[f - 1]) or (t > (f + 1) and nums[t] == nums[t - 1]):
                continue

            while l < r:
                four_ele = [nums[f], nums[t], nums[l], nums[r]]
                if sum(four_ele) == target:
                    res.append(four_ele)
                    l += 1
                    r -= 1
                    while l < r and nums[l] == nums[l - 1]: l += 1
                    while l < r and nums[r] == nums[r + 1]: r -= 1
                elif sum(four_ele) < target: 
                    l += 1
                else:
                    r -= 1
    return res

nums = [1, 0, -1, 0, -2, 2]
target = 0
print(four_sum(nums, target))
[[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
