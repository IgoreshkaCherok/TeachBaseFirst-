package moduleTwo;

public class jobOfDataFirst {
    public static void main(String[] args) {
        massiveOne();
        massiveTwo();
        massiveThree();
    }
    public static void massiveOne() {
        int seachNimber = 1;
        int arrayNumber[] = new int[]{4};

        for (int i = 0; i<arrayNumber.length; i++){
            if (arrayNumber[i] == seachNimber){
                System.out.println(true);
                break;
            } else {
                while(i==(arrayNumber.length-1)){
                    System.out.println(false);
                    break;
                }
            }
        }
    }
    public static void massiveTwo() {
        int seachNimber = 9;
        int arrayNumber[] = new int[]{4,10,9,2,5};

        for (int i = 0; i<arrayNumber.length; i++){
            if (arrayNumber[i] == seachNimber){
                System.out.println(true);
                break;
            } else {
                while(i==(arrayNumber.length-1)){
                    System.out.println(false);
                    break;
                }
            }
        }
    }
    public static void massiveThree() {
        int seachNimber = 0;
        int arrayNumber[] = new int[]{9,2,-2,-10,5};

        for (int i = 0; i<arrayNumber.length; i++){
            if (arrayNumber[i] == seachNimber){
                System.out.println(true);
                break;
            } else {
                while(i==(arrayNumber.length-1)){
                    System.out.println(false);
                    break;
                }
            }
        }
    }
}
