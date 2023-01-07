package hexlet.code.schemas;

import hexlet.code.states.State;

import java.util.ArrayList;
import java.util.List;

public class BaseSchema {
    protected List<State> stateList = new ArrayList<>();

    public boolean isValid(Object obj) {
        boolean result = true;
        for (State state : stateList) {
            result = result && state.isValid(obj);
        }
        return result;
    }
}
