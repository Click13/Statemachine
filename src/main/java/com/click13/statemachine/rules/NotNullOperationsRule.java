package com.click13.statemachine.rules;

import com.click13.statemachine.State;
import com.click13.statemachine.Transition;

public class NotNullOperationsRule extends Rule {
    @Override
    public boolean process(State startstare, Transition[] transitions) {
        for (int i = 0; i < transitions.length; i++) {
            if (transitions[i].getOperation() == null){
                return false;
            }
        }
        return true;
    }
}