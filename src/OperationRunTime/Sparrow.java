package OperationRunTime;

public class Sparrow extends Bird implements Flyable {
    public  Sparrow(int age, String gender, int weightInLbs)
    {
        super(age, gender, weightInLbs);
    }

    //creating the body for the abstract method
    public void fly()
    {
        System.out.println("Sparrow is now flying....");
    }

}
