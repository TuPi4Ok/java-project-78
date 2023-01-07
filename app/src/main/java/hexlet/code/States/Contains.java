package hexlet.code.States;

public class Contains implements State {
    String containsStr;

    public Contains(String containsStr) {
        this.containsStr = containsStr;
    }

    @Override
    public boolean isValidForString(Object obj) {
        if (obj instanceof String str) {
            return str.contains(this.containsStr);
        }
        return false;
    }
}
