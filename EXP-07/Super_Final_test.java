import java.io.*;
import java.util.*;

class Animal {
public final void sound() 
{
System.out.println("Animals make sound.");
}
    
public void eat()
{
System.out.println("Animals eat food.");
}
}

class Dog extends Animal 
{
public void eat() 
{
super.eat(); 
System.out.println("Dog eats bones.");
}
}

final class Cat extends Animal 
{    
public void purr()
{
System.out.println("Cat purrs.");
}
}

class Super_Final_test
{
public static void main(String args[]) {
Dog dog = new Dog();
dog.eat(); 
dog.sound();
  
Cat cat = new Cat();
cat.eat(); 
cat.purr();
}
}