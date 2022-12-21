//packages------------------------------------------------------------------
// ///import bank;
// package bank;

// class Account{
//     public String name;
    
    
// }
// public class Bank{
    
// }
// ----------------------------------------------------------------------------
// access modifier
//public --koi bhi use kahin bhi pure class me bhi kahin use kro ya kahin import krke bhi use kr skte
class Account{
    public String name;
    protected String email;
    private String password;
    //to get private data we can use getters
    //to set private data we use setters
    public String getPassword(){
        return this.password;
    }
    public void setpass(String pass){
        this.password=pass;
    }
}
public class Bank{
    public void main(String args[]){
        Account a1=new Account();
        a1.name="abbas";//yaha access kr rhe
        a1.email="haider@gmail.com";
        
    }
}
//default-- apne package ke andar sab access krle mtlb koi import krke access nhi kr payega defaut ko yaha default lgane ki zarurat 
//nhi hoti
//protected-- apne package me sub access kr skte aur jo import kre waha subclasses access kr skti
//private--sirf class ke andar hi access kr skte koi inherit krke bhi nhi access kr skta packages_and_access_modifier {
