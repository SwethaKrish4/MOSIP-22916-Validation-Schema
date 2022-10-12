package idschema;

public class IdentitySchema {
    public String $schema;
    public String description;
    public boolean additionalProperties;
    public String title;
    public String type;
    public Definitions definitions;
    public PropertiesObj properties;
    public IdentitySchema(){

    }

    public IdentitySchema(String $schema, String description, boolean additionalProperties, String title, String type, Definitions definitions, PropertiesObj properties) {
        this.$schema = $schema;
        this.description = description;
        this.additionalProperties = additionalProperties;
        this.title = title;
        this.type = type;
        this.definitions = definitions;
        this.properties = properties;
    }

    public String get$schema() {
        return $schema;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAdditionalProperties() {
        return additionalProperties;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public Definitions getDefinitions() {
        return definitions;
    }

    public PropertiesObj getPropertiesObj() {
        return properties;
    }
}
