package Day12Task5;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MusicArtist>members1 = new ArrayList<>();
        members1.add(new MusicArtist("Jared Leto", 51));
        members1.add(new MusicArtist("Shennon Leto", 53));
        members1.add(new MusicArtist("Tomo Milicevic", 44));


        List<MusicArtist>members2 = new ArrayList<>();
        members2.add(new MusicArtist("Marilyn Manson", 54));
        members2.add(new MusicArtist("Daisy Berkowitz", 55));


        List<MusicArtist> members3 = new ArrayList<>();
        members3.add(new MusicArtist("Chester Bennington", 41 ));
        members3.add(new MusicArtist("Mike Shinoda", 46));
        members3.add(new MusicArtist("Joe Hahn", 46));
        members3.add(new MusicArtist("Brad Delson", 45));
        members3.add(new MusicArtist("Robert Bourdon", 44));
        members3.add(new MusicArtist("David Michael Farrell", 46 ));





       MusicBand band1 = new MusicBand("30 Seconds to Mars", 1998, members1);
       MusicBand band2 = new MusicBand("Marilyn Manson", 1989, members2);
       MusicBand band3 = new MusicBand("Linkin Park", 1996, members3);

        System.out.println(band1.getMembers());
        System.out.println(band2.getMembers());
        System.out.println(band3.getMembers());


        MusicBand.transferMembers(band1,band2);

        StringBuilder newBand = new StringBuilder();
        for (MusicArtist el: band1.getMembers()){
            newBand.append(el).append(" ");
        }

        System.out.println("Слияние групп: " + newBand);

        System.out.println("Слияние групп: " + band1.getMembers());


    }
}
