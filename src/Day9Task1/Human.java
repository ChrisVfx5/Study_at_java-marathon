package Day9Task1;

public class Human {

    private String name;

    public Human(String name){
        this.name = name;
    }

    protected String getName(){
         return name;
     }

     protected void printInfo(){
         System.out.println("Этот человек с именем: " + name);
     }





}
