package com.click13.statemachine.rules;

import com.click13.statemachine.State;
import com.click13.statemachine.Transition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransitionStartRuleTest {
    @Test
    public void transitionStartTest01(){
        TransitionStartStateRule rule = new TransitionStartStateRule();

        Assertions.assertTrue(rule.process(new State("A"), new Transition[]{new Transition(new State("A"), "B", new State("C"))}));
    }

    @Test
    public void transitionStartTest02(){
        TransitionStartStateRule rule = new TransitionStartStateRule();

        Assertions.assertFalse(rule.process(new State("A"), new Transition[]{new Transition(new State("C"), "B", new State("D"))}));
    }
}
