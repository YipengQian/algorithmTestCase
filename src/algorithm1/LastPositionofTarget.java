package algorithm1;

public class LastPositionofTarget {
	/**
	 * 解题思路：本题主要是二分法的使用，题目明确要求需要求最后一个与target相等的数，所以设置数值时尽量向后靠，并检查start及end两个数字且必须先检查
	 * end位置数字是否符合需求。
	 * 解题方法：首先排除为空及长度为0的情况，然后设置start位置为0，end位置为nums.length-1(数组下标从0开始，所以要减去1),
	 * 然后开始进行while循环，为了避免死循环，这里条件设置为start+1<end，
	 *         1.在循环里首先确定中点进行二分，即int mid = start +(end -start)/2;
	 *         2.判断如果nums[mid]==target则说明找到相同的数值，但是题目要求求出最后一个相同的,继续找右区间，所以设置start=mid；
	 *         3.判断如果nums[mid]>target则说明中点数字比target要大取左区间，所以设置end=mid；
	 *         4.判断如果nums[mid]<target则说明中点数字比target要小取右区间，所以设置start=mid；
	 * 循环结束后start和end都会有值，求这两个值是否和target相等，注意需要求最后一个数值所以先求end位置的值，如果相同则return；
	 * @param nums
	 * @param target
	 * @return
	 */
	public  int solution(int[] nums, int target) {
		if (nums == null || nums.length == 0 || target == 0) {
			return -1;
		}
		int start = 0;
		int end = nums.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if(nums[mid]==target){
				start=mid;
			}else if(nums[mid]>target){
				end = mid;	
			}else {
				start = mid;
			}
		}
		if(nums[end]==target){
			return end;
		}
		if(nums[start]==target){
			return start;
		}
		return -1;
	}

}
