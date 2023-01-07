package hexlet.code.states.stringSchema;

import hexlet.code.states.State;

public final class MinLength implements State {
    private final int length;

    public MinLength(int plength) {
        this.length = plength;
    }

    @Override
    public boolean isValid(Object obj) {
        if (obj instanceof String str) {
            return str.length() >= length;
        }
        return false;
    }
}
