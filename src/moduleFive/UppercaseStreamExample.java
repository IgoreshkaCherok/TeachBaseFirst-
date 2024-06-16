package moduleFive;

import java.util.List;
import java.util.stream.Collectors;

public class UppercaseStreamExample {
    public static void main(String[] args) {
        List<String> words = List.of("car", "book", "string");
        List<String> uppercaseWords = convertToUpperCase(words);
        System.out.println(uppercaseWords);
    }

    public static List<String> convertToUpperCase(List<String> words) {
        return words.stream()
                .map(word -> word.toUpperCase()) // Преобразуем каждое слово в верхний регистр
                .collect(Collectors.toList());   // Собираем преобразованные слова в список
    }
}
