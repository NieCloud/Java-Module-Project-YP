public class RoubleFormatter {
    public static String returnRoubleString(double sum) {
        int integerValueOfSum = (int) sum;
        if (integerValueOfSum >=10 && integerValueOfSum<= 20) {
            return "рублей";
        }
        if (integerValueOfSum %10 == 1) {
            return "рубль";
        } else if (integerValueOfSum %10 >= 2 && integerValueOfSum %10 <= 4) {
            return "рубля";
        } else {
            return "рублей";
        }
    }
}
