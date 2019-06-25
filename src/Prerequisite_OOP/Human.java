package Prerequisite_OOP;

public class Human {

    //Creating instance variables
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    //creating the class constructor, which constructs human objects
    public Human(String name, int age, int heightInInches, String eyeColor)
    {
        this.name=name;
        this.age=age;
        this.heightInInches=heightInInches;
        this.eyeColor=eyeColor;
    }

    //Creating a speak method
    public void Speak()
    {
        System.out.println("Hello my name is: "+name);
        System.out.println("I am "+heightInInches+ " inches tall");
        System.out.println("I am "+age+ "years old ");
        System.out.println("My Eye color is: "+eyeColor);
        System.out.println();
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
