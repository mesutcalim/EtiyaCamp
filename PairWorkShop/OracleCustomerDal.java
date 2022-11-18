package PairWorkShop;

import java.util.ArrayList;
import java.util.List;

public class OracleCustomerDal implements ICustomerDal{
    List<Customer> customers = new ArrayList<>();

    public OracleCustomerDal() {
        customers.add(new Customer("Mesut"));
        customers.add(new Customer("Mahmut"));
        customers.add(new Customer("Mert"));
    }

    @Override
    public void add(Customer customer) {
        System.out.println("Oracle'a Customer eklendi : "+ customer.getName());
        customers.add(customer);
    }

    @Override
    public void delete(int id) {
        Customer customer=getById(id);
        if(customer!=null){
            System.out.println("Oracle'dan Customer silindi : "+ customer.getName());
            customers.remove(customer);
        }
    }

    @Override
    public void update(int id,String name) {
        Customer customer=getById(id);
        if(customer!=null){
            customer.setName(name);
            System.out.println("Oracle'deki Customer güncellendi : "+ customer.getName());
        }

    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public Customer getById(int id) {
        Customer customer=null;
        for(Customer c:customers)
        {
            if(c.getId()==id)
                customer=c;
        }
        if(customer==null){
            System.out.println("Bu kullanıcı bulunamadı.");
        }
        return customer;
    }
}
