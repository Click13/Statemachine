package com.click13.statemachine;

import com.click13.statemachine.exception.StatemachineException;
import com.click13.statemachine.rules.Ruleprocessor;
import lombok.NonNull;

import java.util.LinkedList;
import java.util.List;

public class StatemachineBuilder {

    private State startState;
    private LinkedList<Transition> transitions;

    public StatemachineBuilder(){
        startState = null;
        transitions = new LinkedList<>();
    }

    public StatemachineBuilder addTransition(@NonNull Transition transition){
        transitions.add(transition);
        return this;
    }

    public StatemachineBuilder setStartState(@NonNull State startstate){
        this.startState = startstate;
        return this;
    }

    public Statemachine build() throws StatemachineException{
        Transition[] transitionsArray = toArray(transitions);

        Ruleprocessor ruleprocessor = new Ruleprocessor(startState, transitionsArray);

        if (ruleprocessor.allOk()){
            return new Statemachine(startState, transitionsArray);
        } else {
            throw new StatemachineException();
        }
    }

    private static Transition[] toArray(List<Transition> transitions){
        Transition[] out = new Transition[transitions.size()];
        for (int i = 0; i < transitions.size(); i++) {
            out[i] = transitions.get(i);
        }
        return out;
    }
}