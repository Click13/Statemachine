package com.click13.statemachine.exception;

public class StatemachineException extends Exception{
    public StatemachineException(){
        super("State machine not allowed!");
    }
}
