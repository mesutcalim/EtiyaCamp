package Homework1.AbstractClasses.AbstractDemo;

public class SqlServerDatabaseManager extends BaseDatebaseManager{
    @Override
    public void getData() {
        System.out.println("Veri getirildi : SqlServer");
    }
}
