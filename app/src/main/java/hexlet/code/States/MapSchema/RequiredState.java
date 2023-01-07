package hexlet.code.States.MapSchema;

import hexlet.code.States.State;

import java.util.Map;

public class RequiredState implements State {
    @Override
    public boolean isValid(Object obj) {
        return obj instanceof Map;
    }
}
