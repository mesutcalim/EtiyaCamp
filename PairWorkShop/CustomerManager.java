package PairWorkShop;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private ICustomerDal customerDal;
    private List<ILogger> loggers;


    public CustomerManager(ICustomerDal customerDal, List<ILogger> loggers) {
        this.customerDal = customerDal;
        this.loggers = loggers;
    }
    public void add(Customer customer) {
        customerDal.add(customer);
        print();

    }
    public void remove(int id) {
        customerDal.delete(id);
        print();
    }
    public void update(int id,String name) {
        customerDal.update(id,name);
        print();
    }
    public void getById(int id){
        System.out.println(customerDal.getById(id).getId()+" , "+customerDal.getById(id).getName());
    }
    public List<Customer> getAll(){
        return customerDal.getAll();
    }
    public void print(){
        System.out.println("--------------------------------------");
        List<Customer> customerList = new ArrayList<>();
        customerList=getAll();
        for(Customer c:customerList){
            System.out.println(c.getId()+" , "+c.getName());
        }

    }


}