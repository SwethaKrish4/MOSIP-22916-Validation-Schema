package idschema;

import java.util.*;

public class Iden {
    public boolean additionalProperties;
    public String type;
    public List<String> required;
    public Map<String,Map<String,Object>> properties;
    public Iden(){

    }

    public boolean isAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(boolean additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(List<String> required) {
        this.required = required;
    }

    public Map<String, Map<String,Object>> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Map<String,Object>> properties) {
        this.properties = properties;
    }
}
