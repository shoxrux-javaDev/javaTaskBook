package OOP.MoodleTwo.LessonTwo.TaskFifth;

public class Pen {
    private double ink; // siyoh miqdori
    private boolean button; // true - ruchka yozish xolatida false - ruchka yoza olmaydi
    private double inkConsumption; // bitta harfga ketadigan siyoh miqdori;

    public Pen(double ink, boolean button, double inkConsumption) {
        this.ink = ink;
        this.button = button;
        this.inkConsumption = inkConsumption;
    }

    public double getInk() {
        return ink;
    }

    public void setInk(double ink) {
        this.ink += ink;
    }

    public void clickButton() {
        button = !button;
    }

    public void write(String word) {
        char wordResult;
        if (button) {
            if (this.ink > 0) {
                String result = "";
                for (int i = 0; i < word.length(); i++) {
                    char letter = word.charAt(i);
                    if (letter != ' ') {
                        if (Character.isUpperCase(letter)) {
                            if (isEnough(2 * this.inkConsumption)) {
                                this.ink -= 2 * this.inkConsumption;
                                wordResult=letter;
                                result += letter;
                            } else {
                                System.out.println("siyoh " + result + " so'zigacha yetdi qolgan siyoh " + this.ink +
                                        " iltimos siyohni to'ldiring \n va so'z yozishdan oldin ruchkani" +
                                        " tugmasini bosishni unitmang \n ");
                                clickButton();
                                return;
                            }
                        } else {
                            if (isEnough(this.inkConsumption)) {
                                this.ink -= this.inkConsumption;
                                result += letter;
                            } else {
                                System.out.println("siyoh " + result + " so'zigacha yetdi qolgan siyoh " + this.ink +
                                        " iltimos siyohni to'ldiring \n va so'z yozishdan oldin ruchkani" +
                                        " tugmasini bosishni unitmang \n ");
                                clickButton();
                                return;
                            }
                        }
                    } else {
                        result += " ";
                    }
                }
                System.out.println("So'z muvaffaqiyatli yozildi! Qolgan Siyoh: " + this.ink+"\n so'z " +
                        "yozishdan oldin ruchkani tugmasini bosishni unitmang \n ");
                clickButton();
            } else if (this.ink == 0) {
                System.out.println("Ruchkada siyoh qolmagan. Iltimos zapasni almashtiring!");
            }
        } else {
            System.out.println("Ruchka yozish xolatida emas, Iltimos tugmani bosing!");
        }
    }

    public boolean isEnough(double sarf) {
        return this.ink >= sarf;
    }


}
