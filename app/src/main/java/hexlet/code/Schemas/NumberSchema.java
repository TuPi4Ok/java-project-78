package hexlet.code.Schemas;

import hexlet.code.States.DefaultState;
import hexlet.code.States.NumberSchema.PositiveState;
import hexlet.code.States.NumberSchema.RangeState;
import hexlet.code.States.NumberSchema.RequiredState;

public class NumberSchema extends BaseSchema{

    public NumberSchema() {
        stateList.add(new DefaultState());
    }

    public NumberSchema positive() {
        stateList.add(new PositiveState());
        return this;
    }
    public void required() {
        stateList.add(new RequiredState());
    }
    public void range(int begin, int end) {
        stateList.add(new RangeState(begin, end));
    }
}
