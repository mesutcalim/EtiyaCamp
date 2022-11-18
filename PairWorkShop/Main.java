package PairWorkShop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ILogger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new EmailLogger());
        CustomerManager manager= new CustomerManager(new MsSqlCustomerDal(),loggers);
        manager.print();
        manager.add(new Customer("Mustafa"));
        manager.remove(1);
        manager.update(1,"Muzaffer İyikidoğdugiller");
        manager.print();
        manager.getById(1);
    }
}
