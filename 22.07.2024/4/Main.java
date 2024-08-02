import java.util.Scanner;

public class Main {
  static void printPalindrom(String input) {
    int i = 0;
    int j = input.length()-1;
    boolean isPalindrom = true;
    while (i<j) {
      if (input.charAt(i) != input.charAt(j)) {
        isPalindrom = false;
        break;
      };
      i += 1;
      j -= 1;
    }
    if (isPalindrom) {
      System.out.println(input+" is palindrom");
    } else {
      System.out.println(input+" is not palindrom");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = "";
    while (!input.equals("exit")) {
      System.out.println("Enter exit to exit.");
      System.out.print("Enter a word: ");
      input = sc.nextLine();
      printPalindrom(input);
    }
  }
}
