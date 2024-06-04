package moduleTwo;

public class jobOfDataSecond {
    public static void main(String[] args) {
        minimumNumberOne();
        minimumNumberTwo();
        minimumNumberThree();
    }
    public static void minimumNumberThree(){
        int minNumber = 0;
        int minIndex = 0;
        int arrayNumber[] = new int[]{9, 2, -2, -10, 5};

        if (arrayNumber.length > 1){
            minNumber = arrayNumber[0];
            for (int i = 0; i < arrayNumber.length; i++){
                if (minNumber > arrayNumber[i]){
                    minNumber = arrayNumber[i];
                    minIndex = i;
                }
            }
            System.out.println(minIndex);
        } else {
            System.out.println(minIndex);
        }
    }
    public static void minimumNumberTwo(){
        int minNumber = 0;
        int minIndex = 0;
        int arrayNumber[] = new int[]{4,10,9,2,5};

        if (arrayNumber.length > 1){
            minNumber = arrayNumber[0];
            for (int i = 0; i < arrayNumber.length; i++){
                if (minNumber > arrayNumber[i]){
                    minNumber = arrayNumber[i];
                    minIndex = i;
                }
            }
            System.out.println(minIndex);
        } else {
            System.out.println(minIndex);
        }
    }
    public static void minimumNumberOne(){
        int minNumber = 0;
        int minIndex = 0;
        int arrayNumber[] = new int[]{4};

        if (arrayNumber.length > 1){
            minNumber = arrayNumber[0];
            for (int i = 0; i < arrayNumber.length; i++){
                if (minNumber > arrayNumber[i]){
                    minNumber = arrayNumber[i];
                    minIndex = i;
                }
            }
            System.out.println(minIndex);
        } else {
            System.out.println(minIndex);
        }
    }
}
