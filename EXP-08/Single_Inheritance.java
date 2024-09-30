import java.io.*;
import java.util.*;

class Animal
{
public void sound()
{
System.out.println("Animals make sound.");
}
}

class Dog extends Animal 
{
public void bark() 
{
System.out.println("Dog barks.");
}
}

class Single_Inheritance 
{
public static void main(String args[]) 
{
Dog dog = new Dog();      
dog.sound();  
dog.bark();   
}
}