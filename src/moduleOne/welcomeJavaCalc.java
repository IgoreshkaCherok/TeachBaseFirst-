package moduleOne;

import java.util.Scanner;

public class welcomeJavaCalc {
    public static void main(String[] args) {
       //использовать инициализация в одном методе
        //арифметические операции в константы
        String arithmeticOperation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber  = scanner.nextInt();
        System.out.println("Введите арифметическую операцию");
        arithmeticOperation= scanner.next();

        if (arithmeticOperation.equals("+")){
            System.out.println(firstNumber + secondNumber);
        } else if  (arithmeticOperation.equals("-")){
            System.out.println(firstNumber - secondNumber);
        } else if (arithmeticOperation.equals("*")){
            System.out.println(firstNumber * secondNumber);
        } else if  (arithmeticOperation.equals("/")){
            System.out.println(firstNumber / secondNumber);
        } else {
            System.out.println("Неверная арифметическая операция");
        }
    }
}
