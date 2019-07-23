public class Teacher extends Person{

    private String title;

    public Teacher(String name, String surname, int age, String title) {
        super(name, surname, age);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
