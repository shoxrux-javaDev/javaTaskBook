package PDP.groupPractice.ExtraTask.Ticket;

public class Ticket {
    private long ticketNumber;
    private final String departure;
    private final String destination;
    private final String categoryOfClass;
    private final double price;
    private boolean status;
    Train train;



    public Ticket(long ticketNumber, String departure, String destination, String categoryOfClass,
                  double price, Train train) {
        this.ticketNumber = ticketNumber;
        this.departure = departure;
        this.destination = destination;
        this.categoryOfClass = categoryOfClass;
        this.price = price;
        this.train = train;
    }

    public double getPrice() {
        return price;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public Train getTrain() {
        return train;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean checkDep(String nameDep) {
        return this.departure.contains(nameDep);
    }

    public boolean checkDest(String nameDes) {
         if (this.destination.contains(nameDes)) {
                status = true;
                return true;
            }
            return false;
    }

    @Override
    public String toString() {
        if (status) {
            return departure + " ---- " + destination + "  |  " + categoryOfClass + "  |  " + getPrice();
        }
        return train.getNumber() + "    " + departure + "    " + destination;
    }
}




