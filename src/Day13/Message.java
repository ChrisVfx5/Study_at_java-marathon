package Day13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Message {

    protected User sender;
    protected User receiver;
    protected String text;
    protected Date date;


    public Message(User sender, User receiver, String text){
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "FROM:" + sender + "\nTO: " + receiver + "\nON:" + getDate() + "\n" + text;
    }
}
