package com.overriding_assignment;
class Derived  
{ 
    public void getDetails(String temp) 
    { 
        System.out.println("Derived class " + temp); 
    } 
} 
  
public class Test extends Derived 
{ 
    public void getDetails(String temp) // return type should be same but in this program it is int so it will give error
    { 
        System.out.println("Test class " + temp); 
        //return 0; 
    } 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        obj.getDetails("Hello"); 
    } 
}
