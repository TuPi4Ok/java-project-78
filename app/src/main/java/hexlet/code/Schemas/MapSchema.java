package hexlet.code.Schemas;

import hexlet.code.States.DefaultState;
import hexlet.code.States.MapSchema.RequiredState;
import hexlet.code.States.MapSchema.SizeofState;

public class MapSchema extends  BaseSchema{
    public MapSchema() {
        stateList.add(new DefaultState());
    }

    public void required() {
        stateList.add(new RequiredState());
    }

    public void sizeof(int i) {
        stateList.add(new SizeofState(i));
    }
}
