package Day13;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    protected String userName;
   protected List<User> subscriptions = new ArrayList<>();


    // КОНСТРУКТОР
    public User(String userName){
        this.userName = userName;
    }

    // ГЕТТЕРЫ
    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    // МЕТОДЫ

    protected void subscribe(User user){
        subscriptions.add(user);
    }

    protected boolean isSubscribed(User user){
        return (this.subscriptions.contains(user)) ? true : false;
    }

    protected void deleteFromSubscribtion(User user){
        if(this.subscriptions.contains(user)){
            subscriptions.remove(user);
        }
    }

    protected boolean isFriend(User user){
        if(this.isSubscribed(user) && user.isSubscribed(this)){
            return true;
        }else
            return false;
    }



    protected void sendMessage(User user, String text){
        MessageDateBase.addNewMessage(this, user, text);

    }



    @Override
    public String toString() {
        return userName;
    }
}
