package com.click13.statemachine.rules;

import com.click13.statemachine.State;
import com.click13.statemachine.Transition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeterministischeRegelTest {

    @Test
    public void DeterministischeRegelTest01() {
        Assertions.assertFalse(new DeterministischeRegel().process(new State("A"), new Transition[]{new Transition(new State("A"), "O1", new State("B")), new Transition(new State("A"), "O1", new State("C"))}));
    }

    @Test
    public void DeterministischeRegelTest02() {
        Assertions.assertTrue(new DeterministischeRegel().process(new State("A"), new Transition[]{new Transition(new State("A"), "O1", new State("B")), new Transition(new State("A"), "O2", new State("C"))}));
    }
}