package hexlet.code.states.numberSchema;

import hexlet.code.states.State;

public final class RangeState implements State {
    private final int begin;
    private final int end;

    public RangeState(int pbegin, int pend) {
        this.begin = pbegin;
        this.end = pend;
    }

    @Override
    public boolean isValid(Object obj) {
        if (obj instanceof Integer i) {
            return i >= this.begin && i <= this.end;
        }
        return false;
    }
}
