import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("What is your name user?");

    String userName = myObj.nextLine();
    System.out.println("Hello user, " + userName + "!");
  }
}