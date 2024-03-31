package com.click13.statemachine.rules;

import com.click13.statemachine.State;
import com.click13.statemachine.Transition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotNullRuleTest {

    @Test
    public void processNotNullTest01(){
        NotNullRule nullRule = new NotNullRule();

        Assertions.assertTrue(nullRule.process(null, new Transition[1]));
    }

    @Test
    public void processNotNullTest02(){
        NotNullRule nullRule = new NotNullRule();

        Assertions.assertTrue(nullRule.process(new State(""), null));
    }

    @Test
    public void processNotNullTest03(){
        NotNullRule nullRule = new NotNullRule();

        Assertions.assertTrue(nullRule.process(null, null));
    }
}