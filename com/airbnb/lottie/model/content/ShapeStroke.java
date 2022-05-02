package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.List;
import o.animateToTab;
import o.isLandscapeMode;
import o.onCloseClicked;
import o.onKeyPreIme;
import o.onQueryRefine;
import o.onTextFocusChanged;
import o.requestFocus;

public final class ShapeStroke implements isLandscapeMode {
    public final LineJoinType IsOverlapping;
    public final float equals;
    public final onCloseClicked getMax;
    public final String getMin;
    public final onTextFocusChanged isInside;
    @Nullable
    public final onTextFocusChanged length;
    public final List<onTextFocusChanged> setMax;
    public final onQueryRefine setMin;
    private final boolean toFloatRange;
    public final LineCapType toIntRange;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public final Paint.Cap toPaintCap() {
            int i = AnonymousClass1.setMin[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getMax;
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType[] r0 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                r1 = 1
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r2 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.BEVEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r3 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.MITER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r4 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType[] r3 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                setMin = r3
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r4 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.BUTT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = setMin     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r3 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.ROUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x004d }
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r1 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.content.ShapeStroke.AnonymousClass1.<clinit>():void");
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public final Paint.Join toPaintJoin() {
            int i = AnonymousClass1.getMax[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public ShapeStroke(String str, @Nullable onTextFocusChanged ontextfocuschanged, List<onTextFocusChanged> list, onQueryRefine onqueryrefine, onCloseClicked oncloseclicked, onTextFocusChanged ontextfocuschanged2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.getMin = str;
        this.length = ontextfocuschanged;
        this.setMax = list;
        this.setMin = onqueryrefine;
        this.getMax = oncloseclicked;
        this.isInside = ontextfocuschanged2;
        this.toIntRange = lineCapType;
        this.IsOverlapping = lineJoinType;
        this.equals = f;
        this.toFloatRange = z;
    }

    public final animateToTab length(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime) {
        return new requestFocus(lottieDrawable, onkeypreime, this);
    }

    public final boolean getMin() {
        return this.toFloatRange;
    }
}
