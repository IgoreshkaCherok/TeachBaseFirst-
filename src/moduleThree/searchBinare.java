package moduleThree;

public class searchBinare {
    public static void main(String[] args) {
        int[] arrNumber = {1, 9, 6, 2, 5, 7, 8};
        int numberSearch = 3;
        bubbleSort(arrNumber);
        System.out.println(binareSearch(arrNumber, numberSearch));
    }

    public static void bubbleSort (int[] arrNumber){
        for (int i = 0; i < arrNumber.length - 1; i++) {
            for(int j = 0; j < arrNumber.length - i - 1; j++) {
                if(arrNumber[j + 1] < arrNumber[j]) {
                    int swap = arrNumber[j];
                    arrNumber[j] = arrNumber[j + 1];
                    arrNumber[j + 1] = swap;
                }
            }
        }
    }

    public static int binareSearch (int[] arrNumber, int numberSearch){
        int firstIndex = 0;
        int lastIndex = arrNumber.length - 1;

        // условие прекращения (элемент не представлен)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arrNumber[middleIndex] == numberSearch) {
                return arrNumber[middleIndex];
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arrNumber[middleIndex] < numberSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arrNumber[middleIndex] > numberSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }
}
