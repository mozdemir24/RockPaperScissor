import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();


        Teacher teacher = new Teacher("Ahmet", "Arslan", 40, "Doçent");
        Student student1 = new Student("Mehmet", "Özdemir", 24, "Ceng");
        Student student2 = new Student("Emre", "Bozkurt", 25, "Elk");
        Student student3 = new Student("Günsu", "Özdoğan", 24, "Elk");
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Room room = new Room("B7", "First Floor", 100, teacher, students);


        for (int i = 0; i < students.size(); i++) {

            int studentAge = students.get(i).getAge();
            String name = room.getStudent().get(i).getName();

            if (studentAge == 24) {
                System.out.printf("%s is 24 years old.\n", name);
            } else {
                System.out.printf("%s is 24 years old.\n", name);
            }
        }
    }

}
