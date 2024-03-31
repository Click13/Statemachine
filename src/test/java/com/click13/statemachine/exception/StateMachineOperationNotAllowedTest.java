package com.click13.statemachine.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StateMachineOperationNotAllowedTest {
    @Test
    public void messageTest(){
        StateMachieneOperationNotAllowedException exception = new StateMachieneOperationNotAllowedException();

        Assertions.assertEquals(exception.getMessage(), "State machine operation not allowed!");
    }
}
