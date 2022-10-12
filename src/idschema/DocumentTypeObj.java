package idschema;

import java.util.*;

public class DocumentTypeObj {
    public boolean additionalProperties;
    public String type;
    public List<String>required;
    public PropertiesDoc properties;
    public DocumentTypeObj(){

    }

    public DocumentTypeObj(boolean additionalProperties, String type, List<String> required, PropertiesDoc properties) {
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
        return new ArrayList<String>(required);
    }

    public PropertiesDoc getProperties() {
        return properties;
    }
}
