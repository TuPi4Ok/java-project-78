package hexlet.code.States.MapSchema;

import hexlet.code.States.State;

import java.util.Map;

public class SizeofState implements State {
    int size;

    public SizeofState(int size) {
        this.size = size;
    }

    @Override
    public boolean isValid(Object obj) {
        if(obj instanceof Map map) {
            return map.size() == this.size;
        }
        return false;
    }
}
