package menu;

public interface IMenu {
    void addHeader(String header);

    void addChoice(String choice);

    void addPaddingLeft(int padding);

    void print();

    int indexOfChoice(String choice);
}
