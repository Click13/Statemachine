package com.click13.statemachine.rules;

import com.click13.statemachine.Transition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransitionAmountRuleTest {
    @Test
    public void processTransiotionAmout01(){
        TransitionAmountRule rule = new TransitionAmountRule();

        Assertions.assertFalse(rule.process(null, new Transition[0]));
    }

    @Test
    public void processTransiotionAmout02(){
        TransitionAmountRule rule = new TransitionAmountRule();

        Assertions.assertFalse(rule.process(null, new Transition[1]));
    }

    @Test
    public void processTransiotionAmout03(){
        TransitionAmountRule rule = new TransitionAmountRule();

        for (int i = 2; i < 100; i++) {
            Assertions.assertTrue(rule.process(null, new Transition[i]));
        }
    }
}
