package o;

import java.util.LinkedHashSet;
import java.util.Set;

public final class grantReadPermission {
    private final Set<access$201> getMin = new LinkedHashSet();

    public final synchronized void length(access$201 access_201) {
        this.getMin.add(access_201);
    }

    public final synchronized void setMin(access$201 access_201) {
        this.getMin.remove(access_201);
    }

    public final synchronized boolean getMax(access$201 access_201) {
        return this.getMin.contains(access_201);
    }
}
