package PDP.groupPractice.ExtraTask.OnlineShop;

import java.util.Scanner;

public class Shop {
    private String type;
    private String name;
    private int price;
    private int quantity ;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean Buying(int num1) {
        if(getQuantity()>=num1) {
            setQuantity(getQuantity() - num1);
            return true;
        }
        return false;
    }

    public void setAdding(int num1) {
        this.quantity += num1;
    }

    public int getAdding() {
        return this.quantity;
    }

}
