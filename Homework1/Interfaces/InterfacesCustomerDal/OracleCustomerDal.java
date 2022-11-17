package Homework1.Interfaces.InterfacesCustomerDal;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle Eklendi.");
    }
}
