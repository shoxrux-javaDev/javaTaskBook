package OOP.MoodleThree.LessonTen.TaskOne;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class TelegramDemo extends TelegramLongPollingBot {
    public static InlineKeyboardMarkup inline = new InlineKeyboardMarkup();
    public static InlineKeyboardButton button1 = new InlineKeyboardButton();
    public static ConcurrentHashMap<Long, Boolean> fromm = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<Long, Boolean> checkInline = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<Long, Double> amount = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<Long, String> from = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<Long, String> to = new ConcurrentHashMap<>();
    public static DateValidator validator = new DateValidatorUsingDateFormat("yyyy-MM-dd");
    public static SendMessage sendMessage = new SendMessage();
    public static LocalDate currentDate = LocalDate.now();
    public static String text,name,data;
    public static long result;
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        if (update.hasMessage()) {
           Long userId = message.getChatId();
            text = message.getText();
            name = message.getChat().getFirstName();
            switch (text) {
                case TextsOfBots.START:
                    caseStart(message,userId);
                    break;
                case TextsOfBots.REFRESHED:
                    fromm.put(userId, true);
                    refresh(userId);
                    try {
                        execute(InlineKeyboardMarkup(userId,
                                "Malumot yangilandi ☑" + "\n\n" + TextsOfBots.CHOOSE));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    boolean thisAmount = false;
                    if (text.equals(TextsOfBots.MENU)) {
                        try {
                            execute(InlineKeyboardMarkup(userId, TextsOfBots.CHOOSE));
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                    } else if (isNumeric(text)&&checkInline.get(userId)) {
                        if (isDouble(text)) thisAmount = true;
                        if (thisAmount) {
                            amount.put(userId, Double.parseDouble(text));
                            tryCatchOfInlineButton(userId);
                        } else {
                            sendMessage.setText(TextsOfBots.EXCEPTION).setChatId(userId);
                            execute(sendMessage);
                        }
                    } else if(validator.isValid(text)){
                            refresh(userId);
                    }else{
                        sendMessage.setText(TextsOfBots.ANSWER).setChatId(userId);
                        execute(sendMessage);
                    }
            }
        } else if (update.hasCallbackQuery()) {
            Long userId = update.getCallbackQuery().getMessage().getChatId();
            data = update.getCallbackQuery().getData();
            Integer messageId = update.getCallbackQuery().getMessage().getMessageId();
            switch (data) {
                case "current_data":
                    checkInline.put(userId,true);
                    caseCurrent(messageId,userId);
                    break;
                case "previous_data":
                    casePrevious(messageId,userId);
                    checkInline.put(userId,true);
                    break;
                case "usd":
                    caseUsd(userId);
                    calculateCurrency(messageId,userId);
                    break;
                case "eur":
                    caseUer(userId);
                    calculateCurrency(messageId,userId);
                    break;
                case "cny":
                    caseCny(userId);
                    calculateCurrency(messageId,userId);
                    break;
                case "uzs":
                    caseUzs(userId);
                    calculateCurrency(messageId,userId);
                    break;
            }
        }
    }

    public void tryCatchOfInlineButton(long userId) {
        try {
            execute(currencyInlineBoard(userId, "Valyutadan>>:"));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void caseStart(Message message,long userId) {
        fromm.put(userId, true);
        sendMessage.setText(TextsOfBots.HELLO + name + TextsOfBots.WELCOME + "\n\n" +
                TextsOfBots.RECOMMENDATION).setChatId(userId);
        setButtons(sendMessage);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void caseCurrent(Integer messageId,long userId) {
        EditMessageText editOne = new EditMessageText().setChatId(userId)
                .setMessageId(messageId)
                .setText(TextsOfBots.CURRENT);
        try {
            refresh(userId);
            execute(editOne);
        } catch (TelegramApiException | IOException e) {
            e.printStackTrace();
        }
    }

    public void casePrevious(Integer messageId,long userId) {
        EditMessageText editTwo = new EditMessageText()
                .setChatId(userId)
                .setMessageId(messageId)
                .setText(TextsOfBots.OTHER);
        try {
            execute(editTwo);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void caseUsd(long userId) {
        if (fromm.get(userId)) {
            from.put(userId, "USD");
            fromm.put(userId, false);
        } else {
            to.put(userId, "USD");
            fromm.put(userId, true);
        }
    }

    public void caseUer(long userId) {
        if (fromm.get(userId)) {
            from.put(userId, "EUR");
            fromm.put(userId, false);
        } else {
            to.put(userId, "EUR");
            fromm.put(userId, true);
        }
    }

    public void caseCny(long userId) {
        if (fromm.get(userId)) {
            from.put(userId, "CNY");
            fromm.put(userId, false);
        } else {
            to.put(userId, "CNY");
            fromm.put(userId, true);
        }
    }

    public void caseUzs(long userId) {
        if (fromm.get(userId)) {
            from.put(userId, "UZS");
            fromm.put(userId, false);
        } else {
            to.put(userId, "UZS");
            fromm.put(userId, true);
        }
    }

    public void calculateCurrency(Integer messageId,long userId) {
        if (!fromm.get(userId)) {
            EditMessageText editThird = new EditMessageText()
                    .setChatId(userId)
                    .setMessageId(messageId)
                    .setText(">");
            try {
                execute(currencyInlineBoard(userId, ">>Valyutaga"));
                execute(editThird);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        resultCurrency(messageId,userId);
    }

    public void resultCurrency(Integer messageId,long userId) {
        if (fromm.get(userId)) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader("src/main/resources/" +
                        userId + ".json"));
                List<Json> listOfJson = Arrays.asList(gson.fromJson(buffer, Json[].class));
                for (Json json : listOfJson) {
                    switch (from.get(userId)) {
                        case "USD":
                        case "EUR":
                        case "CNY":
                            theEndOfResult(json,userId);
                            break;
                    }
                }
                EditMessageText setText = new EditMessageText()
                        .setChatId(userId)
                        .setMessageId(messageId)
                        .setText("================================\n\nResult:\n" + amount.get(userId) +
                                " " + from.get(userId) + " = " + result + " " + to.get(userId)
                                + "\n\n================================\n\n" +
                                "Bo'limga qaytish uchun ⤴ /Menu");
                execute(setText);
            } catch (FileNotFoundException | TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public void theEndOfResult(Json json,long userId) {
        if (json.getCcy().equals(from.get(userId))) {
            result = (long) (Double.parseDouble(json.getRate()) * amount.get(userId));
            checkInline.put(userId, false);
        }
    }

    public SendMessage currencyInlineBoard(long userId, String curText) {
        InlineKeyboardMarkup inlineKeyboard = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineUsd = new InlineKeyboardButton();
        inlineUsd.setText("\uD83D\uDCB5 USD");
        inlineUsd.setCallbackData("usd");
        InlineKeyboardButton inlineEur = new InlineKeyboardButton();
        inlineEur.setText("\uD83D\uDCB6 EUR");
        inlineEur.setCallbackData("eur");
        InlineKeyboardButton inlineCny = new InlineKeyboardButton();
        inlineCny.setText("\uD83D\uDCB4 CNY");
        inlineCny.setCallbackData("cny");
        InlineKeyboardButton inlineUzs = new InlineKeyboardButton();
        inlineUzs.setText("UZS");
        inlineUzs.setCallbackData("uzs");
        List<InlineKeyboardButton> firstRow = new ArrayList<>();
        firstRow.add(inlineUsd);
        firstRow.add(inlineEur);
        firstRow.add(inlineCny);
        firstRow.add(inlineUzs);
        List<List<InlineKeyboardButton>> lineRowList = new ArrayList<>();
        lineRowList.add(firstRow);
        inlineKeyboard.setKeyboard(lineRowList);
        return new SendMessage().setReplyMarkup(inlineKeyboard).setChatId(userId).setText(curText);
    }

    public boolean isDouble(String text) {
        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isNumeric(String text) {
        if (text == null) {
            return false;
        }
        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void refresh(long userId) throws IOException, TelegramApiException {
        URL url = null;
        if (text.equals(TextsOfBots.REFRESHED)||data.equals("current_data")) {
                url = new URL("https://cbu.uz/oz/arkhiv-kursov-valyut/json/all/" + currentDate + "/");
        } else if (validator.isValid(text)||data.equals("previous_data")) {
            url = new URL("https://cbu.uz/oz/arkhiv-kursov-valyut/json/all/" + text + "/");
            sendMessage.setText("Qiymatni kriting:").setChatId(userId);
            execute(sendMessage);
        }
        tryCatchUrl(url,userId);
    }

    public void tryCatchUrl(URL url,long userId) {
        try {
            methodOfRefresh(url,userId);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void methodOfRefresh(URL url,long userId) throws IOException {
        HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream()));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/" + userId + ".json"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            writer.write(line);
        }
        bufferedReader.close();
        writer.close();
    }

    public SendMessage InlineKeyboardMarkup(long userId, String text) {
        button1.setText("1️⃣ Hozirgi Valyuta");
        button1.setCallbackData("current_data");
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("2️⃣ Avvalgi Valyuta");
        button2.setCallbackData("previous_data");
        List<InlineKeyboardButton> firstRowList = new ArrayList<>();
        List<InlineKeyboardButton> secondRowList = new ArrayList<>();
        firstRowList.add(button1);
        secondRowList.add(button2);
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(firstRowList);
        rowList.add(secondRowList);
        inline.setKeyboard(rowList);
        return new SendMessage().setReplyMarkup(inline).setText(text).setChatId(userId);
    }

    public void setButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(keyboard);
        keyboard.setSelective(true);
        keyboard.setResizeKeyboard(true);//buttonlarni sizeni o'zgartirmaydi har xil xolatda ham
        keyboard.setOneTimeKeyboard(false);
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton(TextsOfBots.REFRESHED));
        rowList.add(row1);
        keyboard.setKeyboard(rowList);
    }

    @Override
    public String getBotUsername() {
        return "http://t.me/Currency_Convertor_by_Khan_bot";
    }

    @Override
    public String getBotToken() {
        return "1794162057:AAHnfpQektVIhSmVI9aJrdMVPZuPpHQglK0";  //token convertor
    }
}
