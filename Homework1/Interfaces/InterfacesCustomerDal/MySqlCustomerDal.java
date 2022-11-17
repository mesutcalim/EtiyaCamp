package Homework1.Interfaces.InterfacesCustomerDal;

public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("My Sql Eklendi.");
    }
}
