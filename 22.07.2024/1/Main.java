import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();
        int inputCount = 0;
        for (String i: args) {
            if (i.equals(input)) {
                inputCount += 1;
            };
        };
        System.out.println("Number of '"+input+"' present in CLA: "+ inputCount);
    }
}
