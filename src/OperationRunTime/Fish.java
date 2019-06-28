package OperationRunTime;

public class Fish extends  Animal{

    //creating a Fish constructor that matches the inherits from the Animal class
    //We do this, because the Fish is an animal. So what ever values the animal contains then the fish must also have that.
    public Fish(int age, String gender, int weightInLbs)
    {
        super(age,gender,weightInLbs);
    }
    //creating a method for the Fish class
    public void Swim()
    {
        System.out.println("I'am swimming");
    }

}
