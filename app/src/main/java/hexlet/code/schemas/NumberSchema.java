package hexlet.code.schemas;

import hexlet.code.states.DefaultState;
import hexlet.code.states.numberSchema.PositiveState;
import hexlet.code.states.numberSchema.RangeState;
import hexlet.code.states.numberSchema.RequiredState;

public class NumberSchema extends BaseSchema {

    public NumberSchema() {
        stateList.add(new DefaultState());
    }

    /**
     * @return
     */
    public NumberSchema positive() {
        stateList.add(new PositiveState());
        return this;
    }

    /**
     * @return
     */
    public NumberSchema required() {
        stateList.add(new RequiredState());
        return this;
    }

    /**
     * @param begin
     * @param end
     * @return
     */
    public NumberSchema range(int begin, int end) {
        stateList.add(new RangeState(begin, end));
        return this;
    }
}
