package com.click13.statemachine.rules;

import com.click13.statemachine.State;
import com.click13.statemachine.Transition;

public class NotNullRule extends Rule {

    @Override
    public boolean process(State startstare, Transition[] transitions) {
        return startstare == null || transitions == null;
    }
}
