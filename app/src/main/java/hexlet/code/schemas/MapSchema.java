package hexlet.code.schemas;

import hexlet.code.states.DefaultState;
import hexlet.code.states.mapSchema.RequiredState;
import hexlet.code.states.mapSchema.ShapeState;
import hexlet.code.states.mapSchema.SizeofState;

import java.util.Map;

public class MapSchema extends  BaseSchema{
    public MapSchema() {
        stateList.add(new DefaultState());
    }

    public BaseSchema required() {
        stateList.add(new RequiredState());
        return this;
    }

    public BaseSchema sizeof(int i) {
        stateList.add(new SizeofState(i));
        return this;
    }

    public BaseSchema shape(Map<String, BaseSchema> map) {
        stateList.add(new ShapeState(map));
        return this;
    }
}
