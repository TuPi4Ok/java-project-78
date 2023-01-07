package hexlet.code.States.NumberSchema;

import hexlet.code.States.State;

public class RangeState implements State {
    int begin;
    int end;

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
