package com.my.pojo;

public class Account {
    private Integer id;
    private String name;
    private Double money;
    private SecondAccount secondAccount;


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", secondAccount=" + secondAccount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public SecondAccount getSecondAccount() {
        return secondAccount;
    }

    public void setSecondAccount(SecondAccount secondAccount) {
        this.secondAccount = secondAccount;
    }
}
