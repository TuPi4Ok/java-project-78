package hexlet.code.schemas;

import hexlet.code.states.DefaultState;
import hexlet.code.states.stringSchema.ContainsState;
import hexlet.code.states.stringSchema.MinLength;
import hexlet.code.states.stringSchema.RequiredState;

public class StringSchema extends BaseSchema {
    public StringSchema() {
        stateList.add(new DefaultState());
    }

    /**
     * @return
     */
    public StringSchema required() {
        stateList.add(new RequiredState());
        return this;
    }

    /**
     * @param str
     * @return
     */
    public StringSchema contains(String str) {
        stateList.add(new ContainsState(str));
        return this;
    }

    /**
     * @param length
     * @return
     */
    public StringSchema minLength(int length) {
        stateList.add(new MinLength(length));
        return this;
    }
}
