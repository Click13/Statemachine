package com.click13.statemachine.rules;

import com.click13.statemachine.State;
import com.click13.statemachine.Transition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NoNullStatesInTransitionRuleTest {

    @Test
    public void noNullStatesInTransitionTest01(){
        NoNullStatesInTransitionsRule rule = new NoNullStatesInTransitionsRule();

        Assertions.assertTrue(rule.process(null, new Transition[]{new Transition(new State(""), "A", new State("B"))}));
    }

    @Test
    public void noNullStatesInTransitionTest02(){
        NoNullStatesInTransitionsRule rule = new NoNullStatesInTransitionsRule();

        Assertions.assertFalse(rule.process(null, new Transition[]{new Transition(null, "A", new State("B"))}));
    }

    @Test
    public void noNullStatesInTransitionTest03(){
        NoNullStatesInTransitionsRule rule = new NoNullStatesInTransitionsRule();

        Assertions.assertFalse(rule.process(null, new Transition[]{new Transition(new State("V"), "A", null)}));
    }

    @Test
    public void noNullStatesInTransitionTest04(){
        NoNullStatesInTransitionsRule rule = new NoNullStatesInTransitionsRule();

        Assertions.assertFalse(rule.process(null, new Transition[]{new Transition(null, "A", null)}));
    }
}
