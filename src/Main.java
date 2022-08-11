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
          list.add(variable);
          System.out.print("Итого в списке покупок: " + list.size());
        }
        case "2" -> {
          System.out.print("Введите что вы хотите удалить из списка? ");
          String variable = scanner.nextLine();

          if (!list.remove(variable)) {
            System.out.print("Такого названия нет в списке!\n");
          } else {
            System.out.println("Из списка удален: " + variable);
          }
          System.out.print("Итого в списке покупок: " + list.size());
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
          System.out.print("Ваш список: \n");
          for (String s : list) {
            System.out.println(s);
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
