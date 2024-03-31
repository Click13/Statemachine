package com.click13.statemachine;

import com.click13.statemachine.exception.StateMachieneOperationNotAllowedException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StatemachineTest {
    private Statemachine getTestMachine(){
        return new Statemachine(new State("A"), new Transition[]{new Transition(new State("A"), "O1", new State("B")), new Transition(new State("B"), "O2", new State("C"))});
    }

    @Test
    public void getAvailableOperationsTest01(){
        Statemachine machine = getTestMachine();

        List<String> transitions = machine.getAvailableOperations();
        Assertions.assertNotNull(transitions);
        Assertions.assertTrue(transitions.size() == 1);
    }

    @Test
    public void getAvailableOperationsTest02(){
        Statemachine machine = getTestMachine();

        List<String> transitions = machine.getAvailableOperations();

        try{
            transitions.add("Test");
            Assertions.fail();
        }catch (UnsupportedOperationException e){
            Assertions.assertTrue(true);
        }

        try{
            transitions.remove(0);
            Assertions.fail();
        }catch (UnsupportedOperationException e){
            Assertions.assertTrue(true);
        }
    }

    @Test
    public void changeStateTest01(){
        Statemachine machine = getTestMachine();
        Assertions.assertEquals(new State("A"), machine.getState());

        try {
            machine.changeState("O1");
            Assertions.assertEquals(new State("B"), machine.getState());
        }catch (StateMachieneOperationNotAllowedException exception){
            Assertions.fail();
        }

        try {
            machine.changeState("O1");
            Assertions.assertTrue(false);
        }catch (StateMachieneOperationNotAllowedException exception){
            Assertions.assertTrue(true);
        }
    }
}