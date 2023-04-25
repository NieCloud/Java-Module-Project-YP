import java.util.Scanner;

public class Guests {
    private int numberOfGuests = -1;
    Scanner scanner = new Scanner(System.in);

    /**
     Метод устанавливает количество гостей, на которых необходимо разделить счет, на основе
     ввода пользователя через консоль
     */
    public void setNumberOfGuests() {
        System.out.println("На скольких человек необходимо разделить счет?");
        while (true) {
            numberOfGuests = returnCorrectUserInputAsInt();
            if (numberOfGuests > 1) {
                break;
            } if (numberOfGuests == 1) {
                System.out.println("На одного счет делить смысла нет");
            } if (numberOfGuests < 1) {
                System.out.println("Число должно быть больше 1");
            }

        }
    }

    /**
     Метод проверяет, является ли ввод пользователя int
     */
    private int returnCorrectUserInputAsInt() {
        int correctIntInput = 0;
        while (true) {
            try {
                correctIntInput = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное целое число гостей");
            }
        }
        return correctIntInput;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }
}
