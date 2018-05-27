/*
 * Mammal.java
 * @author Ella Hayashi
 * @version 1
 * @since 2017-03-05
 */
package animals;

import exceptions.*;
import javax.swing.JTextArea;


public class Mammal extends Animal {

  /** Mammals hair color */
  private String hairColor = null;

  /**
   * Creates a new instance of Animal
   * @param name Name of the animal
   * @param age animal's age in years
   * @param weight Weight in pounds
   * @param hairColor animals hair/fur color
   * @throws InvalidNameException 
   * @throws InvalidWeightException  
   */
  public Mammal(String name, int age, double weight, String hairColor)
          throws InvalidNameException, InvalidWeightException {
    super(name, age, weight);
    this.hairColor = hairColor;
  }

  /**
   * Set the hair color attribute
   * @param hairColor animals color
   */
  public void seColor(String hairColor) {
    this.hairColor = hairColor;
  }

  /**
   * Gets the color of the mammal's hair
   * @return hair/fur Color
   */
  public String getColor() {
    return hairColor;
  }

  /**
   * Displays a Reptile in the textArea
   * @param output a text area to display an information about the animal
   */
  @Override
  public void display(JTextArea output) {
    super.display(output);
    output.append("\t hair/fur color: " + hairColor);
  }
  
    /**
   * Returns a string representation of the Mammal object
   * @return a string containing contents of the object's fields 
   */
  @Override
  public String toString(){
    return(super.toString() + "\t hair/fur color: " + hairColor );
  }
}
