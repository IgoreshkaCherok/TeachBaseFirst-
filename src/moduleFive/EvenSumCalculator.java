package moduleFive;

public class EvenSumCalculator {
    public static void main(String[] args) {
        int sum = 0; // Инициализация переменной для хранения суммы

        for (int i = 2; i <= 200; i += 2) { // Начинаем с 2, так как 1 нечетное
            sum += i; // Добавляем текущее четное число к сумме
        }

        System.out.println("Сумма четных чисел от 1 до 200: " + sum);
    }
}
