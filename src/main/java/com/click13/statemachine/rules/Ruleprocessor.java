package com.click13.statemachine.rules;

import com.click13.statemachine.State;
import com.click13.statemachine.Transition;

public class Ruleprocessor {
    private State startstate;
    private Transition[] transitions;
    Rule[] rules;
    public Ruleprocessor(State startstate, Transition[] transitions){
        this.startstate = startstate;
        this.transitions = transitions;

        rules = new Rule[]{
                new NotNullRule(),
                new TransitionAmountRule(),
                new NoNullStatesInTransitionsRule(),
                new TransitionStartStateRule(),
                new NotNullOperationsRule(),
                new TransitionStartStateRule(),
                new DeterministischeRegel()
                };
    }

    public boolean allOk(){
        for (int i = 0; i < rules.length; i++) {
            if (!rules[i].process(startstate, transitions)){
                return false;
            }
        }
        return true;
    }
}
