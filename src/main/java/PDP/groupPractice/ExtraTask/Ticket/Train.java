package PDP.groupPractice.ExtraTask.Ticket;

public class Train {
    private String number;
    private int countOfSeats;

    public Train(String number, int countOfSeats) {
        this.number = number;
        this.countOfSeats = countOfSeats;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
