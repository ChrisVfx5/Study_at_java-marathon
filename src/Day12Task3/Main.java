package Day12Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        MusicBand band1 = new MusicBand("Green Day", 1987);
        MusicBand band2 = new MusicBand("Skillet", 1996);
        MusicBand band3 = new MusicBand("My chemical romance", 2001);
        MusicBand band4 = new MusicBand("Evanescence", 1995);
        MusicBand band5 = new MusicBand("Marilyn Manson", 1989);
        MusicBand band6 = new MusicBand("Linlin Park", 1996);
        MusicBand band7 = new MusicBand("Slipknot", 1992);
        MusicBand band8 = new MusicBand("Arctic Monkeys", 2002);
        MusicBand band9 = new MusicBand("30 Seconds to Mars", 1998);
        MusicBand band10 = new MusicBand("Paramore", 2004);
        MusicBand band11 = new MusicBand("The Killers", 2001);
        MusicBand band12 = new MusicBand("Fall Out Boy", 2001);
        MusicBand band13 = new MusicBand("Coldplay", 1996);

        List<MusicBand> bandList = new ArrayList<>();
        bandList.add(band1);
        bandList.add(band2);
        bandList.add(band3);
        bandList.add(band4);
        bandList.add(band5);
        bandList.add(band6);
        bandList.add(band7);
        bandList.add(band8);
        bandList.add(band9);
        bandList.add(band10);
        bandList.add(band11);
        bandList.add(band12);
        bandList.add(band13);

        System.out.println(bandList);
        Collections.shuffle(bandList);
        System.out.println(bandList);


        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        groupsAfter2000 = groupsAfter2000(bandList);
        System.out.println(groupsAfter2000);


    }


    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand el : bands) {
            if (el.getYear() > 2000)
                groupsAfter2000.add(el);
        }
        return groupsAfter2000;
    }




}
