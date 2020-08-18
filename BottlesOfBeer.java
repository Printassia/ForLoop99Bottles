package Horsy.com.company;

public class BottlesOfBeer {
    public static void main(String[] args) {
      for (int zeroNumber = 99; zeroNumber >= 0; zeroNumber--){
            if (zeroNumber == 0){
                System.out.println("No bottles of beer on the wall, \n" +
                        "no bottles of beer, \n" +
                        "ya' can't take one down, ya cant pass it around, \n" +
                        "cause there are no more bottles of beer on the wall!");
            }
            else if (zeroNumber == 1){
                System.out.println(
                        zeroNumber + " bottle of beer on the wall, \n" +
                                zeroNumber + " bottle of beer, \n" +
                                "ya take one down, ya pass it around, \n"+
                                (zeroNumber - 1) + " bottle of beer on the wall \n");
            }
            else{
                System.out.println(
                        zeroNumber + " bottles of beer on the wall, \n" +
                                zeroNumber + " bottles of beer, \n" +
                                "ya take one down, ya pass it around, \n"+
                                (zeroNumber - 1) + " bottles of beer on the wall \n");
            }
        }
    }
}
