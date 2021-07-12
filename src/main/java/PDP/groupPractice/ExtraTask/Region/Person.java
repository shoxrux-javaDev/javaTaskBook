package PDP.groupPractice.ExtraTask.Region;

public class Person {
    protected String name;
    protected String surName;
    protected String address;

    public Person(String name, String surName, String address) {
        this.name = name;
        this.surName = surName;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("President: "+name + " " + surName + " | "+"Address: " + address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }
}