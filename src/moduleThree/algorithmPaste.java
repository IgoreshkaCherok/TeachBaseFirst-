package moduleThree;

public class algorithmPaste {
    public static void insertionSort(int[] sortArr) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < sortArr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }

    public static void main(String args[]) {
        int[] sortArr = {-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        insertionSort(sortArr);
        int sortSize = sortArr.length - 1;
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[sortSize - i] + " ");
        }
    }
}