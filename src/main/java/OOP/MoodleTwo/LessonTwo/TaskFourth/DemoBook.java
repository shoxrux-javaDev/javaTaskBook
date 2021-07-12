package OOP.MoodleTwo.LessonTwo.TaskFourth;

/* Quyidagi attributelardan iborat Book klassini encapsulation prinsipi asosida yarating:
 nomi, avtorlari(birnechta bo’lishi mumkin), ISBN(13 ta sondan iborat xalqaro kitob raqami,
  masalan 012345689112) va narxi.Avtorlar ro’yxatini chop etuvchi method yarating.*/
public class DemoBook {
    public static void main(String[] args) {

        Book book = new Book();

        book.setAuthorName("Shayx Muhammad Sodiq Muhammad Yusuf");
        System.out.println("Kitobning mualifi: "+book.getAuthorName());
        book.setBookName("Ruhiy Tarbiya");
        System.out.println("kitobning nomi: "+book.getBookName());
        book.setNumberIsbn(1235464578);
        System.out.println("Kitobning ISBN nomeri: "+book.getNumberIsbn());
        book.setPrice(120000);
        System.out.println("kitobning narxi: "+book.getPrice()+" so'm");


    }
}
