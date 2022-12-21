interface Animal{
    int eyes=2;//eyes kahin bhi change nhi ho skta final hh ye
    void walk();//sirf abstract func ho aur koi bhi cons nhi ho skta
}
interface Herbivore{
    
}
class Horse implements Animal,Herbivore{//multiple inheritance
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class Main{
    public static void main(String args[]){
        
    }
}
/*
1.all the fields in interfaces are public,static and final by default
2.all methods are public ,abstract by default
3.a class that implements an interface must implements all the methods declared in the interface
4.interfaces support the functionality of multiple inheritance
*/



