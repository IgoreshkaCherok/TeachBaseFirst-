package moduleOne;

public class welcomeJava {
    public static void main(String[] args) {
        equalsNumber();
        evenNumbers();
        day();
    }

    public static void equalsNumber() {
        int firstNumber = 5;
        int secondNumber = 8;
        if (firstNumber == secondNumber) {
            System.out.println("Числа " + firstNumber + " и " + secondNumber + " равны");
        } else if (firstNumber > secondNumber) {
            System.out.println("Первое число больше второго");
        } else {
            System.out.println("Второе число больше первого");
        }
    }

    public static void evenNumbers() {
        int firstnumber = 12;
        if (firstnumber % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    public static void day() {
        int oclock = 14;
        // if oclock >24 то пропустить
        //command option L
        //
        if (oclock <= 12 && oclock >= 5) {
            System.out.println("УТРО");
        } else if (oclock >= 12 && oclock <= 18) {
            System.out.println("ДЕНЬ");
        } else if (oclock >= 18 && oclock <= 24) {
            System.out.println("ВЕЧЕР");
        } else if (oclock >= 0 && oclock < 5) {
            System.out.println("НОЧЬ");
        }
    }
}
