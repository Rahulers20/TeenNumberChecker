public class TeenNumberChecker {

    public static boolean hasTeen(int valueOne, int valueTwo, int valueThree) {
        if((valueOne >= 13 && valueOne <=19) || (valueTwo >= 13 && valueTwo <=19) || (valueThree >= 13 && valueThree <=19)) {
            return true;
        }  else  {
        return false;
    }
    }

    public static boolean isTeen(int value) {
        if(value >= 13 && value <=19) {
            return true;
        } else {
            return false;
        }
    }
}
