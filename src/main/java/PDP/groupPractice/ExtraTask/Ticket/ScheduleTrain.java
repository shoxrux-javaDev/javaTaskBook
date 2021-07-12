package PDP.groupPractice.ExtraTask.Ticket;

public class ScheduleTrain {
    Train train;
    private String from;
    private String to;
    static int countOfTicket;
    private boolean status;

    public ScheduleTrain(Train train, String from, String to, int countOfTicket) {
        this.train = train;
        this.from = from;
        this.to = to;
        ScheduleTrain.countOfTicket = countOfTicket;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public boolean isArr(String arrive) {
        if (this.to.contains(arrive)) {             // true - arrival  false - departure
            status = true;
            return status;
        }
        return false;
    }

    public boolean isDes(String numStation) {
       return this.from.contains(numStation);
    }

    @Override
    public String toString() {
        if (status){
            return train.getNumber() + "    " + from + "   " + to;
        }
            return train.getNumber() + "    " + from + "   " + to;

    }


}
