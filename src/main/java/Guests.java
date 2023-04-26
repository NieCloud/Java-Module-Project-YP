import java.util.Scanner;

public class Guests {
    private int numberOfGuests = 0;

    /**
     Метод устанавливает количество гостей, на которых необходимо разделить счет, на основе
     ввода пользователя через консоль
     */
    public void setNumberOfGuests() {
        System.out.println("На скольких человек необходимо разделить счет?");
        while (true) {
            int tempNumberOfGuests = returnCorrectUserInputAsInt();
            if (tempNumberOfGuests > 1) {
                numberOfGuests = tempNumberOfGuests;
                break;
            } if (tempNumberOfGuests == 1) {
                System.out.println("На одного счет делить смысла нет");
            } if (tempNumberOfGuests < 1) {
                System.out.println("Число должно быть больше 1");
            }

        }
    }

    /**
     Метод проверяет, является ли ввод пользователя int
     */
    private int returnCorrectUserInputAsInt() {
        Scanner scanner = new Scanner(System.in);
        int correctIntInput;
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
