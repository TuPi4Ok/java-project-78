package hexlet.code.states.numberSchema;

import hexlet.code.states.State;

public class RangeState implements State {
    private final int begin;
    private final int end;

    public RangeState(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public boolean isValid(Object obj) {
        if (obj instanceof Integer i) {
            return i >= this.begin && i <= this.end;
        }
        return false;
    }
}
