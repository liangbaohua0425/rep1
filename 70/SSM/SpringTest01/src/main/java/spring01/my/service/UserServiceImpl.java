package spring01.my.service;

import spring01.my.dao.IUserDao;

import java.util.*;

public class UserServiceImpl implements IUserService {

    private IUserDao userDao;
    private Integer age;
    private String sex;
    private List<String> list;
    private List<IUserDao> userDaos;
    private Map<String,IUserDao> map;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, IUserDao> getMap() {
        return map;
    }

    public void setMap(Map<String, IUserDao> map) {
        this.map = map;
    }

    public List<IUserDao> getUserDaos() {
        return userDaos;
    }

    public void setUserDaos(List<IUserDao> userDaos) {
        this.userDaos = userDaos;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
/*    public UserServiceImpl(IUserDao userDao){
        this.userDao = userDao;
    }*/

    public void getName() {
        userDao.getName();
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
