/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverable2;

/**
 *
 * @author davidzhang
 */
public class Validator {

    public boolean validateArguments(String[] inputArray) {
        return validateNumberOfArguments(inputArray) && validateArgumentType(inputArray);
    }

    public boolean validateNumberOfArguments(String[] inputArray) {
        return inputArray.length == 3;
    }

    public boolean validateArgumentType(String[] inputArray) {
        try {
            Integer.parseInt(inputArray[2]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
