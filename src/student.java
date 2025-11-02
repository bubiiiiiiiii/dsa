public class student {
    private String name;
    private int age;
    private String major;
    private double gpa;

    public student(String name, int age, String major, double gpa) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
    }

  //overriding toString method
    @Override  //w/o overriding default toString it gives random gibberish
    public String toString() {
        return "Student{name='" + name + "', age=" + age +
                ", major='" + major + "', gpa=" + gpa + "}";
    }

    public static void main(String[] args) {

        student student1 = new student("John Doe", 20, "Computer Science", 3.8);

        System.out.println(student1);

    }
}