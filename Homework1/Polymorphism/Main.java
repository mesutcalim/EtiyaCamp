package Homework1.Polymorphism;


public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(), new DatabaseLogger(),new ConsoleLogger()};
//        for(BaseLogger logger:loggers){
//            logger.Log("Log message");
//        }
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.Add();
    }
}
