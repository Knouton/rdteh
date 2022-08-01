package day2.first.out.strategies;

public class ToDBStrategy implements IOutStrategy {

    public void outString(String stringOut) {
        getConnected();
        executeCommand(stringOut);
        closeConnection();
    }

    private void getConnected(){
        System.out.println("connect to DB");
    }

    private void executeCommand(String stringOut){
        System.out.println("запись " + stringOut + "в БД");
    }

    private void closeConnection(){
        System.out.println("close DB connection");
    }
}
