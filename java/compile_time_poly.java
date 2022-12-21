class Student{
    String name;
    int age; 
    public void printInfo(String name){//function overloading
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){//compile time polymorphism
        System.out.println(name+" "+age);
    }
    
}
public class Main{
    public static void main(String args[]){
        Student s1=new Student();
        s1.printInfo("abbas");
        s1.printInfo(18);
        s1.printInfo("abbas",19); 
        
    }
}public class compile_time_poly {
    
}
