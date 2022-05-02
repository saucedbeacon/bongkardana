package o;

import java.util.Map;

public class getSafeTokenComp {
    private final boolean isValid;
    private final Map<String, Object> properties;
    private final int sizeInBytes;

    public static getSafeTokenComp InvalidProperties() {
        return new getSafeTokenComp(false, (Map<String, Object>) null, 0);
    }

    public getSafeTokenComp(boolean z, Map<String, Object> map, int i) {
        this.isValid = z;
        this.properties = map;
        this.sizeInBytes = i;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public Map<String, Object> getProperties() {
        return this.properties;
    }

    public int getSizeInBytes() {
        return this.sizeInBytes;
    }
}
