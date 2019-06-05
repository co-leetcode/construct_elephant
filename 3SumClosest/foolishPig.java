package com.LeetCode;

import java.util.Arrays;

public class foolishPig {

	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4}; 
		int target = 1;
		System.out.println(serch(nums,target));
	}

	public static int serch(int[] nums,int target) {
		Arrays.sort(nums);
		int value = nums[0]+nums[1]+nums[2];		//初始化最接近目标值的三个数的和
		for(int i=0;i<nums.length;i++) {
			int start = i+1,end = nums.length-1;
			while(start<end) {
				int sum = nums[start]+nums[end]+nums[i];		//当前三个数字的和
				if(Math.abs(sum-target)<Math.abs(value-target))		//判断差值更小的三个整数的值
					value = sum;
				if(sum<target)		//小于目标值则前指针后移
					start++;
				else if(sum>target)		//大于目标值则后指针前移
					end--;
				else
					return value;
			}
		}
		return value;
	}
}
