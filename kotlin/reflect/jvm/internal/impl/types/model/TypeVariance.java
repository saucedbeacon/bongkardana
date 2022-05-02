package kotlin.reflect.jvm.internal.impl.types.model;

import id.dana.richview.CurrencyTextView;
import org.jetbrains.annotations.NotNull;

public enum TypeVariance {
    IN(CurrencyTextView.DEFAULT_LANGUAGE_CODE),
    OUT("out"),
    INV("");
    
    @NotNull
    private final String presentation;

    private TypeVariance(String str) {
        this.presentation = str;
    }

    @NotNull
    public final String toString() {
        return this.presentation;
    }
}
