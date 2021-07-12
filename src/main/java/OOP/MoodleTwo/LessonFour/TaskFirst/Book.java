package OOP.MoodleTwo.LessonFour.TaskFirst;

public class Book {
    protected String author;
    protected double price;
    protected double rebate;
    protected String heading;
    protected int numberOfPages;

    public  Book(String author, double price, double rebate, String heading, int numberOfPages) {
        this.author = author;
        this.price = price;
        this.rebate = rebate;
        this.heading = heading;
        this.numberOfPages = numberOfPages;
    }

    public double getRebate() {
        return rebate;
    }

    public double getCalcTheSellPrice() {
    return price-((price*rebate)/100);
    }

    public double getCustomsDutyCalc() {
    return price+((price*30)/100);
    }

}
