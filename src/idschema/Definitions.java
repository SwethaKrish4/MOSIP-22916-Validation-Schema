package idschema;

public class Definitions {
    public SimpleTypeObj simpleType;
    public DocumentTypeObj documentType;
    public BiometricsType biometricsType;
    public Definitions(){

    }

    public Definitions(SimpleTypeObj simpleType, DocumentTypeObj documentType, BiometricsType biometricsType) {
        this.simpleType = simpleType;
        this.documentType = documentType;
        this.biometricsType = biometricsType;
    }

    public SimpleTypeObj getSimpleType() {
        return simpleType;
    }

    public DocumentTypeObj getDocumentType() {
        return documentType;
    }

    public BiometricsType getBiometricsType() {
        return biometricsType;
    }
}
