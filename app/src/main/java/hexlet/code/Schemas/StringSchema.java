package hexlet.code.Schemas;

import hexlet.code.States.DefaultState;
import hexlet.code.States.StringSchema.ContainsState;
import hexlet.code.States.StringSchema.MinLength;
import hexlet.code.States.StringSchema.RequiredState;

public class StringSchema extends BaseSchema {
    public StringSchema() {
        stateList.add(new DefaultState());
    }

    public void required() {
        stateList.add(new RequiredState());
    }
    public StringSchema contains(String str) {
        stateList.add(new ContainsState(str));
        return this;
    }

    public void minLength(int length) {
        stateList.add(new MinLength(length));
    }
}
