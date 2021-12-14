package cn.edu.zjut.service;

import cn.edu.zjut.dao.ICustomerDAO;
import cn.edu.zjut.po.Customer;

public interface IUserService
{
    void setCustomerDAO(ICustomerDAO customerDAO);
    void addUser(Customer cust);
    void delUser(Customer cust);
    void updateUser(Customer cust);
    void findUser(Customer cust);
}
