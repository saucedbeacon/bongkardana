package o;

import com.facebook.litho.Transition;
import java.util.List;

public final class hasNestedScrollingParent extends smoothScrollTo {
    private final int setMin = 0;

    public <T extends Transition> hasNestedScrollingParent(List<T> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    public final AbsSavedState length(List<AbsSavedState> list) {
        return new TextViewCompat$AutoSizeTextType(this.setMin, list);
    }
}
