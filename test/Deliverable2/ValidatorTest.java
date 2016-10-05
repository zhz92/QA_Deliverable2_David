/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverable2;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author davidzhang
 */
public class ValidatorTest {

    @Test
    public void ifOneArgumentIsProvidedReturnTrue() {
        Assert.assertTrue(new Validator().validateNumberOfArguments(new String[]{"java", "CitySim9002", "1"}));
    }

    @Test
    public void ifOneArgumentIsNotProvidedReturnFalse() {
        Assert.assertFalse(new Validator().validateNumberOfArguments(new String[]{"java", "CitySim9002", "1", "2"}));
    }

    @Test
    public void ifArgumentIsAnIntegerReturnTrue() {
        Assert.assertTrue(new Validator().validateArgumentType(new String[]{"java", "CitySim9002", "1"}));
    }

    @Test
    public void ifArgumentIsNotAnIntegerReturnFalse() {
        Assert.assertFalse(new Validator().validateArgumentType(new String[]{"java", "CitySim9002", "test"}));
    }

    /**
     *
     * @author davidzhang
     * When the length of argument and the type of argument are correct,
     * to test if the argument is valid. Should be valid.
     */
    @Test
    public void ifArgumentLengthAndArgumentTypeIsCorrect() {

        Validator mockValidator = mock(Validator.class);

        when(mockValidator.validateNumberOfArguments(any(String[].class))).thenReturn(true);
        when(mockValidator.validateArgumentType(any(String[].class))).thenReturn(true);
        when(mockValidator.validateArguments(any(String[].class))).thenCallRealMethod();

        Assert.assertTrue(mockValidator.validateArguments(new String[2]));
    }

}
