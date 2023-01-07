package hexlet.code.states.numberSchema;

import hexlet.code.states.State;

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
