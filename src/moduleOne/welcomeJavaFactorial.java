package moduleOne;

import java.util.Scanner;

public class welcomeJavaFactorial {
    public static void main(String[] args) {
        int fistNumber;
        int factorialNumber = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое необходимо ввести в факториал");
        fistNumber = scanner.nextInt();
        for (int i=1; i<=fistNumber; i++){
            factorialNumber = factorialNumber * i;
        }
        System.out.println(factorialNumber);
    }
}
