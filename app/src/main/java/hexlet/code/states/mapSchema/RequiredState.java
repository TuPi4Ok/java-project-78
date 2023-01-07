package hexlet.code.states.mapSchema;

import hexlet.code.states.State;

import java.util.Map;

public class RequiredState implements State {
    @Override
    public boolean isValid(Object obj) {
        return obj instanceof Map;
    }
}
