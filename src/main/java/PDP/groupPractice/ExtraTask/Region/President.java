package PDP.groupPractice.ExtraTask.Region;

public class President extends Person {
    int yearsActive;

    public President(String name, String surName, String address,int yearsActive) {
        super(name, surName, address);
        this.yearsActive = yearsActive;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        printJob();
    }
    public void printJob(){
        System.out.println("Years active: "+yearsActive);
    }

    public int getYearsActive() {
        return yearsActive;
    }

    public void setYearsActive(int yearsActive) {
        this.yearsActive = yearsActive;
    }
}