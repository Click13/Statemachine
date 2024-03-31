package com.click13.statemachine;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class State {
    @Getter
    private String name;
    public State(String name){
        this.name = name;
    }
}
