package day2.first.out.strategies;

public class ToFileStrategy implements IOutStrategy {

    public void outString(String stringOut) {
        createOrOpenFile();
        writeToFile(stringOut);
        CloseFile();
    }

    private void createOrOpenFile() {
        System.out.println("create or open file");
    }

    private void writeToFile(String stringOut) {
        System.out.println("WriteToFile " + stringOut);
    }

    private void CloseFile() {
        System.out.println("close file");
    }
}
