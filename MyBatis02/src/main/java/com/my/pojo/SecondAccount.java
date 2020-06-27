package com.my.pojo;

public class SecondAccount {
    private Integer id;
    private Integer uid;
    private String secondName;
    private Account account;

    @Override
    public String toString() {
        return "SecondAccount{" +
                "id=" + id +
                ", uid=" + uid +
                ", secondName='" + secondName + '\'' +
                ", account=" + account +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
