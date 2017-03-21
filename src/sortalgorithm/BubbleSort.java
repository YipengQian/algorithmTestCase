package sortalgorithm;

import java.util.Arrays;



/**
 * 冒泡排序算法
 * 冒泡排序是最简单的排序之一了，其大体思想就是通过与相邻元素的比较和交换来把小的数交换到最前面。
 * 这个过程类似于水泡向上升一样，因此而得名。举个栗子，对5,3,8,6,4这个无序序列进行冒泡排序。
 * 首先从后向前冒泡，4和6比较，把4交换到前面，序列变成5,3,8,4,6。同理4和8交换，变成5,3,4,8,6,3和4无需交换。
 * 5和3交换，变成3,5,4,8,6,这样一次冒泡就完了，把最小的数3排到最前面了。对剩下的序列依次冒泡就会得到一个有序序列。
 * 冒泡排序的时间复杂度为O(n^2)。
 * @author barry
 *
 */
public class BubbleSort {

	public static int[] bubbleSort(int[] arr){
		if(arr==null||arr.length==0){
			return null;
		}
		for(int i=arr.length-1;i>=0;i--){
//			int current = arr[i];
			for(int c=arr.length-1;c>0;c--){
				if(arr[c]<arr[c-1]){
					int current =arr[c];
					 arr[c]=arr[c-1];
					arr[c-1]=current;
				
				}
//				System.out.print(arr[c]+">>>"+arr[c-1]+"___");
			}
//			System.out.print(Arrays.toString(arr)+"____");
		}
		return arr;
	}
	
    public static void main(String[] args) {
	int[] arr = new int[]{1,4,2,5,2,3,6,45,234,234,5435,546546,1,2,3,4,5};
	int[] bubbleSort = bubbleSort(arr);
	System.out.print(Arrays.toString(bubbleSort));
	}
}
