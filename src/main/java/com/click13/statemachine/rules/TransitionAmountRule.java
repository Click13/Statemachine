package com.click13.statemachine.rules;

import com.click13.statemachine.State;
import com.click13.statemachine.Transition;

public class TransitionAmountRule extends Rule {
    @Override
    public boolean process(State startstare, Transition[] transitions) {
        return transitions.length > 1;
    }
}