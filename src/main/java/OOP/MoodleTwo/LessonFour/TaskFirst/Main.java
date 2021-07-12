package OOP.MoodleTwo.LessonFour.TaskFirst;

public class Main {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Shayx Muhammad Sodiq Muhammad Yusuf ",
                47000, 5, "\"Baxtiyor oila\" ", 500, "HilolEbook.uz", 10);
        paperBook bookPaper = new paperBook("Shayx Muhammad Sodiq Muhammad Yusuf ", 47000, 5,
                "\"Baxtiyor oila\" ", 500, 10, "05.02.2021");

        ebook.printHeadingSite();
        System.out.println(" Kitobning narxi " + ebook.getCalcTheSellPrice() + " " + ebook.getRebate() + "% chegimasi bilan");
        bookPaper.printHeadingBook();
        System.out.println(" Kitobning narxi " + ebook.getCustomsDutyCalc() + "  bojxona to'lovi bilan");

    }
}
