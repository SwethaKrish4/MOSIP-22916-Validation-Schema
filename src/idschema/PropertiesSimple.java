package idschema;

import java.util.HashMap;
import java.util.Map;

public class PropertiesSimple {
    public Map<String,String> language;
    public Map<String,String> value;
    public PropertiesSimple(){

    }

    public PropertiesSimple(Map<String, String> language, Map<String, String> value) {
        this.language = new HashMap<String,String>(language);
        this.value = new HashMap<String,String>(value);
    }

    public Map<String, String> getLanguage() {
        return new HashMap<String,String>(language);
    }

    public Map<String, String> getValue() {
        return new HashMap<String,String>(value);
    }
}
