package PairWorkShop;

public class FileLogger implements ILogger{
    @Override
    public void log(String name) {
        System.out.println("Logged to File");
    }
}
