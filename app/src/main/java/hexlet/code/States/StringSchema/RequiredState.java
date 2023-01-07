package hexlet.code.States.StringSchema;

import hexlet.code.States.State;

public class RequiredState implements State {
    @Override
    public boolean isValid(Object obj) {
        if (obj instanceof String str) {
            return str.length() > 0;
        }
        return false;
    }
}
