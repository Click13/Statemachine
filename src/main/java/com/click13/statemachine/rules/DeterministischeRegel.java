package com.click13.statemachine.rules;

import com.click13.statemachine.State;
import com.click13.statemachine.Transition;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.LinkedList;

public class DeterministischeRegel extends Rule{
    @Override
    public boolean process(State startstare, Transition[] transitions) {
        LinkedList<DataObject> layout = new LinkedList<>();
        for (int i = 0; i < transitions.length; i++) {
            DataObject toTest = new DataObject(transitions[i].getStartstate(), transitions[i].getOperation());

            if (layout.contains(toTest)){
                return false;
            }else {
                layout.add(toTest);
            }
        }
        return true;
    }

    @EqualsAndHashCode
    private class DataObject{
        @Getter
        State state;
        @Getter
        String operation;
        protected DataObject(State state, String operation){
            this.state = state;
            this.operation = operation;
        }
    }
}
