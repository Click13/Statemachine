package com.click13.statemachine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    public void equalsTest01(){
        State s = new State("A");
        State a = new State("A");

        Assertions.assertTrue(s.equals(a));
    }

    @Test
    public void equalsTest02(){
        State s = new State("A");
        State a = new State("B");

        Assertions.assertFalse(s.equals(a));
    }

    @Test
    public void equalsTest03(){
        State s = new State("A");
        Assertions.assertTrue(s.equals(s));
    }

    @Test
    public void hashCodeTest01(){
        State s = new State("A");
        State a = new State("A");

        Assertions.assertTrue(a.hashCode() == s.hashCode());
    }

    @Test
    public void hashCodeTest02(){
        State s = new State("A");
        State a = new State("B");

        Assertions.assertFalse(a.hashCode() == s.hashCode());
    }

    @Test
    public void hashCodeTest03(){
        State s = new State("A");

        Assertions.assertTrue(s.hashCode() == s.hashCode());
    }

    @Test
    public void ConstructorTest01(){
        State s = new State("A");

        Assertions.assertFalse(s.isEndState());
        Assertions.assertEquals("A", s.getName());
    }

    @Test
    public void ConstructorTest02(){
        State s = new State("A", false);

        Assertions.assertFalse(s.isEndState());
        Assertions.assertEquals("A", s.getName());
    }

    @Test
    public void ConstructorTest03(){
        State s = new State("A", true);

        Assertions.assertTrue(s.isEndState());
        Assertions.assertEquals("A", s.getName());
    }
}