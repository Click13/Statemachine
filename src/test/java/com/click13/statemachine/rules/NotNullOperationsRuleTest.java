package com.click13.statemachine.rules;

import com.click13.statemachine.Transition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotNullOperationsRuleTest {
    @Test
    public void notNullOpersationsTest01(){
        NotNullOperationsRule rule = new NotNullOperationsRule();

        Assertions.assertTrue(rule.process(null, new Transition[]{new Transition(null, "A", null)}));
    }

    @Test
    public void notNullOpersationsTest02(){
        NotNullOperationsRule rule = new NotNullOperationsRule();

        Assertions.assertFalse(rule.process(null, new Transition[]{new Transition(null, null, null)}));
    }
}
