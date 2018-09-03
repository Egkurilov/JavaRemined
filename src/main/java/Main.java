import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.BotOptions;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import org.telegram.telegrambots.meta.generics.WebhookBot;

public class Main {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new MyAmazingBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

        class ChannelHandlers implements LongPollingBot, WebhookBot {
            public void onUpdateReceived(Update update) {

            }

            public BotApiMethod onWebhookUpdateReceived(Update update) {
                return null;
            }

            public String getBotUsername() {
                return null;
            }

            public String getBotToken() {
                return null;
            }

            public void setWebhook(String s, String s1) throws TelegramApiRequestException {

            }

            public String getBotPath() {
                return null;
            }

            public BotOptions getOptions() {
                return null;
            }

            public void clearWebhook() throws TelegramApiRequestException {

            }
        }
    }
}