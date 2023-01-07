package hexlet.code.Schemas;

import hexlet.code.States.DefaultState;
import hexlet.code.States.StringSchema.ContainsState;
import hexlet.code.States.StringSchema.MinLength;
import hexlet.code.States.StringSchema.RequiredState;

public class StringSchema extends BaseSchema {
    public StringSchema() {
        stateList.add(new DefaultState());
    }

    public BaseSchema required() {
        stateList.add(new RequiredState());
        return this;
    }
    public BaseSchema contains(String str) {
        stateList.add(new ContainsState(str));
        return this;
    }

    public BaseSchema minLength(int length) {
        stateList.add(new MinLength(length));
        return this;
    }
}
