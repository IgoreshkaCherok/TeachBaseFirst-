package moduleOne;

import java.util.Scanner;

public class welcomeJavaYear {
    public static void main(String[] args) {
        int inYear;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи год для определения является ли это год высокосным");
        inYear = scanner.nextInt();

        if (inYear % 4 == 0) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год не высокосный");
        }

    }
}
