class Student1{
    private String name;
    private int semester;
    private final int id;
    private static int count=0;

    Student1(String name, int semester){
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
void display(Student1 s){
    System.out.println("The blood group of the student is: "+bloodGroup);
    System.out.println("The number of students is: "+ count);
    System.out.println("The id of students is: "+ s.id);
   }
    }
}

public class Practice_problem3{
    public static void main(String [] args){
        Student1 first=new Student1("Kaberee", 3);
        Student1 second=new Student1 ("Muhib", 3);
        Student1.Course c1=first.new Course("CA", 3);
        Student1.Course c2=second.new Course("Economics", 3);
        c1.increaseCredits(5);
        c2.increaseCredits(2);
        Student1.IDCard id1= new  Student1.IDCard("A+");
        Student1.IDCard id2= new  Student1.IDCard("O-");
first.display();
        second.display();
        c1.display();
        c2.display();
        id1.display(first);
        id2.display(second);

    }
}