package hexlet.code.states.mapSchema;

import hexlet.code.states.State;

import java.util.Map;

public final class SizeofState implements State {
    private final int size;

    public SizeofState(int psize) {
        this.size = psize;
    }

    @Override
    public boolean isValid(Object obj) {
        if (obj instanceof Map map) {
            return map.size() == this.size;
        }
        return false;
    }
}
