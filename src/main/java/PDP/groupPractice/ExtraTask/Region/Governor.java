package PDP.groupPractice.ExtraTask.Region;

public class Governor extends Person {
    private int yearsActive;

    public Governor(String name, String surName, String address, int yearsActive) {
        super(name, surName, address);
        this.yearsActive = yearsActive;

    }

    @Override
    public void printInfo() {
        System.out.println("Governor: "+name+" "+surName+" | "+"Address: "+address);
        printJob();
    }

    public void printJob() {
        System.out.println("Years active: "+yearsActive);
    }

    public int getYearsActive() {
        return yearsActive;
    }

    public void setYearsActive(int yearsActive) {
        this.yearsActive = yearsActive;
    }
}