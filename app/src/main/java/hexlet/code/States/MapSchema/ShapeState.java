package hexlet.code.States.MapSchema;

import hexlet.code.Schemas.BaseSchema;
import hexlet.code.States.State;

import java.util.Map;

public class ShapeState implements State {
    Map<String, BaseSchema> map;

    public ShapeState(Map<String, BaseSchema> map) {
        this.map = map;
    }

    @Override
    public boolean isValid(Object obj) {
        boolean result = true;
        if(obj instanceof Map map1){
            for(Map.Entry<String, BaseSchema> item : map.entrySet()) {
                Object value = map1.get(item.getKey());
                BaseSchema validator = item.getValue();
                result = result && validator.isValid(value);
            }
        }
        else {
            return false;
        }
        return result;
    }
}
