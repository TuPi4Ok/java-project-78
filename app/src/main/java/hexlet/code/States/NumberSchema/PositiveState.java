package hexlet.code.States.NumberSchema;

import hexlet.code.States.State;

public class PositiveState implements State {
    @Override
    public boolean isValid(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof Integer i) {
            return i > 0;
        }
        return false;
    }
}
