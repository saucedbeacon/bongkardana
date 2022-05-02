package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import o.animateToTab;
import o.getImeOptions;
import o.isLandscapeMode;
import o.onKeyPreIme;
import o.onTextFocusChanged;

public final class ShapeTrimPath implements isLandscapeMode {
    private final boolean equals;
    public final onTextFocusChanged getMax;
    public final onTextFocusChanged getMin;
    public final Type length;
    public final onTextFocusChanged setMax;
    public final String setMin;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public ShapeTrimPath(String str, Type type, onTextFocusChanged ontextfocuschanged, onTextFocusChanged ontextfocuschanged2, onTextFocusChanged ontextfocuschanged3, boolean z) {
        this.setMin = str;
        this.length = type;
        this.getMin = ontextfocuschanged;
        this.setMax = ontextfocuschanged2;
        this.getMax = ontextfocuschanged3;
        this.equals = z;
    }

    public final boolean getMax() {
        return this.equals;
    }

    public final animateToTab length(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime) {
        return new getImeOptions(onkeypreime, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trim Path: {start: ");
        sb.append(this.getMin);
        sb.append(", end: ");
        sb.append(this.setMax);
        sb.append(", offset: ");
        sb.append(this.getMax);
        sb.append("}");
        return sb.toString();
    }
}
