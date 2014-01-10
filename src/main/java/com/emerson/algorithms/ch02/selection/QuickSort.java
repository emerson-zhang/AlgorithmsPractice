package com.emerson.algorithms.ch02.selection;

import com.emerson.algorithms.ch02.AbsSort;

/**
 * Created with IntelliJ IDEA.
 * User: emerson
 * Date: 1/10/14
 * Time: 3:18 PM
 */
public class QuickSort extends AbsSort {
    @Override
    public void sort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }

    int part(int arr[], int left, int right) {
        int i = left, j = right;
        int pivot = j;

        while (i < j) {
            while (arr[i] < arr[j]) {
                j--;
                if (j == i) {

                    break;
                }
            }

            if (i < j) {
                pivot = j;
                exchange(arr, i, pivot);
                i++;
            }


            while (arr[i] < arr[pivot]) {
                i++;
                if (i == j) {
                    break;
                }
            }

            if (i < j) {
                exchange(arr, j, i);
                pivot = i;
                j--;
            }


        }
        print(arr);
        System.out.println(i);
        return pivot;
    }


    void quickSort(int arr[], int left, int right) {
        int index = part(arr, left, right);

        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index + 1, right);
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        quickSort.sort(DATAS);

    }
}
