package OOP.MoodleThree.LessonTen.TaskOne;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;


public class MainBot {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi api = new TelegramBotsApi();
        try {
            api.registerBot(new TelegramDemo());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }
}
