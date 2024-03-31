package com.click13.statemachine;

import com.click13.statemachine.exception.StateMachieneOperationNotAllowedException;
import lombok.Getter;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Diese Klasse ist die Repräsentation einer frei konfigurierbaren, deterministischen, endlichen Zustandsmachine
 */
public class Statemachine {
    @Getter
    private State state;
    private Transition[] transitions;

    protected Statemachine(State startstate, Transition[] transitions){
        this.state = startstate;
        this.transitions = transitions;
    }

    /**
     *
     * @param operation Name des auszuführenden Zustandswechsel
     * @throws StateMachieneOperationNotAllowedException wenn einen nicht erlabte oder unbekannte Operation/Zustandswechsel ausgeführt werden soll.
     */
    public void changeState(String operation) throws StateMachieneOperationNotAllowedException {
        if (getAvailableOperations().contains(operation)){
            for (int i = 0; i < transitions.length; i++) {
                if (transitions[i].getStartstate().equals(state) && transitions[i].getOperation().equals(operation)){
                    state = transitions[i].getEndstate();
                    return;
                }
            }
        }else {
            throw new StateMachieneOperationNotAllowedException();
        }
    }

    /**
     * @return unmodifizierbarte Liste mit allen erlabten Zustandswechseln, die die Zustandsmaschine im Zeitpunkt des Methodenaufrufs ausführen darf.
     */
    public List<String> getAvailableOperations(){
        List<String> out = new LinkedList<>();
        for (int i = 0; i < transitions.length; i++) {
            if (!out.contains(transitions[i].getOperation()) && transitions[i].getStartstate().equals(state)){
                out.add(transitions[i].getOperation());
            }
        }
        return Collections.unmodifiableList(out);
    }
}
