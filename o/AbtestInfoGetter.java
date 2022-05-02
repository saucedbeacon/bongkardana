package o;

import java.util.ArrayList;

public final class AbtestInfoGetter<T> {
    public ArrayList<T> setMax;

    public AbtestInfoGetter(int i) {
        this.setMax = new ArrayList<>(i);
    }

    public final boolean length() {
        return this.setMax.isEmpty();
    }
}
