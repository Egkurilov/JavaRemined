package ru.bootybay;

import org.telegram.telegrambots.meta.api.objects.Update;

public class MessageParser {



    public static void Get_message(Update update) {
        System.out.println(update);
        System.out.println(GetUpdateId(update));
        System.out.println(GetMessageMessageId(update));
        System.out.println(GetUserId(update));
        System.out.println(GetFirstName(update));
        System.out.println(GetLastName(update));
        System.out.println(GetUserName(update));

    }

    public static Integer GetUpdateId(Update update){
        Integer getUpdateId = update.getUpdateId();
        return getUpdateId;
    }

    public static Integer GetMessageMessageId(Update update){
        Integer MessageMessageId = update.getMessage().getMessageId();
        return MessageMessageId;
    }
    public static Integer GetUserId(Update update) {
        Integer GetUserId = update.getMessage().getFrom().getId();
        return GetUserId;
    }
    public static String GetFirstName(Update update) {
        String getFirstName = update.getMessage().getFrom().getFirstName();
        return getFirstName;
    }
    public static String GetLastName(Update update) {
        String getLastName = update.getMessage().getFrom().getLastName();
        return getLastName;
    }
    public static String GetUserName(Update update) {
        String getUserName = update.getMessage().getFrom().getUserName();
        return getUserName;
    }
    // .... next tags
}
