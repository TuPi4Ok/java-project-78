package hexlet.code.Schemas;

import hexlet.code.States.State;

import java.util.ArrayList;
import java.util.List;

public class BaseSchema {
    protected List<State> stateList = new ArrayList<>();
    public boolean isValid(Object obj) {
        boolean result = true;
        for(State state : stateList)
        {
            result = result && state.isValid(obj);
        }
        return result;
    }

}
