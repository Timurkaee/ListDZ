package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Добавить");
            System.out.println("2. Показать");
            System.out.println("3. Удалить");

            int operation = scanner.nextInt();
            scanner.nextLine(); // Считываем остаток строки после ввода числа

            switch (operation) {
                case 1:
                    System.out.println("Какую покупку хотите добавить?");
                    String newItem = scanner.nextLine();
                    shoppingList.add(newItem);
                    System.out.println("Итого в списке покупок: " + shoppingList.size());
                    break;
                case 2:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println((i + 1) + ". " + shoppingList.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println((i + 1) + ". " + shoppingList.get(i));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название:");
                    String input = scanner.nextLine();
                    try {
                        int itemIndex = Integer.parseInt(input) - 1;
                        if (itemIndex >= 0 && itemIndex < shoppingList.size()) {
                            shoppingList.remove(itemIndex);
                            System.out.println("Покупка удалена.");
                        } else {
                            System.out.println("Неверный номер покупки.");
                        }
                    } catch (NumberFormatException e) {
                        if (shoppingList.remove(input)) {
                            System.out.println("Покупка удалена.");
                        } else {
                            System.out.println("Покупка не найдена.");
                        }
                    }
                    break;
                default:
                    System.out.println("Неверная операция.");
            }
        }
    }
}