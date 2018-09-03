import org.telegram.telegrambots.meta.api.objects.Update;

public class MessageParser {



    public static void Get_message(Update update) {
        System.out.println(update);
        System.out.println(GetUpdateId(update));
        System.out.println(MessageMessageId(update));
    }

    public static Integer GetUpdateId(Update update){
        Integer getUpdateId = update.getUpdateId();
        return getUpdateId;
    }

    public static Integer MessageMessageId(Update update){
        Integer MessageMessageId = update.getMessage().getMessageId();
        return MessageMessageId;
    }

}
