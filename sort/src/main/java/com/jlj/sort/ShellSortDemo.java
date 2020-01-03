package com.jlj.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ShellSortDemo {

	public static void main(String[] args) {
		//int[] arr = { 8,9,1,7,2,3,5,4,6,0 };
		//System.out.println(Arrays.toString(arr));

		// 创建一个80000个随机数据的数组
		// 使用插入排序，大概?秒和选择排序差不多..
		int[] arr = new int[80000];
		for (int i = 0; i < 80000; i++) {
			arr[i] = (int) (Math.random() * 80000); // 生成一个[0,800000) 的一个数
		}
		System.out.println("排序前~");
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1 = dateFormat.format(now);
		System.out.println("排序前时间=" + date1); // 输出时间
		//System.out.println("排序前=" + Arrays.toString(arr));

		//然后再封装到一个方法中即可:
		//shellSort(arr); //速度慢 超过10秒排 80000个数据
		//insertSort(arr);
		shellSort2(arr); //速度提升很多，1秒左右，排80000个数据
		System.out.println("排序后~");
		Date now2 = new Date();
		String date2 = dateFormat.format(now2);
		System.out.println("排序后时间=" + date2); // 输出时间
		//System.out.println("排序后=" + Arrays.toString(arr));

		/*
		//推导演变的过程~~

		//第一轮排序
		System.out.println("希尔排序第一轮后~~");

		//因为第一轮排序，将10个数据分成了5个组， 所以 i = 5 ; i < arr.length
		for(int i = 5;  i < arr.length; i++) {
			// 遍历各组中所有的元素(共5组，每组2个元素), 步长为5
			for (int j = i - 5; j >= 0; j -= 5) {
				// 如果当前元素大于加上步长后的那个元素
				if (arr[j] > arr[j + 5]) {
					int temp = arr[j];
					arr[j] = arr[j + 5];
					arr[j + 5] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		//第二轮排序
		System.out.println("希尔排序第二轮后~~");

		//因为第二轮排序，将10个数据分成了5/2个组（看ppt图）， 所以 i = 2 ; i < arr.length
		for(int i = 2;  i < arr.length; i++) {
			// 遍历各组中所有的元素(共2组)
			for (int j = i - 2; j >= 0; j -= 2) {
				// 如果当前元素大于加上步长后的那个元素
				if (arr[j] > arr[j + 2]) {
					int temp = arr[j];
					arr[j] = arr[j + 2];
					arr[j + 2] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));


		//第三轮排序
		System.out.println("希尔排序第三轮后~~");
		//因为第三轮排序，将10个数据分成了2/2个组（看ppt图）， 所以 i = 1 ; i < arr.length
		for(int i = 1;  i < arr.length; i++) {
			// 遍历各组中所有的元素(共1组)
			for (int j = i - 1; j >= 0; j -= 1) {
				// 如果当前元素大于加上步长后的那个元素
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));*/

	}

	/**
	 * 希尔排序: 对有序序列在插入时采用交换法
	 * @param arr
	 */
	public static void shellSort(int[] arr) {
		// 遍历所有的步长
		for (int d = arr.length / 2; d > 0; d /= 2) {
			// 遍历所有有元素
			for (int i = d; i < arr.length; i++) {
				// 遍历本组中所有的元素
				for (int j = i - d; j >= 0; j -= d) {
					// 如果当前元素大于加上步长后的那个元素
					if (arr[j] > arr[j + d]) {
						int temp = arr[j];
						arr[j] = arr[j + d];
						arr[j + d] = temp;
					}
				}
			}
		}
	}

	/**
	 * 希尔排序: 对有序序列在插入时采用移动法
	 * @param arr
	 */
	public static void shellSort2(int[] arr) {
		// 增量gap，并逐步缩小增量
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			// 从第gap个元素，逐个对其所在组进行直接插入排序操作
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				int temp = arr[j];
				if (arr[j] < arr[j - gap]) {
					while (j - gap >= 0 && temp < arr[j - gap]) {
						// 移动法
						arr[j] = arr[j - gap];
						j -= gap;
					}
					arr[j] = temp;
				}
			}
		}
	}

	//简单的插入排序
	public static void insertSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int insertVal = arr[i];
			int insertIndex = i - 1; // 表示有序表的最后这个元素的下标
			// 还没找到位置
			while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
				arr[insertIndex + 1] = arr[insertIndex];
				insertIndex -= 1;
			}
			// 退出while 说明插入的位置就找到了
			arr[insertIndex + 1] = insertVal;
		}
	}

}
