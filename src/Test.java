import menu.Menu;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String user = "admin";
        String user = "user";

        Menu menu = new Menu();

        menu.addHeader("Test ABC");

        menu.addChoice("Test1");
        menu.addChoice("Test2");

        if (user == "admin") {
            menu.addChoice("Test3");
            menu.addChoice("Test4");
        }


        menu.addChoice("Exit");

        menu.addPaddingLeft(4);

        menu.print();

        int choice;

        while (true) {
            System.out.println("Enter choice");
            String strChoice = scanner.nextLine();
            if (strChoice.matches("\\d+")) {
                choice = Integer.parseInt(strChoice);
                break;
            }
        }

        if (choice == menu.indexOfChoice("1. Test1")) {
            System.out.println("You choose 1");
        } else if (choice == menu.indexOfChoice("2. Test2")) {
            System.out.println("You choose 2");
        } else if (choice == menu.indexOfChoice("3. Test3")) {
            System.out.println("You choose 3");
        } else if (choice == menu.indexOfChoice("4. Test4")) {
            System.out.println("You choose 4");
        } else if (choice == menu.indexOfChoice("Exit")) {
            System.exit(0);
        } else {
            System.out.println("Invalid choice");
        }

    }

}
