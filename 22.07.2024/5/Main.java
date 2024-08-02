public class Main {
  public static void main(String[] args) {
    for (String i: args) {
      if (i.length()>3) {
        System.out.print(i.charAt(0));
      };
    }
    System.out.println();
  }
}
