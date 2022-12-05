package DZ3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FindNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов в списке: ");
        int size = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            int num = rnd.nextInt(101);
            list.add(num);
        }
        System.out.println("Произвольный список: " + list);

        int min = list.get(0);
        int max = list.get(0);
        double sum = 0;
        for (Integer i : list) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        System.out.println("Минимальное значение списка: " + min);
        System.out.println("Максимальное значение списка: " + max);

        for (Integer i : list) {
            sum = sum + i;
        }
        double average = sum / list.size();
        System.out.printf("Среднее арифметическое значение: %.2f ", average);
    }
}

    //     System.out.println(Collections.min(list));
    //     System.out.println(Collections.max(list));
