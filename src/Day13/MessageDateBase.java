package Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDateBase {

    protected static List<Message> messages = new ArrayList<>();

   public static void addNewMessage(User sender, User receiver, String text){
       messages.add(new Message(sender, receiver, text));
   }

    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){
       for(Message el : messages){
           if(el.getSender() == u1 && el.getReceiver() == u2
                   || el.getSender() == u2 && el.getReceiver() == u1 ){
               System.out.println(el.getSender() + ": " + el.getText());
           }
       }


    }

}
