package moduleThree;

public class algorithmSelection {
    public static void selectNumber(int[] sortNumbers) {
        for (int i = 0; i < sortNumbers.length; i++) {
            int pos = i;
            int min = sortNumbers[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < sortNumbers.length; j++) {
                if (sortNumbers[j] < min) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = sortNumbers[j];
                }
            }
            sortNumbers[pos] = sortNumbers[i];
            //меняем местами наименьший с sortNumbers[i]
            sortNumbers[i] = min;
        }
    }


    public static void main(String args[]) {
        int[] sortNumbers = {-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        selectNumber(sortNumbers);
        for(int i = 0; i < sortNumbers.length; i++){
            System.out.print(sortNumbers[i] + " ");
        }
    }
}
