import java.util.ArrayList;

public class Room {

    private String name;
    private String location;
    private int capacity;
    private Teacher teacher;
    private ArrayList<Student> student;

    public Room(String name, String location, int capacity, Teacher teacher, ArrayList<Student> student) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.teacher = teacher;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }
}
