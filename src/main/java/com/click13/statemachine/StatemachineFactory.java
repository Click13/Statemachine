package com.click13.statemachine;

import com.click13.statemachine.exception.StatemachineException;
import com.click13.statemachine.rules.Ruleprocessor;

public class StatemachineFactory {
    private StatemachineFactory(){}

    public static Statemachine getStatemachine(State startstate, Transition[] transitions) throws StatemachineException {
        Ruleprocessor ruleprocessor = new Ruleprocessor(startstate, transitions);

        if (ruleprocessor.allOk()){
            return new Statemachine(startstate, transitions);
        } else {
            throw new StatemachineException();
        }
    }
}
