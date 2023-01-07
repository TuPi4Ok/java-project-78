package hexlet.code.States.NumberSchema;

import hexlet.code.States.State;

public class RequiredState implements State {
    @Override
    public boolean isValid(Object obj) {
        return obj instanceof Integer;
    }
}
