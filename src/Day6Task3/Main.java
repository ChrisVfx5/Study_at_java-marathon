package Day6Task3;

public class Main {
    public static void main(String[] args) {


        Teacher teacher = new Teacher("Алексей Иванов", "Химия");
        teacher.infoAboutTeacher();

        Student student = new Student("Габриель Григорьевич");
        student.infoAboutStuden();
        
        teacher.evaluate(student);





    }
}
