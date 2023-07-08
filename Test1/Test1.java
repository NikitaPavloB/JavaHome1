package Test1;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Test1 {

  public static void main(String[] args) {
    int n = 5; // Здесь можно указать любое значение n

    int triangleNumber = calculateTriangleNumber(n);
    System.out.println("Треугольное число " + n + " равно " + triangleNumber);

    int factorial = calculateFactorial(n);
    System.out.println("Факториал числа " + n + " равен " + factorial);
  }

  // Метод для вычисления треугольного числа
  public static int calculateTriangleNumber(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

  // Метод для вычисления факториала числа
  public static int calculateFactorial(int n) {
    int factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }
    return factorial;
  }
}
