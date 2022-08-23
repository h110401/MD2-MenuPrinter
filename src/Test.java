import menu.Menu;

public class Test {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.addHeader("Test ABC");

        menu.addChoice("1. Test1");
        menu.addChoice("2. Test2");
        menu.addChoice("3. Test3");
        menu.addChoice("4. Test4");

        menu.addPaddingLeft(4);

        menu.print();

        int indexOfChoice4 = menu.indexOfChoice("4. Test4");
        System.out.println(indexOfChoice4);
    }

}
