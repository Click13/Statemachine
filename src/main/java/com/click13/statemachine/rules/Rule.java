package com.click13.statemachine.rules;

import com.click13.statemachine.State;
import com.click13.statemachine.Transition;

abstract class Rule {
    public abstract boolean process(State startstare, Transition[] transitions);
}