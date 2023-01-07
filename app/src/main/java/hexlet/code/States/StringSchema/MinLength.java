package hexlet.code.States.StringSchema;

import hexlet.code.States.State;

public class MinLength implements State {
    int length;

    public MinLength(int length) {
        this.length = length;
    }

    @Override
    public boolean isValid(Object obj) {
        if (obj instanceof String str) {
            return str.length() >= length;
        }
        return false;
    }
}
