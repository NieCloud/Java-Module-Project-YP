import java.util.Scanner;

public class Calculator {
    private double billPerPerson = 0;
    private double totalBill = 0;
    private String goods = "";

    /**
     Метод создает String со списком товаров и их ценой, а также суммирует все товары
     в отдельную переменную totalBill
     */
    public void createListOfGoods() {
        String tempGoods = "";
        String userInputGoodName;
        double userInputGoodValue;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (tempGoods.isEmpty()) {
                System.out.println("Введите название товара (Или \"Завершить\" для окончания формирования списка):");
            } else {
                System.out.println("Введите название следующего товара (Или \"Завершить\" для окончания формирования списка):");
            }

            userInputGoodName = scanner.nextLine();

            if (userInputGoodName.equalsIgnoreCase("Завершить")) {
                break;
            }

            if (tempGoods.isEmpty()) {
                tempGoods = tempGoods.concat(userInputGoodName);
            } else {
                tempGoods = tempGoods.concat("\n" + userInputGoodName);
            }

            System.out.println("Введите стоимость товара в формате рубли.копейки (например 10.22):");

            userInputGoodValue = checkUserInputAsDouble();
            totalBill += userInputGoodValue;
            tempGoods = tempGoods.concat(String.format(" - Цена: %.2f", userInputGoodValue));
        }
        goods = tempGoods;
    }

    /**
     Метод проверяет, является ли ввод пользователя double
     */
    private double checkUserInputAsDouble() {
        Scanner scanner = new Scanner(System.in);
        double correctDoubleInput;

        while (true) {
            try {
                correctDoubleInput = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите корректную стоимость в формате рубли.копейки (например 10.22):");
            }
        }
        return correctDoubleInput;
    }

    /**
     Метод выводит, сколько каждый человек должен заплатить в зависимости от
     введенного количества гостей
     */
    public void calculateAndShowResultsPerGuest(int numberOfGuests) {
        if (goods.isEmpty()) {
            System.out.println("Никаких товаров не было добавлено");
            return;
        }
        System.out.println("Добавленные товары: \n" + goods);
        billPerPerson = totalBill / numberOfGuests;
        String roubles = RoubleFormatter.returnRoubleString(billPerPerson);
        System.out.println(String.format("Каждый человек должен заплатить по %.2f %s", billPerPerson, roubles));
    }

}
