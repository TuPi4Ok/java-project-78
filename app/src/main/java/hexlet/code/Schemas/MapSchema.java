package hexlet.code.Schemas;

import hexlet.code.States.DefaultState;
import hexlet.code.States.MapSchema.RequiredState;
import hexlet.code.States.MapSchema.ShapeState;
import hexlet.code.States.MapSchema.SizeofState;

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
