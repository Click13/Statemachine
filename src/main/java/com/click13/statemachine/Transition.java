package com.click13.statemachine;

import lombok.Getter;

public final class Transition {

    @Getter
    private State startstate;
    @Getter
    private String operation;
    @Getter
    private State endstate;

    public Transition(State startstate, String operation, State endstate){
        this.startstate = startstate;
        this.endstate = endstate;
        this.operation = operation;
    }
}