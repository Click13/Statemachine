package com.click13.statemachine.exception;

public class StateMachieneOperationNotAllowedException extends Exception{
    public StateMachieneOperationNotAllowedException(){
        super("State machine operation not allowed!");
    }
}
