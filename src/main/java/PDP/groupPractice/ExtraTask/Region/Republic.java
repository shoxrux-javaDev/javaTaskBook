package PDP.groupPractice.ExtraTask.Region;

public class Republic extends Area {
    President president;
    Region[] regions;
    int index=1;

    public Republic(String name, double size, long population, President president, Region[] regions) {
        super(name, size, population);
        this.president = president;
        this.regions = regions;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        president.printInfo();
        System.out.println("-------------------------------------------------------\n");
        System.out.println("Choose the region of Uzbekistan:");
        for (Region region:regions) {
            if(region!=null){
                System.out.println(index+"."+region.name);
                index++;
            }
        }
        index=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public President getPresident() {
        return president;
    }

    public void setPresident(President president) {
        this.president = president;
    }

    public Region[] getRegion() {
        return regions;
    }

    public void setRegion(Region[] region) {
        this.regions = region;
    }
}
