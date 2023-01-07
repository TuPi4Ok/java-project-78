package hexlet.code.states.stringSchema;

import hexlet.code.states.State;

public final class ContainsState implements State {
    private final String containsStr;

    public ContainsState(String pcontainsStr) {
        this.containsStr = pcontainsStr;
    }

    @Override
    public boolean isValid(Object obj) {
        if (obj instanceof String str) {
            return str.contains(this.containsStr);
        }
        return false;
    }
}
