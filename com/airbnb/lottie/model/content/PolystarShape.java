package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import o.SearchView;
import o.animateToTab;
import o.getSuggestionRowLayout;
import o.isLandscapeMode;
import o.onKeyPreIme;
import o.onTextFocusChanged;

public final class PolystarShape implements isLandscapeMode {
    private final boolean IsOverlapping;
    public final onTextFocusChanged equals;
    public final String getMax;
    public final onTextFocusChanged getMin;
    public final onTextFocusChanged isInside;
    public final SearchView.SavedState<PointF, PointF> length;
    public final onTextFocusChanged setMax;
    public final Type setMin;
    public final onTextFocusChanged toFloatRange;
    public final onTextFocusChanged toIntRange;

    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, onTextFocusChanged ontextfocuschanged, SearchView.SavedState<PointF, PointF> savedState, onTextFocusChanged ontextfocuschanged2, onTextFocusChanged ontextfocuschanged3, onTextFocusChanged ontextfocuschanged4, onTextFocusChanged ontextfocuschanged5, onTextFocusChanged ontextfocuschanged6, boolean z) {
        this.getMax = str;
        this.setMin = type;
        this.getMin = ontextfocuschanged;
        this.length = savedState;
        this.setMax = ontextfocuschanged2;
        this.toFloatRange = ontextfocuschanged3;
        this.toIntRange = ontextfocuschanged4;
        this.isInside = ontextfocuschanged5;
        this.equals = ontextfocuschanged6;
        this.IsOverlapping = z;
    }

    public final boolean length() {
        return this.IsOverlapping;
    }

    public final animateToTab length(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime) {
        return new getSuggestionRowLayout(lottieDrawable, onkeypreime, this);
    }
}
