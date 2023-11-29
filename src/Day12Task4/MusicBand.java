package Day12Task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

        private String name;
        private int year;
        List<String> members;


        public MusicBand(String name, int year, List<String> members){
            this.name = name;
            this.year = year;
            this.members = members;
        }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
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



        public static List<String> transferMembers(MusicBand band1, MusicBand band2){
            List<String> newBand = new ArrayList<>();
            for (String el : band1.getMembers()){
                newBand.add(el);
            }
            for (String el : band2.getMembers()){
                newBand.add(el);
            }
            return newBand;
        }



    }




