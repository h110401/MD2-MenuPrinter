public class Test {

    public static void main(String[] args) {
        // Set max width of menu
        Menu menu = new Menu(30);

        // Add header
        menu.addHeader("Test Menu");


        // Add choice
        menu.addChoice("1. Test1");
        menu.addChoice("2. Test2");
        menu.addChoice("3. Test3");

        // Add left padding
        menu.addPaddingLeft(4);


        // Print menu
        menu.print();

    }

}
