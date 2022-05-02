package kotlin.reflect.jvm.internal.impl.types;

import id.dana.richview.CurrencyTextView;
import org.jetbrains.annotations.NotNull;

public enum Variance {
    INVARIANT("", true, true, 0),
    IN_VARIANCE(CurrencyTextView.DEFAULT_LANGUAGE_CODE, true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    @NotNull
    private final String label;
    private final int superpositionFactor;

    private Variance(String str, boolean z, boolean z2, int i) {
        this.label = str;
        this.allowsInPosition = z;
        this.allowsOutPosition = z2;
        this.superpositionFactor = i;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    @NotNull
    public final String toString() {
        return this.label;
    }
}
