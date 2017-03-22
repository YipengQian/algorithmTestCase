package sortalgorithm;

import java.util.Arrays;

/**
 * 
 算法规则： 本质来说，快速排序的过程就是不断地将无序元素集递归分割，一直到所有的分区只包含一个元素为止。
 * 由于快速排序是一种分治算法，我们可以用分治思想将快排分为三个步骤：
 *  1.分：设定一个分割值，并根据它将数据分为两部分
 *  2.治：分别在两部分用递归的方式，继续使用快速排序法 
 *  3.合：对分割的部分排序直到完成
 */

public class QuickSort {

	public static int[] quickSort(int[] arr) {
		int[] dividerSort = dividerSort(arr, 0, arr.length-1);
		System.out.print("最终结果："+Arrays.toString(dividerSort));
		return arr;
	}

	

	public static int[] dividerSort(int[] arr, int left, int right) {
		 if(left>right)
		       return null;
		int i=left;
		int j = right;
		int current = arr[left];
		while (i != j) {
			while (arr[j] >= current && i < j) {
				j--;
			}
			while (arr[i] <= current && i < j) {
				i++;
			}

			if (i < j) {
				toChange(arr, i, j);
			}
		}
		
		arr[left]=arr[i];
		arr[i]=current;
		
		dividerSort(arr, left, i-1);
		dividerSort(arr, i+1, right);
		return arr;
	}

	
	public static int[] toChange(int[] arr, int i, int j) {
		int c = arr[j];
		arr[j] = arr[i];
		arr[i] = c;
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 2, 5, 2, 3, 6, 45, 234, 234, 5435,
				546546, 1, 2, 3, 4, 5 };
		quickSort(arr);
	}
}
