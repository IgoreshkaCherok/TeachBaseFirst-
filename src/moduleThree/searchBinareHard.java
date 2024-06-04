package moduleThree;

import java.util.Arrays;

public class searchBinareHard {
    public static int[] mergeSort(int[] arrNumber) {
        int[] buffer1 = Arrays.copyOf(arrNumber, arrNumber.length);
        int[] buffer2 = new int[arrNumber.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, arrNumber.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
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

    public static void main(String args[]) {
        int[] arrNumber = {1, 9, 6, 2, 5, 7, 8};
        int[] result = mergeSort(arrNumber);
        int numberSearch = 5;
        System.out.println(binareSearch(result, numberSearch));
    }
}
