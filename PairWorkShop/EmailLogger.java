package PairWorkShop;

public class EmailLogger implements ILogger{
    @Override
    public void log(String name) {
        System.out.println("Logged to Email");
    }
}
