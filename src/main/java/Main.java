
public class Main {
    public static void main(String[] args) {
        Guests firstGuestList = new Guests();
        firstGuestList.setNumberOfGuests();

        Goods testGoods = new Goods();


        testGoods.createListOfGoods();
        testGoods.calculateAndShowResultsPerGuest(firstGuestList.getNumberOfGuests());

    }
}