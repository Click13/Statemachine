package com.click13.statemachine;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class State {
    private String name;
    private boolean isEndState;

    public State(String name){
        this.name = name;
        isEndState = false;
    }

    public State(String name, boolean endState){
        this.name = name;
        this.isEndState = endState;
    }
}