package hexlet.code.States;

import hexlet.code.States.State;

public class DefaultState implements State {
    @Override
    public boolean isValid(Object obj) {
        return true;
    }
}
