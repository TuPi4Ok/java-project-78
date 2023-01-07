package hexlet.code.States.StringSchema;

import hexlet.code.States.State;

public class ContainsState implements State {
    String containsStr;

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
