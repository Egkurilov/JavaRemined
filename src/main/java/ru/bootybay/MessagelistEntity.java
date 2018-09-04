package ru.bootybay;

import javax.persistence.*;

@Entity
@Table(name = "messagelist", schema = "messages", catalog = "")
public class MessagelistEntity {
    private int id;
    private Integer updateId;
    private Integer messageId;
    private String userId;
    private String chatId;
    private Integer date;
    private String firstName;
    private String lastName;
    private String userName;
    private Double isBot;
    private String text;
    private String messageListcol;
    private String messageListcol1;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "update_id", nullable = true)
    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    @Basic
    @Column(name = "message_id", nullable = true)
    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    @Basic
    @Column(name = "user_id", nullable = true, length = 45)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "chat_id", nullable = true, length = 45)
    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    @Basic
    @Column(name = "first_name", nullable = true, length = 100)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = true, length = 100)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 100)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "is_bot", nullable = true, precision = 0)
    public Double getIsBot() {
        return isBot;
    }

    public void setIsBot(Double isBot) {
        this.isBot = isBot;
    }

    @Basic
    @Column(name = "text", nullable = true, length = 9999)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "message_listcol", nullable = true, length = 45)
    public String getMessageListcol() {
        return messageListcol;
    }

    public void setMessageListcol(String messageListcol) {
        this.messageListcol = messageListcol;
    }

    @Basic
    @Column(name = "message_listcol1", nullable = true, length = 45)
    public String getMessageListcol1() {
        return messageListcol1;
    }

    public void setMessageListcol1(String messageListcol1) {
        this.messageListcol1 = messageListcol1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessagelistEntity that = (MessagelistEntity) o;

        if (id != that.id) return false;
        if (updateId != null ? !updateId.equals(that.updateId) : that.updateId != null) return false;
        if (messageId != null ? !messageId.equals(that.messageId) : that.messageId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (chatId != null ? !chatId.equals(that.chatId) : that.chatId != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (isBot != null ? !isBot.equals(that.isBot) : that.isBot != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (messageListcol != null ? !messageListcol.equals(that.messageListcol) : that.messageListcol != null)
            return false;
        if (messageListcol1 != null ? !messageListcol1.equals(that.messageListcol1) : that.messageListcol1 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (updateId != null ? updateId.hashCode() : 0);
        result = 31 * result + (messageId != null ? messageId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (chatId != null ? chatId.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (isBot != null ? isBot.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (messageListcol != null ? messageListcol.hashCode() : 0);
        result = 31 * result + (messageListcol1 != null ? messageListcol1.hashCode() : 0);
        return result;
    }
}
