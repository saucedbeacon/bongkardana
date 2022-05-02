package o;

import io.split.android.client.Evaluator;
import java.util.Map;
import java.util.Set;

public final class createTranslucentStatusBarView implements transparentStatusBar {
    private String getMin;
    private Set<String> setMin;

    public createTranslucentStatusBarView(Set<String> set, String str) {
        this.setMin = set;
        this.getMin = str;
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        return this.setMin.contains(this.getMin);
    }
}
