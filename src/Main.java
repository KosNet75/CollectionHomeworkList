import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Collections.addAll(list, "Хлеб белый", "Бородинский хлеб", "Крупа гречневая", "Овсяная крупа");

    System.out.println("\nУже есть в списке: \n");

    for (String s : list) {
      System.out.println(s);
    }

    while (true) {
      System.out.println(
          "\n1. Добавить к списку\n" + "2. Удалить из списка\n" + "3. Поиск по списку\n"
              + "4. Показать список\n" + "5. Выход\n");

      String choice = scanner.nextLine();

      switch (choice) {
        case "1" -> {
          System.out.print("Какую покупку вы хотите добавить в список? ");
          String variable = scanner.nextLine();

          if (list.contains(variable)) {
            System.out.println("Такая покупка уже есть в списке! ");
          } else {
            list.add(variable);
          }
          System.out.println("Итого в списке покупок: " + list.size());

        }
        case "2" -> {
          System.out.print("Введите что вы хотите удалить из списка? ");
          String variable = scanner.nextLine();

          if (list.remove(variable)) {
            System.out.println("Из списка удален: " + variable);
            System.out.println("Итого в списке покупок: " + list.size());
          } else {
            try {
              if (Integer.parseInt(variable) >= list.size() + 1 || Integer.parseInt(variable) < 1) {

                System.out.println("Нет такого номера!");
                continue;
              }
              list.remove(Integer.parseInt(variable) - 1);
              System.out.println("Из списка удален номер: " + variable);
            } catch (NumberFormatException e) {
              System.out.println("Нет такого товара!");
            }
          }
        }
        case "3" -> {
          System.out.print("поиск по списку: ");
          String variable = scanner.nextLine();
          for (String s : list) {
            String[] words = s.split(" ");
            for (String word : words) {
              if (word.equalsIgnoreCase(variable)) {
                System.out.println("Найдено: " + s);
              }
            }
          }
        }

        case "4" -> {
          System.out.println("Ваш список: " + list.size());
          for (String s : list) {
            System.out.println((list.indexOf(s) + 1) + ". " + s);
          }
        }

        case "5" -> {
          System.out.print("Отключение!");
          System.exit(0);
        }
      }
    }
  }
}