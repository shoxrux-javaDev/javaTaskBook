package PDP.groupPractice.ExtraTask.EmailAplication;

/*Dastur ishga tushganda 5ta Email boshlangich qiymatlar bilan ochiladi.
        Foydalanuvchi ulardan birini tanlab,password orqali kiradi(Banking ga o'xshab).
        Keyin undan boshqa emaillarga xabar yuborish,o'ziga kelgan xabarlarni o'qish,
        agar o'qilmagan xabarlar bo'lsa nechtaligini ko'rsatib,
        shularni dastlab ko'rsatish, chiqish kabi operatsiyalar bo'lishi kerak.*/

public class Gmail {
    private String gmail;
    private String name;            //foydalanuvchi ismi
    private String surname;         //familiyasi
    private String password;        //email paroli
    private String[] inbox = new String[10];         //kiruvchi emaillar ro'yhati
    private boolean[] status = new boolean[10];       //xabar o'qilgan xolati (true not read, false read)
    private String[] outbox = new String[10];     //chiquvchi emaillar ro'yhati
    private String[] subjects = new String[10];   //xabor mavzusi
    private Gmail[] sender = new Gmail[10];       // jo'natuvchi gmaili
    private Gmail[] receiver = new Gmail[10];     //qabul qluvchi gmaili

    public Gmail(String gmail, String name, String surname, String password) {
        this.gmail = gmail;
        this.name = name;
        this.surname = surname;
        this.password = password;
    }


    public boolean checkGmail(String gmail) {
        return this.gmail.equals(gmail);

    }

    public boolean CheckPassword(String passwords) {
        return this.password.equals(passwords);

    }

    public int getIntUnreadMessage() {
        int count_unread = 0;
        for (boolean unMessage : status) {
            if (unMessage) {
                count_unread++;
            }
        }
        return count_unread;
    }

    public String getGmail() {
        return gmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean[] getStatus() {
        return status;
    }

    public void setStatus(int index, boolean bool) {
        this.status[index] = bool;
    }

    public String[] getInbox() {
        return inbox;
    }

    public void setInbox(String messageTo, String subjectTo, Gmail sender) {
        int index = 0;
        if (getAccountIndex(inbox) != 0) {
            for (int i = 0; i < 10; i++) {
                if (inbox[i] == null) {
                    index = i;
                    break;
                }
            }
        }
        inbox[index] = messageTo;
        setSubjects(index, subjectTo);
        setStatus(index, true);
        setSender(index, sender);
    }

    public String[] getOutbox() {
        return outbox;
    }

    public void setOutbox(String messageTo, String subjectTo, Gmail receiver) {
        int index = 0;
        if (getAccountIndex(outbox) != 0) {
            for (int i = 0; i < 10; i++) {
                if (outbox[i] == null) {
                    index = i;
                    break;
                }
            }
        }
        outbox[index] = messageTo;
        setSubjects(index, subjectTo);
        this.receiver[index] = receiver;
    }

    private int getAccountIndex(String[] arr) {
        int count = 0;
        for (String string : arr) {
            if (string == null) {
                count++;
            }
        }
        return count;
    }

    public String getSubjects(int index) {
        return subjects[index];
    }

    public void setSubjects(int index, String subjectTo) {
        this.subjects[index] = subjectTo;
    }

    public Gmail getSender(int index) {
        return sender[index];
    }

    public void setSender(int index, Gmail senderTo) {
        this.sender[index] = senderTo;
    }

    public Gmail getReceiver(int index) {
        return receiver[index];
    }

    public String getMessageByInbox(int index) {
        return inbox[index];
    }

    public boolean isEmptyBox(String[] box) {
        int count = 0;
        for (String sents:box) {
            if(sents==null)
                count++;
        }
        return count == box.length;
    }

    public boolean isChangePassword(String currentPassword) {
        return getPassword().equals(currentPassword);
    }

    @Override
    public String toString() {
        return name+" "+surname+" | "+gmail;
    }


}
