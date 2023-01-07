package hexlet.code.states.stringSchema;

import hexlet.code.states.State;

public final class RequiredState implements State {
    @Override
    public boolean isValid(Object obj) {
        if (obj instanceof String str) {
            return str.length() > 0;
        }
        return false;
    }
}
