package hexlet.code.states;

public final class DefaultState implements State {
    @Override
    public boolean isValid(Object obj) {
        return true;
    }
}
