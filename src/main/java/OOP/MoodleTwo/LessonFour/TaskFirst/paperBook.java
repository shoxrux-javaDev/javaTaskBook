package OOP.MoodleTwo.LessonFour.TaskFirst;

public class paperBook extends Book {
    protected double weight;
    protected String deliveryTime;

    public paperBook(String author, int price, double rebate, String heading,
                     int numberOfPages,double weight,String deliveryTime) {
        super(author, price, rebate, heading, numberOfPages);
    }

    public void printHeadingBook() {
        System.out.print("kitobning sarlavhasi:"+heading);
    }
}
