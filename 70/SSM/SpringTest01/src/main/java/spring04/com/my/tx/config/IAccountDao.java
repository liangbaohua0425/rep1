package spring04.com.my.tx.config;

public interface IAccountDao {

    void getMoney();

    void outputMoney();

    void addAccountLog(String name,String operation,String isSuccess);
}
