package OperationRunTime;

public class Chicken extends  Bird{
    public Chicken(int age, String gender, int weightInLbs)
    {
        super(age, gender, weightInLbs);
    }

    //creating an override method that is also defined in the Bird class
    //The only difference is that this method has a different print statement
    public void Fly()
    {
        System.out.println("I cannot fly ");
    }
}
