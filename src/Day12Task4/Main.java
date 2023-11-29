package Day12Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("Jared Leto");
        members1.add("Shennon Leto");
        members1.add("Tomo Milicevic");

        List<String> members2 = new ArrayList<>();
        members2.add("Marilyn Manson");
        members2.add("Daisy Berkowitz");

        List<String> members3 = new ArrayList<>();
        members3.add("Chester Bennington");
        members3.add("Mike Shinoda");
        members3.add("Joe Hahn");
        members3.add("Brad Delson");
        members3.add("Robert Bourdon");
        members3.add("David Michael Farrell");






        MusicBand band1 = new MusicBand("30 Seconds to Mars", 1998, members1);
        MusicBand band2 = new MusicBand("Marilyn Manson", 1989, members2);
        MusicBand band3 = new MusicBand("Linkin Park", 1996, members3);

        System.out.println(band1.getMembers());
        System.out.println(band2.getMembers());
        System.out.println(band3.getMembers());

        List<String> newBand = new ArrayList<>();
        newBand = MusicBand.transferMembers(band1, band2);
        System.out.println("Совместный дуэт исполнителей: " + newBand);


        band2.printMembers();



    }
}
