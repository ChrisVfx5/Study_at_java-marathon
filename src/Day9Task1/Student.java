package Day9Task1;

public class Student extends Human{

    private String groupName;

    public Student(String name, String groupName){
        super(name);
        this.groupName = groupName;

    }
    protected String getGroupName(){
        return groupName;
    }

    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем: " + getName());
    }
}

