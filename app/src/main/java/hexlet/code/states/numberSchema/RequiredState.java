package hexlet.code.states.numberSchema;

import hexlet.code.states.State;

public final class RequiredState implements State {
    @Override
    public boolean isValid(Object obj) {
        return obj instanceof Integer;
    }
}
