package idschema;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Items {
    public boolean additionalProperties;
    public String type;
    public List<String> required;
    public PropertiesSimple properties;
    public Items(){

    }

    public Items(boolean additionalProperties, String type, List<String> required, PropertiesSimple properties) {
        this.additionalProperties = additionalProperties;
        this.type = type;
        this.required = new ArrayList<String>(required);
        this.properties = properties;
    }

    public boolean isAdditionalProperties() {
        return additionalProperties;
    }

    public String getType() {
        return type;
    }

    public List<String> getRequired() {
        return new ArrayList<>(required);
    }

    public PropertiesSimple getProperties() {
        return properties;
    }
}
