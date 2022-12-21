class Pen{
    String type;
    String color;
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s1){
        this.name=s1.name;
        this.age=s1.age;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    
}
public class oops_basic{
    public static void main(String args[]){
        // Pen p1=new Pen();
        // p1.color="blue";
        // p1.type="gel";
        // p1.write();
        // p1.printColor();
        Student s1=new Student("abbas",65);
        s1.printInfo();
        Student s2=new Student(s1);
        s2.printInfo();
    }
}