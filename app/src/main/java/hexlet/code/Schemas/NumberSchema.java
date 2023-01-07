package hexlet.code.Schemas;

import hexlet.code.States.DefaultState;
import hexlet.code.States.NumberSchema.PositiveState;
import hexlet.code.States.NumberSchema.RangeState;
import hexlet.code.States.NumberSchema.RequiredState;

public class NumberSchema extends BaseSchema{

    public NumberSchema() {
        stateList.add(new DefaultState());
    }

    public BaseSchema positive() {
        stateList.add(new PositiveState());
        return this;
    }
    public BaseSchema required() {
        stateList.add(new RequiredState());
        return this;
    }
    public BaseSchema range(int begin, int end) {
        stateList.add(new RangeState(begin, end));
        return this;
    }
}
