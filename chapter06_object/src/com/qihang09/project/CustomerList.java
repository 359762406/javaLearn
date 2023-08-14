package com.qihang09.project;

/**
 * ClassName: CustomerList
 * Package: com.qihang09.project
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/18 16:19
 * @Version 1.0
 */
public class CustomerList {
    private Customer[] customers;
    private  int total = 0;
    public CustomerList(int totalCustomers){
        this.customers = new Customer[totalCustomers];
    }
    public boolean addCustomer(Customer customer){
        if (this.total > this.customers.length){
            System.out.println("用户已满");
            return false;
        }else{
            this.customers[this.total ++ ] = customer;
            return true;
        }
    }

    public boolean replaceCustomer(int index, Customer cust){
        if (this.total > index && index >= 0 ){
            this.customers[index] = cust;
            return true;
        }
        return false;
    }
    public boolean deleteCustomer(int index){
        if (this.total > index && index >= 0 ){
            for (int i = index; i < this.total - 1; i ++ ){
                this.customers[i] = this.customers[i + 1];
            }
            this.customers[--this.total] = null;
            return true;
        }
        return false;
    }
    public Customer[] getAllCustomers(){
        Customer[] newCust = new Customer[total];
        for (int i = 0; i < this.total; i ++ ){
            newCust[i] = this.customers[i];
        }
        return newCust;
    }

    public Customer getCustomers(int index){
        if (index < 0 || index >= this.total){
            return null;
        }else{
            return customers[index];
        }
    }
    public int getTotal(){
        return this.total;
    }
}
