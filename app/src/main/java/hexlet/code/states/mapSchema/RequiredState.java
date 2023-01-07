package hexlet.code.states.mapSchema;

import hexlet.code.states.State;

import java.util.Map;

public final class RequiredState implements State {
    @Override
    public boolean isValid(Object obj) {
        return obj instanceof Map;
    }
}
