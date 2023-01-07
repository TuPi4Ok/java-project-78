package hexlet.code.states.stringSchema;

import hexlet.code.states.State;

public class ContainsState implements State {
    private final String containsStr;

    public ContainsState(String containsStr) {
        this.containsStr = containsStr;
    }

    @Override
    public boolean isValid(Object obj) {
        if (obj instanceof String str) {
            return str.contains(this.containsStr);
        }
        return false;
    }
}
