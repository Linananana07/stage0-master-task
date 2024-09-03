package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    public String[] seasonsArray() {
        String[] season = {"Winter", "Spring", "Summer", "Autumn"};
        return season;
    }

    public int[] generateNumbers(int length) {
        int[] array = new int[length];
        for (int i = 1; i <= length; i++) {
            array[i - 1] = i;
        }
        return array;
    }

    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public int findIndexOfNumber(int[] arr, int number) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                result = i;
                break;
            }
        }
        return result;
    }


    public String[] reverseArray(String[] arr) {
        String[] result = new String[arr.length];
        int flag = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[flag] = arr[i];
            flag++;
        }
        return result;
    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int number : arr) {
            if (number > 0) {
                count++;
            }
        }
        int[] arrPositive = new int[count];
        int flag = 0;
        for (int number : arr) {
            if (number > 0) {
                arrPositive[flag] = number;
                flag++;
            }
        }

        return arrPositive;
    }

    public int[][] sortRaggedArray(int[][] arr) {
        boolean swappedArr;
        for (int i = 0; i < arr.length - 1; i++) {
            swappedArr = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length > arr[j + 1].length) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swappedArr = true;
                }
            }
            if (!swappedArr) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            boolean swappedNum;
            for (int j = 0; j < arr[i].length - 1; j++) {
                swappedNum = false;
                for (int k = 0; k < arr[i].length - 1 - j; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                        swappedNum = true;
                    }
                }
                if (!swappedNum) {
                    break;
                }
            }
        }
        return arr;
    }
}
