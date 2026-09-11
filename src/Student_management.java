class Student{
    private String name;
    private int semester;
    private final int id;
    private static int count=0;

    Student(String name, int semester){
        this.name=name;
        this.semester=semester;
        id=count++;
    }
    void display(){
        System.out.println("The id, name and semester of the student is: "+id+" "+name+" "+semester);
    }

    class Course{
        private String courseName;
        private int credits;

        Course(String courseName, int credits){
            this.courseName=courseName;
            this.credits=credits;
        }
        void increaseCredits(int extra) {
            credits += extra;
            if (extra >= 3) {
                semester++;
            }
        }
            void display(){
                System.out.println("The course name, credits and student's name are: "+courseName+" "+credits+" "+name);
            }

    }
    static class IDCard{
private String bloodGroup;
   IDCard(String bloodGroup){
    this.bloodGroup=bloodGroup;
}
void display(Student s){
    System.out.println("The blood group of the student is: "+bloodGroup);
    System.out.println("The number of students is: "+ count);
    System.out.println("The id of students is: "+ s.id);
   }
    }
}

public class Practice_problem3{
    public static void main(String [] args){
        Student s1=new Student("Kaberee", 3);
        Student s2=new Student ("Muhib", 3);
        Student.Course c1=s1.new Course("CA", 3);
        Student.Course c2=s2.new Course("Economics", 3);
        c1.increaseCredits(5);
        c2.increaseCredits(2);
        Student.IDCard id1= new  Student.IDCard("A+");
        Student.IDCard id2= new  Student.IDCard("O-");
s1.display();
        s2.display();
        c1.display();
        c2.display();
        id1.display(s1);
        id2.display(s2);

    }
}
