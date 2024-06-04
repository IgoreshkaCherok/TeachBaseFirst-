package moduleOne;

public class welcomeJavaRim {
    public static void main(String args[]) {
        int arabNumber = 100;
        //делим по числам
        int thousandNumber;
        int hundredsNumber;
        int tensNumber;
        int unitsNumber;
        String rimNumber = "";
        //StringBuilder

        if(arabNumber >= 1000){
            thousandNumber = arabNumber / 1000;

            for(int i=0; i<=thousandNumber; i++){
                rimNumber += "M";
            }

            hundredsNumber = (arabNumber / 100) - (thousandNumber * 10);

            if(hundredsNumber == 1){
                rimNumber += "C";
            } else if(hundredsNumber == 2){
                rimNumber += "CC";
            } else if (hundredsNumber == 3){
                rimNumber += "CCC";
            } else if (hundredsNumber == 4){
                rimNumber += "CD";
            } else if (hundredsNumber == 5){
                rimNumber += "D";
            } else if (hundredsNumber == 6){
                rimNumber += "DC";
            } else if (hundredsNumber == 7){
                rimNumber += "DCC";
            } else if (hundredsNumber == 8){
                rimNumber += "DCCC";
            }else {
                rimNumber += "CM";
            }

            tensNumber = (arabNumber / 10) - ((thousandNumber * 100)+(hundredsNumber * 10));
            if(tensNumber == 1){
                rimNumber += "X";
            }else if(tensNumber == 2){
                rimNumber += "XX";
            }else if(tensNumber == 3){
                rimNumber += "XXX";
            }else if(tensNumber == 4){
                rimNumber += "XL";
            }else if(tensNumber == 5){
                rimNumber += "L";
            }else if(tensNumber == 6){
                rimNumber += "LX";
            }else if(tensNumber == 7){
                rimNumber += "LXX";
            }else if(tensNumber == 8){
                rimNumber += "LXXX";
            }else{
                rimNumber += "XC";
            }
            unitsNumber = arabNumber - ((thousandNumber * 1000)+(hundredsNumber * 100)+(tensNumber * 10));
            if(unitsNumber == 1){
                rimNumber += "I";
            }else if (unitsNumber == 2){
                rimNumber += "II";
            }else if (unitsNumber == 3){
                rimNumber += "III";
            }else if (unitsNumber == 4){
                rimNumber += "IV";
            }else if (unitsNumber == 5){
                rimNumber += "V";
            }else if (unitsNumber == 6){
                rimNumber += "VI";
            }else if (unitsNumber == 7){
                rimNumber += "VII";
            }else if (unitsNumber == 8){
                rimNumber += "VIII";
            }else {
                rimNumber += "IX";
            }
        }else if (arabNumber < 1000 && arabNumber >= 100){
            hundredsNumber = (arabNumber / 100);

            tensNumber = (arabNumber / 10) - (hundredsNumber * 10);
            if(tensNumber == 1){
                rimNumber += "X";
            }else if(tensNumber == 2){
                rimNumber += "XX";
            }else if(tensNumber == 3){
                rimNumber += "XXX";
            }else if(tensNumber == 4){
                rimNumber += "XL";
            }else if(tensNumber == 5){
                rimNumber += "L";
            }else if(tensNumber == 6){
                rimNumber += "LX";
            }else if(tensNumber == 7){
                rimNumber += "LXX";
            }else if(tensNumber == 8){
                rimNumber += "LXXX";
            }else if(tensNumber == 9){
                rimNumber += "XC";
            }else{
                rimNumber += "";
            }

            unitsNumber = arabNumber - ((hundredsNumber * 100)+(tensNumber * 10));
            if(unitsNumber == 1){
                rimNumber += "I";
            }else if (unitsNumber == 2){
                rimNumber += "II";
            }else if (unitsNumber == 3){
                rimNumber += "III";
            }else if (unitsNumber == 4){
                rimNumber += "IV";
            }else if (unitsNumber == 5){
                rimNumber += "V";
            }else if (unitsNumber == 6){
                rimNumber += "VI";
            }else if (unitsNumber == 7){
                rimNumber += "VII";
            }else if (unitsNumber == 8){
                rimNumber += "VIII";
            }else if (unitsNumber == 9){
                rimNumber += "IX";
            }else {
                rimNumber +="";
            }
        }else if (arabNumber < 100 && arabNumber >=10){
            tensNumber = (arabNumber / 10);
            if(tensNumber == 1){
                rimNumber += "X";
            }else if(tensNumber == 2){
                rimNumber += "XX";
            }else if(tensNumber == 3){
                rimNumber += "XXX";
            }else if(tensNumber == 4){
                rimNumber += "XL";
            }else if(tensNumber == 5){
                rimNumber += "L";
            }else if(tensNumber == 6){
                rimNumber += "LX";
            }else if(tensNumber == 7){
                rimNumber += "LXX";
            }else if(tensNumber == 8){
                rimNumber += "LXXX";
            }else{
                rimNumber += "XC";
            }
            unitsNumber = arabNumber - (tensNumber * 10);
            if(unitsNumber == 1){
                rimNumber += "I";
            }else if (unitsNumber == 2){
                rimNumber += "II";
            }else if (unitsNumber == 3){
                rimNumber += "III";
            }else if (unitsNumber == 4){
                rimNumber += "IV";
            }else if (unitsNumber == 5){
                rimNumber += "V";
            }else if (unitsNumber == 6){
                rimNumber += "VI";
            }else if (unitsNumber == 7){
                rimNumber += "VII";
            }else if (unitsNumber == 8){
                rimNumber += "VIII";
            }else if (unitsNumber == 9){
                rimNumber += "IX";
            }else {
                rimNumber +="";
            }
        }else if (arabNumber < 10 && arabNumber >0){
            unitsNumber = arabNumber;
            if(unitsNumber == 1){
                rimNumber += "I";
            }else if (unitsNumber == 2){
                rimNumber += "II";
            }else if (unitsNumber == 3){
                rimNumber += "III";
            }else if (unitsNumber == 4){
                rimNumber += "IV";
            }else if (unitsNumber == 5){
                rimNumber += "V";
            }else if (unitsNumber == 6){
                rimNumber += "VI";
            }else if (unitsNumber == 7){
                rimNumber += "VII";
            }else if (unitsNumber == 8){
                rimNumber += "VIII";
            }else if (unitsNumber == 9){
                rimNumber += "IX";
            }else{
                rimNumber += "";
            }

        }else {
            rimNumber = "В римских цифрах нет нуля и отрицательных значений";
        }
        System.out.println(rimNumber);
    }
    public static void hundreds(int hundredsNumber, String rimNumber){
        if(hundredsNumber == 1){
            rimNumber += "C";
        } else if(hundredsNumber == 2){
            rimNumber += "CC";
        } else if (hundredsNumber == 3){
            rimNumber += "CCC";
        } else if (hundredsNumber == 4){
            rimNumber += "CD";
        } else if (hundredsNumber == 5){
            rimNumber += "D";
        } else if (hundredsNumber == 6){
            rimNumber += "DC";
        } else if (hundredsNumber == 7){
            rimNumber += "DCC";
        } else if (hundredsNumber == 8){
            rimNumber += "DCCC";
        }else if (hundredsNumber == 9){
            rimNumber += "CM";
        } else {
            rimNumber += "";
        }
    }
}
