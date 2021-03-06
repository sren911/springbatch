package cn.itcast.ch07;

import java.io.Serializable;

/**
 * Created by admin on 2016/11/17.
 */
public class DestinationCreditBill implements Serializable {
    private String id;
    private String accountID = "";
    private String name = "";
    private double amount = 0;
    private String date;
    private String address;

    @Override
    public String toString() {
        return "DestinationCreditBill{" +
                "id='" + id + '\'' +
                ", accountID='" + accountID + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
