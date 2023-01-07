package hexlet.code.States;

public class RequiredState implements State {
    @Override
    public boolean isValidForString(Object obj) {
        if (obj instanceof String str) {
            return str.length() > 0;
        }
        return false;
    }
}
