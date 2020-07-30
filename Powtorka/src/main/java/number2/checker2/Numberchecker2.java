package number2.checker2;

public class Numberchecker2 {

    public boolean checkNumber(double number) {
        if (number % 3 == 0 && number >= 0) {
            return true;
        }
        return false;
    }
}
