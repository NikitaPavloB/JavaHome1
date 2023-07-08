package Test4;

// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class Test4 {
  public static void main(String[] args) {
    boolean solutionFound = false;

    for (int q = 0; q <= 9; q++) {
      for (int w = 0; w <= 9; w++) {
        for (int e = 0; e <= 9; e++) {
          String expression = q + "" + w + " + " + w + "" + e + " = " + e + "" + e;
          int result = q * 10 + w + w * 10 + e;
          if (result == e * 10 + e) {
            System.out.println("Решение найдено: " + expression);
            solutionFound = true;
          }
        }
      }
    }

    if (!solutionFound) {
      System.out.println("Решение не найдено");
    }
  }
}
