package Day6Task3;

public class Student {

    private String name;



    public Student(String name){

        this.name = name;
    }

    protected void setName(String name){

        this.name = name;
    }

    protected String getName(){

        return name;
    }

    protected void infoAboutStuden(){

        System.out.println("Имя студента: " + name);
    }





}
