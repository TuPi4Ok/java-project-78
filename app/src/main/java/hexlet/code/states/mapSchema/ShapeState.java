package hexlet.code.states.mapSchema;

import hexlet.code.schemas.BaseSchema;
import hexlet.code.states.State;

import java.util.HashMap;
import java.util.Map;

public final class ShapeState implements State {
    private final Map<String, BaseSchema> map = new HashMap<>();

    public ShapeState(Map<String, BaseSchema> pmap) {
        this.map.putAll(pmap);
    }

    @Override
    public boolean isValid(Object obj) {
        boolean result = true;
        if (obj instanceof Map map1) {
            for (Map.Entry<String, BaseSchema> item : map.entrySet()) {
                Object value = map1.get(item.getKey());
                BaseSchema validator = item.getValue();
                result = result && validator.isValid(value);
            }
        } else {
            return false;
        }
        return result;
    }
}
