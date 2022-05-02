package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import o.animateToTab;
import o.getSuggestionCommitIconResId;
import o.isLandscapeMode;
import o.onKeyPreIme;
import o.setTitleMargin;

public final class MergePaths implements isLandscapeMode {
    private final boolean getMax;
    public final MergePathsMode length;
    public final String setMax;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.setMax = str;
        this.length = mergePathsMode;
        this.getMax = z;
    }

    public final boolean getMin() {
        return this.getMax;
    }

    @Nullable
    public final animateToTab length(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime) {
        if (lottieDrawable.length()) {
            return new getSuggestionCommitIconResId(this);
        }
        setTitleMargin.setMax("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        sb.append(this.length);
        sb.append('}');
        return sb.toString();
    }
}
