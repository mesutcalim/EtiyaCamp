package PairWorkShop;

import java.util.List;

public interface ICustomerDal {
    void add(Customer customer);
    void delete(int id);
    void update(int id, String name);
    List<Customer> getAll();
    Customer getById(int id);
}
