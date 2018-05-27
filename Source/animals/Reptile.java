/*
 * Reptile.java
 * @author Ella Hayashi
 * @version 1
 * @since 2017-03-05
 */
package animals;

import exceptions.*;
import javax.swing.JTextArea;

public class Reptile extends Animal {

  /** Reptiles length */
  protected int length;

  /**
   * Creates a new instance of Reptile
   * @param name Name of the animal
   * @param age Animals age in years
   * @param weight Weight in pounds
   * @param length of the reptile
   * @throws InvalidNameException 
   * @throws InvalidWeightException  
   */
  public Reptile(String name, int age, double weight,
          int length)
          throws InvalidNameException, InvalidWeightException {
    super(name, age, weight);
    this.length = length;
  }

  /**
   * Sets the animals number of legs
   * @param length reptile's length
   */
  public void setNumberLegs(int length) {
    this.length = length;
  }

  /**
   * Gets the animal's number of legs
   * @return the reptile's length
   */
  public int getlength() {
    return length;
  }

  /**
   * Displays a Reptile in the textArea
   * @param output a text area to display an information about the animal
   */
  @Override
  public void display(JTextArea output) {
    super.display(output);
    output.append("\t length: " + length + " cm");
  }
      /**
   * Returns a string representation of the Reptile object
   * @return a string containing contents of the object's fields 
   */
  @Override
  public String toString(){
    return(super.toString() + "\t length: " + length + " cm" );
  }
}
