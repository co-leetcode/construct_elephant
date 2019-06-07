package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class foolishPig {

	public static void main(String[] args) {
		int[] nums = {1,0,-1,0,-2,2};
		List<Integer> al = fourSum(nums,0);
		Iterator it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	//参考三数之和的思路进行定二找二
	public static List<Integer> fourSum(int[] nums,int target){
		List<Integer>  al = new ArrayList<Integer>();
		Arrays.parallelSort(nums);		//JDK8之后并行排序速度大于sort串行排序
		for(int i=0;i<nums.length;i++) {
			if(i>0&&nums[i]==nums[i-1])		//当前值与上一个数相等时则跳过
				continue;
			for(int j=i+1;j<nums.length;j++) {
				if(j>i+1&&nums[j]==nums[j-1])		//当前值与上一个值相等时则跳过
					continue;
				int twoSum = target-(nums[i]+nums[j]);		//需要查找的与目标值相差的两数之和
				int left = j+1;			//左指针
				int right = nums.length-1;			//右指针
				while(left<right) {
					if(left>j+1&&nums[left]==nums[left-1]) {			//当前值与上一个值相等则跳过继续查找
						left++;
						continue;
					}
					if(right<nums.length-1&&nums[right]==nums[right+1]) {			//当前值与上一个值相等则跳过继续查找
						right--;
						continue;
					}
					if(nums[left]+nums[right]<twoSum)			//当前两数的和小于目标差值,则左指针向右移
						left++;
					else if(nums[left]+nums[right]>twoSum)			//当前两数的和大于目标差值,则右指针左移
						right--;
					else if(nums[left]+nums[right]==twoSum) {		//当前两数的和符合查找要求则进行存储,并将指针移动继续查找符合条件的数
						al.add(nums[i]);
						al.add(nums[j]);
						al.add(nums[left]);
						al.add(nums[right]);
						++left;
						--right;
					}	
				}
			}
		}
		return al;
	}
}
