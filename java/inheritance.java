class Shape{
    public void area(){
        System.out.println("display area");
    }
    
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
    
}
class EquiTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
public class Main{
    public static void main(String args[]){
        Student s1=new Student();
        s1.printInfo("abbas");
        s1.printInfo(18);
        s1.printInfo("abbas",19); 
        
    }
}
//4 Type
// single interitance
/*
1.single
Base
  |
  |
derived

2.multilevel
Base
  |
  |
derived1
  |
  |
derived2

3.hierarchial
        Base
    _____________
    |           |
derived1    derived2

4.hybrid
        Base
________________________
   |                |
derived1         derived2
                    |
                derived3
multiple inheritance is not found in java but we can use that using interface




*/
