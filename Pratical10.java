/*
Write a java programn for method overloading and contructor Overloading
*/
import java.util.*;

public class OverloadingExample{
  public OverloadingExample(){
    Sytem.out.println("Default Constructor Called");
  }

  public OverloadingExample(int initialValue){
    Sytem.out.println("Parameter Constructor Called");
  }
  public static void main(String[] args){
    //Construtor Overloading
    OverloadingExample obj1 = new OverloadingExample(); // Calls default constructor
    OverloadingExample obj2 = new OverloadingExample(10); // Calls parameterized construtor
  
    // Method Overloading
    OverloadingExample calc = new OverloadingExample();
    int sum1 = calc.add(5,3); // Invokes ad method with integers
    double sum2 = calc.add(5.5,3.7); // Invokes ad method with doubles
    // Output Results
    System.out.println("Sum of Integers: " + sum1);
    System.out.println("Sum of Doubles: " + sum2);
  }
}