package org.kly.algorithms.sort;

import org.kly.infrastructure.utils.PrintUtils;

/**
 * 插入排序-直接插入排序
 * 时间复杂度 O（n^2）
 * 空间复杂度 O(1)
 * 稳定排序
 *
 * @author colia
 * @date 2017-07-18
 */
public class StraightInsertionSort {

    public static void main(String[] args) {
        Integer[] inputArray = {121, 11, 12, 3, 123, 1, 132, 12, 234, 123, 12, 2435, 123, 123, 13};
        StraightInsertionSort.straightSortUp(inputArray);
        PrintUtils.printArray(inputArray);
    }

    /**
     * 升序排序　选出哨兵，向前插入，确保每一次比较的数组位置，前半部分为已排好顺序的
     */
    private static void straightSortUp(Integer[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < inputArray[i - 1]) {
                //默认前面有序 则当前位置需要向前移动到合适位置
                int j = i - 1;
                int cu = inputArray[i];
                while (j >= 0 && cu < inputArray[j]) {
                    inputArray[j + 1] = inputArray[j];
                    j--;
                }
                inputArray[j + 1] = cu;
            }
        }
    }

    /**
     * 降序排序　选出哨兵，向前插入，确保每一次比较的数组位置，前半部分为已排好顺序的
     */
    private static void straightSortDown(Integer[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > inputArray[i - 1]) {
                //默认前面有序 则当前位置需要向前移动到合适位置
                int j = i - 1;
                int cu = inputArray[i];
                while (j >= 0 && cu > inputArray[j]) {
                    inputArray[j + 1] = inputArray[j];
                    j--;
                }
                inputArray[j + 1] = cu;
            }
        }
    }
}
