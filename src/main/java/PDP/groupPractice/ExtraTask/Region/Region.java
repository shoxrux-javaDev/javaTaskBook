package PDP.groupPractice.ExtraTask.Region;

public class Region extends Area {
    District districts;
    Governor governor;

    public Region(String name, double size, long population, District districts, Governor governor) {
        super(name, size, population);
        this.districts = districts;
        this.governor = governor;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        governor.printInfo();
        System.out.println("-------------------------------------------------------\n");
        System.out.println("choose the district of " + name);
        System.out.println("1." + districts.name);
    }

    public District getDistrict() {
        return districts;
    }

    public void setDistrict(District district) {
        this.districts = district;
    }
}
