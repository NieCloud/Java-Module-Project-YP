
public class Main {
    public static void main(String[] args) {
        Guests firstGuestList = new Guests();
        firstGuestList.setNumberOfGuests();


        Calculator testCalculator = new Calculator();
        testCalculator.createListOfGoods();
        testCalculator.calculateAndShowResultsPerGuest(firstGuestList.getNumberOfGuests());

    }
}