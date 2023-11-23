package Day9Task1;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("Иван Петоров", "Группа123");
        Teacher teacher = new Teacher("Амброзий Киселев", "Химия");

        System.out.println("Учебная группа студента: " + student.getGroupName() + "\nНазвание предмета преподавателя: " + teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();





    }
}
