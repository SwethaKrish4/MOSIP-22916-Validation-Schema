package idschema;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PropertiesDoc {
    public Map<String, List> refNumber;
    public Map<String,String> format;
    public Map<String,String> type;
    public Map<String,String> value;
    public PropertiesDoc(){

    }

    public PropertiesDoc(Map<String, List> refNumber, Map<String, String> format, Map<String, String> type, Map<String, String> value) {
        this.refNumber = new HashMap<String,List>(refNumber);
        this.format = new HashMap<String,String>(format);
        this.type = new HashMap<String,String>(type);
        this.value = new HashMap<String,String>(value);
    }

    public Map<String, List> getRefNumber() {
        return new HashMap<String,List>(refNumber);
    }

    public Map<String, String> getFormat() {
        return new HashMap<String,String>(format);
    }

    public Map<String, String> getType() {
        return new HashMap<String,String>(type);
    }

    public Map<String, String> getValue() {
        return new HashMap<String,String>(value);
    }
}
