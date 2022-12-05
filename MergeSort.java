    package DZ3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        Random rnd = new Random();
        System.out.println("Массив случайных чисел от 0 до 100: ");
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(101);
            System.out.print(array[i] + " ");
            Integer.toString(array[i]);
        }
        System.out.println();
        mergeSort(array);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n == 1) {
            return;
        }
        int arr1[] = new int[n / 2];
        int arr2[] = new int[n - arr1.length];
        for (int i = 0; i < n; i++) {
            if (i < arr1.length) {
                arr1[i] = array[i];
            } else {
                arr2[i - arr1.length] = array[i];
            }
        }
        mergeSort(arr1);
        mergeSort(arr2);
        merge(array, arr1, arr2);        
    }

    private static void merge(int[] array, int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                array[k] = arr1[i];
                i++;
            } else {
                array[k] = arr2[j];
                j++;
            }
            k++;
        }
        for (int left = i; left < size1; left++) {
            array[k++] = arr1[left];
        }
        for (int right = j; right < size2; right++) {
            array[k++] = arr2[right];
        }
    }
}

