package Day13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {


        User person1 = new User("Angelina");
        User person2 = new User("Tomas");
        User person3 = new User("Elizabeth");


        person1.subscribe(person2);
        person2.subscribe(person1);
        System.out.println(person1.isFriend(person2));



        person1.sendMessage(person2, "Привет, можешь поработать на выходных?");
        person1.sendMessage(person2, "плииииииз, памаги");
        person2.sendMessage(person1, "нет");
        person2.sendMessage(person1, "я уехал в горы");
        person2.sendMessage(person1, "нет интернета");
        person3.sendMessage(person1, "нашла?");
        person3.sendMessage(person1, "АУУУ?");
        person3.sendMessage(person1, "нам капец");
        person1.sendMessage(person3, "нет");
        person1.sendMessage(person3, "кажется у нас проблемы");
        person1.sendMessage(person3, "никто не может");
        person3.sendMessage(person1, "да врут они все!!!!!");

        MessageDateBase.showDialog(person1,person3);

        person2.deleteFromSubscribtion(person1);
        System.out.println(person1.isFriend(person2));





    }
}
