package idschema;

import java.util.*;

public class BiometricsType {
   public boolean additionalProperties;
   public String type;
   public PropertiesBio properties;
   public BiometricsType(){

   }

    public BiometricsType(boolean additionalProperties, String type, PropertiesBio properties) {
        this.additionalProperties = additionalProperties;
        this.type = type;
        this.properties=properties;
    }

    public boolean isAdditionalProperties() {
        return additionalProperties;
    }

    public String getType() {
        return type;
    }

    public PropertiesBio getProperties() {
        return properties;
    }
}
