package moduleTwo;

import java.util.Arrays;

public class jobOfDataThird {
    public static void main(String[] args) {
        int[][] number = {
                {9,2,-2},
                {-10,5}
        };
        System.out.println(Arrays.toString(minNumber(number)));
    }

    public static int[] minNumber(int[][] numbers) {
        int minNumber = numbers[0][0];
        int[] indexNumber = new int[2];
        if (numbers.length > 1){
            for (int j = 0; j < numbers.length; j++) {
                for (int i = 0; i < numbers[j].length; i++) {
                    if (numbers[j][i] < minNumber ) {
                        minNumber = numbers[j][i];
                        indexNumber = new int[]{j, i};
                    }
                }
            }
        } else {
            indexNumber= new int[]{0,0};
        }

        return indexNumber ;
    }
}