package OperationRunTime;

import java.text.Bidi;

public class zoo {
    public static void main(String[] args)
    {
        Animal animal1= new Animal(12,"MALE",221);
        animal1.eat();
        //** Note ** animal1.fly(); will give us an error, because Animal class does NOT contain the fly method since it's only in the Bird class
        //animal1.sleep();

        Bird bird1= new Bird(31,"Female",319);
        bird1.Fly();
        // the bird can access the sleep method, because the Bird class extends from the Animal class (sub class of the Animal class)
        //this allows it to use the Super classes methods, and instance variables.
        bird1.sleep();





    }
}
