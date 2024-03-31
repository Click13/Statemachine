package com.click13.statemachine.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StateMachineExceptionTest {
    @Test
    public void messageTest(){
        StatemachineException exception = new StatemachineException();

        Assertions.assertEquals(exception.getMessage(), "State machine not allowed!");
    }
}
