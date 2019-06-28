package OperationRunTime;

//The subclass 'Bird' extends the super class 'Animal'
public class Bird extends Animal {

    //A bird is an Animal and it needs the same attributes (instances) as the animal class, hence we must create the same constructor
    //creating the Bird constructor that is the same as the Animal class constructor
    //we have to create this constructor or else we will get an error, because the Animal class contains that constructor and the sub class does not
    public Bird(int age, String gender, int weightInLbs)
    {
        //super() allows us to use the instance variables directly from the super class which is the Animal
        super(age, gender, weightInLbs);
    }


    //    public void Fly()
    //    {
    //        System.out.println("I'am flying...");
    //    }
}
