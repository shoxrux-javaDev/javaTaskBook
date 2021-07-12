package OOP.MoodleTwo.LessonFour.TaskFirst;

public class Ebook extends Book {
    protected String siteDownload;
    protected int fileSize;

    public Ebook(String author, int price, double rebate,
                 String heading, int numberOfPages,String siteDownload,int fileSize) {
        super(author, price, rebate, heading, numberOfPages);
        this.siteDownload=siteDownload;
        this.fileSize=fileSize;
    }

    public void printHeadingSite() {
        System.out.print("elektron kitobning sarlavhasi: "+heading);
    }
}
