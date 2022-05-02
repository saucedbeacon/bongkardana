package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.SearchView;

public abstract class setSearchView<V, O> implements SearchView.SavedState<V, O> {
    public final List<setTitleMarginTop<V>> setMin;

    setSearchView(V v) {
        this(Collections.singletonList(new setTitleMarginTop(v)));
    }

    setSearchView(List<setTitleMarginTop<V>> list) {
        this.setMin = list;
    }

    public List<setTitleMarginTop<V>> setMin() {
        return this.setMin;
    }

    public boolean getMin() {
        return this.setMin.isEmpty() || (this.setMin.size() == 1 && this.setMin.get(0).getMax());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.setMin.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.setMin.toArray()));
        }
        return sb.toString();
    }
}
