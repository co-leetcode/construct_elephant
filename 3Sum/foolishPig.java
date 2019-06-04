package com.LeetCode;

import java.util.ArrayList;
import java.util.Iterator;

public class foolishPig {

	public static void main(String[] args) {
		int[] nums = {1,1};
		Iterator it = serch(nums).iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	public static ArrayList<Integer> serch(int[] nums) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			for(int j=nums.length-1;j>i;j--) {
				int index = 0;
				while(index<nums.length) {
					if(i!=j&&j!=index&&i!=index&&nums[i]+nums[j]+nums[index]==0&&!al.contains(nums[index])) {
						al.add(nums[i]);
						al.add(nums[j]);
						al.add(nums[index]);
					}
					index++;
				}
			}
		}
		return al;
	}
}
