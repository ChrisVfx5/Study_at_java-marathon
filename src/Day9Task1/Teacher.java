package Day9Task1;

public class Teacher extends Human{

    private String subjectName;

    protected String getSubjectName(){
        return subjectName;
    }

    public Teacher(String name, String subjectName){
        super(name);
        this.subjectName = subjectName;
    }

    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем: " + getName());
    }
}
