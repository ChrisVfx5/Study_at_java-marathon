package Day6Task3;

import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    protected void infoAboutTeacher(){
        System.out.println("Имя учителя: " + name + "\nПредмет: " + subject);
    }


    protected void evaluate(Student student){

        Random rand = new Random();
        int grade = rand.nextInt(2,5);
        String result = "";
        switch (grade){
            case 5:
                result = "отлично";
                break;
            case 4:
                result = "хорошо";
                break;
            case 3:
                result = "удовлетворительно";
                break;
            case 2:
                result = "неудовлетворительно";
            default:
                break;
        }
        System.out.println(name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку: " + result);


    }


}
