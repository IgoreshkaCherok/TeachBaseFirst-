package moduleTwo;

import java.util.Scanner;

public class jobOfDayFourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер элемента ряда Фибоначчи: ");
        int number = scanner.nextInt();
        fibonachi(number);
    }
    
    public static void fibonachi(int number){
        int[] fibonachiNumber = new int[]{0,1};
        int finishNumber = 0;
        if (number > 1){
            int[] rowFibonachi = new int[number+1];
            rowFibonachi[0] = 0;
            rowFibonachi[1] = 1;
            for (int i = 2; i < number+1; i++){
                rowFibonachi[i] = rowFibonachi[i-2] + rowFibonachi[i-1];
                finishNumber = rowFibonachi[i];
//                System.out.println(finishNumber);
            }
        } else {
           finishNumber = fibonachiNumber[number];
        }
        System.out.println(finishNumber);
    }
}
