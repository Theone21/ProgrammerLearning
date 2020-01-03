package com.jlj.sort;

public class ShellSort {

    /**
     * 使用简单插入排序
     * 思想： 将arr数组视为两个序列：一个有序序列和一个无序序列，
     *          初始情况下，有序序列只有第一个值，从无序序列中挨个拿出一个值来放入有序序列中
     * @param arr 待排序数组
     */
    private static void sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int val = arr[i];
            int index = i - 1;
            while (index >= 0){
                if(arr[index] > val) {
                    arr[index+1] = arr[index];
                    index--;
                } else {
                    break;
                }
            }
            arr[index+1] = val;
        }
    }

    /**
     * 希尔排序，
     * 思想：希尔排序是插入排序思想的一种改进，在插入排序中，如果原数组中有一个较小的值位于数组的某端，
     *          那么，在对该小值进行排序的时候，我们会移动大量的数据，可想而知，这是一种极其耗时的操作。
     *          希尔排序就是按照增量从大到小的顺序一步步一组组的对数据进行排序，直至数组完全有序。
     * @param arr 待排序数组
     */
    private static void shellSort(int[] arr){
        int increment = arr.length / 2;
        while (increment>=1){
            for(int k = 0; k < increment; k++){
                for(int i = k + increment; i < arr.length; i += increment){
                    int val = arr[i];
                    int index = i - increment;
                    while (index >= 0){
                        if(val < arr[index]){
                            arr[index+increment] = arr[index];
                            index -= increment;
                        } else {
                            break;
                        }
                    }
                    arr[index+increment] = val;
                }
            }
            if (increment == 1) break;
            increment -= 5;
            if (increment < 1){
                increment = 1;
            }

        }

    }




    public static void main(String... args){
        int length = 100000;

        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = (int) (Math.random() * length);
            System.out.print(arr[i] + ", ");
        }
        sort(arr);
//        shellSort(arr);
        for(int i = 0; i < length; i++){
            System.out.print(arr[i] + ", ");
        }
    }


}



