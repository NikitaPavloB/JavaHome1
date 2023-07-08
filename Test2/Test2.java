package Test2;

//  Вывести все простые числа от 1 до 1000

public class Test2 {

  public static void main(String[] args) {
    System.out.println("Простые числа от 1 до 1000:");
    printPrimeNumbers(1, 1000);
  }

  // Метод для проверки, является ли число простым
  public static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }

  // Метод для вывода всех простых чисел в заданном диапазоне
  public static void printPrimeNumbers(int start, int end) {
    for (int number = start; number <= end; number++) {
      if (isPrime(number)) {
        System.out.print(number + " ");
      }
    }
    System.out.println();
  }
}
