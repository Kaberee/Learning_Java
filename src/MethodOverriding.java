class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void introduce() {
        System.out.println("I am a person.");
    }
}

class Student2 extends Person {
    private String department;
    private double CGPA;

    Student2(String name, int age, String dept, double cg) {
        super(name, age);
        this.department = dept;
        this.CGPA = cg;
    }

    @Override
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age
                + ", Department: " + department + ", CGPA: " + CGPA);
    }

    @Override
    void introduce() {
        System.out.println("I am a student.");
    }

    void study() {
        System.out.println("Student is studying.");
    }
}

class Teacher extends Person {
    private String subject;
    private double salary;

    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age
                + ", Subject: " + subject + ", Salary: " + salary);
    }

    @Override
    void introduce() {
        System.out.println("I am a teacher.");
    }

    void teach() {
        System.out.println("Teacher is teaching.");
    }
}

class ResearchStudent extends Student2 {
    private String researchTopic;

    ResearchStudent(String name, int age, String dept,
                    double cg, String researchTopic) {
        super(name, age, dept, cg);
        this.researchTopic = researchTopic;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }

    @Override
    void introduce() {
        System.out.println("I am a research student.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Student2 s1 = new Student2("Kaberee", 21, "Software Engineering", 3.85);
        Teacher t1 = new Teacher("Rahman", 45, "Java", 75000);
        ResearchStudent r1 = new ResearchStudent(
                "Tasnima", 21, "Software Engineering", 3.90,
                "Artificial Intelligence"
        );

        Person p1 = s1;
        Person p2 = t1;

        p1.displayInfo();
        p1.introduce();

        p2.displayInfo();
        p2.introduce();


        Person[] people = {s1, t1, r1};

        for (Person p : people) {
            System.out.println("\n----------------");
            p.displayInfo();
            p.introduce();
        }

        if (p1 instanceof Student2) {
            Student2 student = (Student2) p1;
            student.study();
        }
    }
}