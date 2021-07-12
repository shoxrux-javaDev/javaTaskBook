package PDP.groupPractice.ExtraTask.Region;

public class District extends Area {
    Governor governor;
    public District(String name, double size, long population, Governor governor) {
        super(name, size, population);
        this.governor=governor;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        governor.printInfo();
        System.out.println("-------------------------------------------------------\n");
    }

    public Governor getGovernor() {
        return governor;
    }

    public void setGovernor(Governor governor) {
        this.governor = governor;
    }
}
