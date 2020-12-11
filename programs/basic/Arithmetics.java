package basic;

public class Arithmetics {

  int add(int a, int b) {
    return a + b;
  }

  int subtract(int a, int b) {
    return a - b;
  }

  int multiply(int a, int b) {
    return a * b;
  }

  int divide(int a, int b) {
    return a / b;
  }

  public static void main(String args[]) {
    Arithmetics ob = new Arithmetics();

    System.out.println("1 + 2 = " + ob.add(1, 2));
    System.out.println("4 - 3 = " + ob.subtract(4, 3));
    System.out.println("5 * 6 = " + ob.multiply(5, 6));
    System.out.println("10 / 2 = " + ob.divide(10, 2));
  }
}
