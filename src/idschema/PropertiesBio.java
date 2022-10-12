package idschema;

import java.util.HashMap;
import java.util.Map;

public class PropertiesBio {
    public Map<String,String> format;
    public Map version;
    public Map<String,String> value;
    public PropertiesBio(){

    }

    public PropertiesBio(Map<String, String> format, Map version, Map<String, String> value) {
        this.format = new HashMap<String,String>(format);
        this.version = new HashMap<>(version);
        this.value = new HashMap<String,String>(value);
    }

    public Map<String, String> getFormat() {
        return new HashMap<String,String>(format);
    }

    public Map<String, String> getVersion() {
        return new HashMap<>(version);
    }

    public Map<String, String> getValue() {
        return new HashMap<String,String>(value);
    }
}
