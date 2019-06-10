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
		int value = nums[0]+nums[1]+nums[2];		//��ʼ����ӽ�Ŀ��ֵ���������ĺ�
		for(int i=0;i<nums.length;i++) {
			int start = i+1,end = nums.length-1;
			while(start<end) {
				int sum = nums[start]+nums[end]+nums[i];		//��ǰ�������ֵĺ�
				if(Math.abs(sum-target)<Math.abs(value-target))		//�жϲ�ֵ��С������������ֵ
					value = sum;
				if(sum<target)		//С��Ŀ��ֵ��ǰָ�����
					start++;
				else if(sum>target)		//����Ŀ��ֵ���ָ��ǰ��
					end--;
				else
					return value;
			}
		}
		return value;
	}
}
