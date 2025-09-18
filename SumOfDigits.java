import java.util.Scanner; //The Scanner class is primarily used to read input from various sources, most commonly from user input via the console (keyboard)
public class SumOfDigits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    int sum = 0;
    while (number != 0) {
      sum += number % 10;
      number /= 10;
    }
    System.out.println("Sum of digits: " + sum);
    scanner.close();
  }  
}
