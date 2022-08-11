import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Collections.addAll(list, "Хлеб", "Бородинский хлеб", "Крупа гречневая", "Овсяная крупа");

    System.out.print("Уже есть в списке: \n\n");

    for (String s : list) {
      System.out.println(s);
    }

    while (true) {
      System.out.println(
          "\n1. добаваить к списку\n" + "2. удалить из списка\n" + "3. поиск по списку\n"
              + "4. показать список\n");
      String choice = scanner.nextLine();

      switch (choice) {
        case "1" -> {
          System.out.print("Введите что вы хотите добавить в список? ");
          String variable = scanner.nextLine();
          list.add(variable);

        }

        case "2" -> {
          System.out.print("Введите что вы хотите удалить из списка? ");
          String variable = scanner.nextLine();

          list.remove(variable);
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

      }
    }


  }


}
