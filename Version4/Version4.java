package Version4;

// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class Version4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите значение q: ");
    String qInput = scanner.next();

    System.out.print("Введите значение w: ");
    String wInput = scanner.next();

    System.out.print("Введите значение e: ");
    String eInput = scanner.next();

    boolean solutionFound = false;

    for (int q = 0; q <= 99; q++) {
      for (int w = 0; w <= 99; w++) {
        for (int e = 0; e <= 99; e++) {
          String qString = qInput.replace("?", Integer.toString(q));
          String wString = wInput.replace("?", Integer.toString(w));
          String eString = eInput.replace("?", Integer.toString(e));

          int qValue = Integer.parseInt(qString);
          int wValue = Integer.parseInt(wString);
          int eValue = Integer.parseInt(eString);

          if (qValue + wValue == eValue) {
            System.out.println("Решение найдено: " + qString + " + " + wString + " = " + eString);
            solutionFound = true;
            break;
          }
        }
        if (solutionFound) {
          break;
        }
      }
      if (solutionFound) {
        break;
      }
    }

    if (!solutionFound) {
      System.out.println("Решение не найдено");
    }

    scanner.close();
  }
}
