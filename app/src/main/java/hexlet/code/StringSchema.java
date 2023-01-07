package hexlet.code;

import hexlet.code.States.Contains;
import hexlet.code.States.DefaultState;
import hexlet.code.States.RequiredState;
import hexlet.code.States.State;

public class StringSchema {
    private State state = new DefaultState();

    public StringSchema() {
    }
    public boolean isValid(Object obj) {
        return state.isValidForString(obj);
    }

    public void required() {
        this.state = new RequiredState();
    }
    public StringSchema contains(String str) {
        this.state = new Contains(str);
        return this;
    }
}
