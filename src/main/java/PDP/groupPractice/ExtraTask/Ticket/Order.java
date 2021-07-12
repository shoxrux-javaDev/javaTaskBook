package PDP.groupPractice.ExtraTask.Ticket;

public class Order {
    private int orderId;
    User user;
    Ticket ticket;

    public Order(int orderId, User user, Ticket ticket) {
        this.orderId = orderId;
        this.user = user;
        this.ticket = ticket;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return ticket.train.getNumber()+"    "+ticket.getDeparture()+" ----- "+ticket.getDestination();
    }
}
