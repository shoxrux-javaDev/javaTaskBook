package OOP.MoodleTwo.LessonTwo.TaskFourth;

public class Book {
    private String bookName;
    private String authorName;
    private int numberIsbn;
    private int price;

    public Book(String author, int price, double rebate, String heading, int numberOfPages) {

    }

    public Book() {

    }

/*    public Book(String bookName, String authorName, int numberIsbn, int price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.numberIsbn = numberIsbn;
        this.price = price;
    }*/

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberIsbn() {
        return numberIsbn;
    }

    public void setNumberIsbn(int numberIsbn) {
        this.numberIsbn = numberIsbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
