package uispec;

import java.util.List;
import java.util.Map;

public class IdentityUi {
    public List<Map> identity;
    public List<String>locationHierarchy;
    public IdentityUi(){

    }

    public List<Map> getIdentity() {
        return identity;
    }

    public void setIdentity(List<Map> identity) {
        this.identity = identity;
    }

    public List<String> getLocationHierarchy() {
        return locationHierarchy;
    }

    public void setLocationHierarchy(List<String> locationHierarchy) {
        this.locationHierarchy = locationHierarchy;
    }
}
