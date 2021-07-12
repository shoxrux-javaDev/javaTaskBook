package OOP.MoodleTwo.LessonOne.TaskFifth;

public class ReturnAmount {
    private final String surname;
    private final String name;
    private final String groupNumber;
    private final String[] subject;

    public ReturnAmount(String surname, String name, String groupNumber, String[] subject) {
        this.surname = surname;
        this.name = name;
        this.groupNumber = groupNumber;
        this.subject = subject;
    }
    public String[] showNumber(){
        String[] getNumber=new String[3];
        getNumber[0]=surname;
        getNumber[1]=name;
        getNumber[2]=groupNumber;
        return getNumber;
    }

    public String[] printSubjects() {
        return subject;
    }
}
