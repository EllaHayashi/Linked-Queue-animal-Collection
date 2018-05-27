/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * @author Ella Hayashi
 * @version 1
 * @since 2017-01-29 
 */
public class InvalidWeightException extends Exception{
    public InvalidWeightException(String message){
        super(message);
    }
}    