package ru.bootybay;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyAmazingBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        MessageParser.Get_message(update);

        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
                    .setChatId(update.getMessage().getChatId())
                    .setText(update.getMessage().getText());
            SendMessage messageV = new SendMessage()
                    .setChatId(update.getMessage().getChatId())
                    .setText("Принято!");
            try {
                execute(message); // Call method to send the message
                execute(messageV);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public String getBotUsername() {
        return "Remined Bot:[";
    }

    @Override
    public String getBotToken() {
        return "650213272:AAHxv6yQhqGdme434iSPvvVZ-fXG-oeln04";
    }
}