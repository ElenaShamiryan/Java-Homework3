package DZ3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class EvenNums {
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
        System.out.print("Список БЕЗ четных чисел: ");
        for (int i = 0; i < size; i++) {
            if (list.get(i) % 2 != 0) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}