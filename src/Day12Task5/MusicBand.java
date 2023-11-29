package Day12Task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    List<MusicArtist> members;


    public MusicBand(String name, int year, List<MusicArtist> members){
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public void printMembers(){
        System.out.println(members);
    }


    @Override
    public String toString() {
        return name + " - " + year;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }




    public static void transferMembers(MusicBand band1, MusicBand band2){
        for (MusicArtist el: band2.getMembers()){
            band1.getMembers().add(el);
            }
        band2.getMembers().clear();
    }




    }







