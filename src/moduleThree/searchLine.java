package moduleThree;

public class searchLine {
    public static void main(String[] args) {
        int[] arrNumber = {-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        int numberSearch = 7;
        System.out.println(lineSearch(arrNumber, numberSearch));
    }

    public static int lineSearch(int[] arrNumber, int numberSearch){
        for (int index = 0; index < arrNumber.length; index++) {
            if (arrNumber[index] == numberSearch)
               return index;
        }
        return -1;
    }
}
