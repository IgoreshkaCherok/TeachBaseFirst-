package moduleFive;

import java.util.*;

public class UniqueElements {

    public static void main(String[] args) {
        // Пример списка элементов
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2); // Дублирующийся элемент

        // Получение уникальных элементов
        Set<Integer> uniqueElements = getUniqueElements(list);

        // Вывод уникальных элементов
        for (int element : uniqueElements) {
            System.out.println(element);
        }
    }

    public static <T> Set<T> getUniqueElements(List<T> elements) {
        // Создание HashSet для хранения уникальных элементов
        Set<T> uniqueSet = new HashSet<>(elements);
        return Collections.unmodifiableSet(uniqueSet); // Возвращаем неизменяемый набор
    }
}
