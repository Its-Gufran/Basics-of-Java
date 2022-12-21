public //abstraction
abstract class Animal{//no object can be created for abstract class, bnane ki koshish krenge to run time pe error aayenge 
    abstract void walk(){//ek func ko abstract bna diya to usko implementation likhne ki zarurat nhi hh
        
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}
public class Main{
    public static void main(String args[]){
        
    }
}
/*
some properties of abstract class :
1.an abstract class must be declared with an abstract keyword
2.it can have abstract and non abstract methods
3.it cannot be instantiated
4.it can have constructors and static methods also
5.it can have final methods which will force the subclass not to change the body of the methods


*/

 abstraction {
    
}
