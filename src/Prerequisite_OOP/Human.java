package Prerequisite_OOP;

public class Human {

    //Creating instance variables
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    //creating the class constructor, which constructs human objects
    public Human()
    {
        name="Osama";
        age=12;
        heightInInches=72;
        eyeColor="green";
    }

    //Creating a speak method
    public void Speak()
    {
        System.out.println("Hello my name is: "+name);
        System.out.println("I am "+heightInInches+ " inches tall");
        System.out.println("I am "+age+ "years old ");
    }

    public void Eat()
    {
        System.out.println("I'am eating...");
    }

    public void walk()
    {
        System.out.println("I'am walking... ");
    }
    public void Work()
    {
        System.out.println("I'am working...");
    }

}
