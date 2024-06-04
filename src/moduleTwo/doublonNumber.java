package moduleTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class doublonNumber {
    public static void main(String[] args) {
        doublon();
    }

    public static void doublon() {
        int[] numbers = new int[]{1, 2, 3, 3, 3, 4};
        int duplicate = 0;

        // Переменная 'duplicate' используется для подсчета количества дубликатов
        for (int i = 0; i < numbers.length; i++) {
            for (int y = i + 1; y < numbers.length; y++) {
                if (numbers[i] == numbers[y]) {
                    duplicate++;
                }
            }
        }

        // Если дубликаты найдены, создаем массив для их хранения
        if (duplicate > 0) {
            int[] duplicates = new int[duplicate];
            int index = 0; // Индекс для заполнения массива дубликатами

            // Поиск дубликатов и заполнение массива 'duplicates'
            for (int i = 0; i < numbers.length; i++) {
                boolean isDuplicate = false;
                for (int y = i + 1; y < numbers.length; y++) {
                    if (numbers[i] == numbers[y]) {
                        duplicates[index] = i;
                        isDuplicate = true;
                    }
                }
                if (!isDuplicate) {
                    // Если элемент не является дубликатом, пропускаем его
                    continue;
                }
                index++;
            }

            // Вывод массива дубликатов
            System.out.println(Arrays.toString(duplicates));
        }
    }
}
