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
	//�ο�����֮�͵�˼·���ж����Ҷ�
	public static List<Integer> fourSum(int[] nums,int target){
		List<Integer>  al = new ArrayList<Integer>();
		Arrays.parallelSort(nums);		//JDK8֮���������ٶȴ���sort��������
		for(int i=0;i<nums.length;i++) {
			if(i>0&&nums[i]==nums[i-1])		//��ǰֵ����һ�������ʱ������
				continue;
			for(int j=i+1;j<nums.length;j++) {
				if(j>i+1&&nums[j]==nums[j-1])		//��ǰֵ����һ��ֵ���ʱ������
					continue;
				int twoSum = target-(nums[i]+nums[j]);		//��Ҫ���ҵ���Ŀ��ֵ��������֮��
				int left = j+1;			//��ָ��
				int right = nums.length-1;			//��ָ��
				while(left<right) {
					if(left>j+1&&nums[left]==nums[left-1]) {			//��ǰֵ����һ��ֵ�����������������
						left++;
						continue;
					}
					if(right<nums.length-1&&nums[right]==nums[right+1]) {			//��ǰֵ����һ��ֵ�����������������
						right--;
						continue;
					}
					if(nums[left]+nums[right]<twoSum)			//��ǰ�����ĺ�С��Ŀ���ֵ,����ָ��������
						left++;
					else if(nums[left]+nums[right]>twoSum)			//��ǰ�����ĺʹ���Ŀ���ֵ,����ָ������
						right--;
					else if(nums[left]+nums[right]==twoSum) {		//��ǰ�����ĺͷ��ϲ���Ҫ������д洢,����ָ���ƶ��������ҷ�����������
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
