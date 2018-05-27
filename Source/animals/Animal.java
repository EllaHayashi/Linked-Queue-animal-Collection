/*
 * Animal.java
 * @author Ella Hayashi
 * @version 1
 * @since 2017-03-05
 * A class that represents the taxonomic class "animal"
 */
package animals;

import exceptions.*;
import javax.swing.*;
import collections.*;

public class Animal {

  /** Name of the Animal */
  protected String name = null;
  /** Weight in pounds */
  protected double weight = 0.0;
  /** age in full years */
  protected int age = 0;

  /**
   * Creates a new instance of Animal
   * @param name Name of the animal
   * @param age animal's age in years
   * @param weight Weight in pounds
   * @throws InvalidNameException
   * @throws InvalidWeightException  
   */
  public Animal(String name, int age, double weight)
          throws InvalidNameException, InvalidWeightException {
    //setName(name);
    setName(name);
    setWeight(weight);
    this.age = age;
    
  }

  /**
   * Set the name attribute
   * @param name Name string
   * @throws InvalidNameException If the name isn't long enough
   */
  public final void setName(String name) throws InvalidNameException {
   
    if (name == null || name.length() < 2) 
      throw new InvalidNameException("Name must be at least 2 characters");
    this.name = name;
  }
  
 

  /**
   * Gets the name of the animal
   * @return A String containing the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the weight attribute
   * @param weight of the animal in pounds
   * @throws InvalidWeightException If the weight is less than or equal to zero
   */
  public final void setWeight(double weight) throws InvalidWeightException {
    if (weight <= 0.0) {
      throw new InvalidWeightException("Weight must be greater than zero");
    }
    this.weight = weight;
  }

  /**
   * Gets the weight of the animal
   * @return Weight in pounds
   */
  public double getWeight() {
    return weight;
  }

  /**
   * Sets the age attribute
   * @param age of the animal specified in years
   */
  public void setAge(int age) {
    this.age = age;
  }

  /**
   * Gets the animal's age
   * @return the animals age
   */
  public int getAge() {
    return age;
  }

  /**
   * Displays information about the animal in the textArea
   * @param output a text area for the display
   */
  public void display(JTextArea output) {
    output.append("\n Animal Name: " + name + "\t weight:" + weight +
            "\t age:" + age);
  }
  
  /**
   * Returns a string representation of the animal object
   * @return a string containing contents of the object's fields 
   */
  @Override
  public String toString(){
    return ("\n Animal Name: " + name + "\t weight:" + weight +
            "\t age:" + age);
  }
}
