package idmapping;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IdentityMapping {
    public Map<String,Map<String,String>> identity;
    public Map<String,String> metaInfo;
    public Map<String,String>audits;
    public Map<String,Map<String,String>> documents;
    public IdentityMapping(){

    }

    public IdentityMapping(Map<String,Map<String,String>>  identity, Map<String, String> metaInfo, Map<String, String> audits, Map<String,Map<String,String>> documents) {
        this.identity = identity;
        this.metaInfo = new HashMap<String,String>(metaInfo);
        this.audits = new HashMap<String,String>(audits);
        this.documents = documents;
    }

    public Map<String,Map<String,String>>  getIdentity() {
        return identity;
    }
    public Map<String, String> getMetaInfo() {
        return new HashMap<String,String>(metaInfo);
    }

    public Map<String, String> getAudits() {
        return new HashMap<String,String>(audits);
    }

    public Map<String,Map<String,String>> getDocuments() {
        return documents;
    }
}
