package PairWorkShop;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String name) {
        System.out.println("Logged to Database");
    }
}
