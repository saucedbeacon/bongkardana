package com.facebook.litho;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import javax.annotation.Nullable;
import o.AbsSavedState;
import o.NestedScrollView;
import o.computeScroll;
import o.describeContents;
import o.dispatchHoverEvent;
import o.getAccessibilityFocusedVirtualViewId;
import o.getSuperState;
import o.obtainAccessibilityNodeInfo;
import o.pageScroll;
import o.requestChildFocus;
import o.writeToParcel;

public abstract class Transition {
    static final TransitionKeyType getMax = TransitionKeyType.LOCAL;
    public static final toFloatRange getMin = new equals(obtainAccessibilityNodeInfo.setMin);
    public static final toFloatRange length = new equals(obtainAccessibilityNodeInfo.getMin);
    private static final Interpolator setMax = new AccelerateDecelerateInterpolator();
    /* access modifiers changed from: private */
    public static final toFloatRange setMin = length;

    public static class getMin {
        public isInside getMin;
        public boolean setMax;
    }

    public enum ComponentTargetType {
        ALL,
        LOCAL_KEY,
        LOCAL_KEY_SET,
        GLOBAL_KEY,
        GLOBAL_KEY_SET,
        AUTO_LAYOUT
    }

    public enum PropertyTargetType {
        SET,
        SINGLE,
        AUTO_LAYOUT
    }

    public enum TransitionKeyType {
        GLOBAL,
        LOCAL
    }

    public static class length {
        public final Object length;
        public final PropertyTargetType setMin;
    }

    public static class setMin {
        public final Object getMin;
        public final ComponentTargetType setMax;
    }

    public interface toFloatRange {
        getAccessibilityFocusedVirtualViewId length(describeContents describecontents);
    }

    public static class setMax {
        public final setMin getMin;
        public final length length;

        setMax(setMin setmin, length length2) {
            this.getMin = setmin;
            this.length = length2;
        }
    }

    public static class isInside extends Transition {
        public final AbsSavedState.AnonymousClass1 IsOverlapping;
        public final AbsSavedState.AnonymousClass1 equals;
        @Nullable
        public String isInside;
        public final toFloatRange setMax;
        public final setMax setMin;
        @Nullable
        public final String toFloatRange;

        isInside(setMax setmax, toFloatRange tofloatrange, AbsSavedState.AnonymousClass1 r3, AbsSavedState.AnonymousClass1 r4, @Nullable String str) {
            this.setMin = setmax;
            this.setMax = tofloatrange;
            this.equals = r3;
            this.IsOverlapping = r4;
            this.toFloatRange = str;
        }

        public final boolean setMin() {
            return this.equals != null;
        }

        public final boolean length() {
            return this.IsOverlapping != null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
            return r4.setMin.equals(r3.setMin.getMin.getMin);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
            return com.facebook.litho.Transition.setMin((java.lang.String[]) r3.setMin.getMin.getMin, r4.setMin);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean length(o.pageScroll r4) {
            /*
                r3 = this;
                int[] r0 = com.facebook.litho.Transition.AnonymousClass1.setMin
                com.facebook.litho.Transition$setMax r1 = r3.setMin
                com.facebook.litho.Transition$setMin r1 = r1.getMin
                com.facebook.litho.Transition$ComponentTargetType r1 = r1.setMax
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 0
                switch(r0) {
                    case 1: goto L_0x005e;
                    case 2: goto L_0x005e;
                    case 3: goto L_0x0046;
                    case 4: goto L_0x0051;
                    case 5: goto L_0x002c;
                    case 6: goto L_0x0037;
                    default: goto L_0x0012;
                }
            L_0x0012:
                java.lang.RuntimeException r4 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Didn't handle type: "
                r0.<init>(r1)
                com.facebook.litho.Transition$setMax r1 = r3.setMin
                com.facebook.litho.Transition$setMin r1 = r1.getMin
                com.facebook.litho.Transition$ComponentTargetType r1 = r1.setMax
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
            L_0x002c:
                java.lang.String r0 = r3.isInside
                java.lang.String r2 = r4.getMax
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0037
                return r1
            L_0x0037:
                com.facebook.litho.Transition$setMax r0 = r3.setMin
                com.facebook.litho.Transition$setMin r0 = r0.getMin
                java.lang.Object r0 = r0.getMin
                java.lang.String[] r0 = (java.lang.String[]) r0
                java.lang.String r4 = r4.setMin
                boolean r4 = com.facebook.litho.Transition.setMax(r0, r4)
                return r4
            L_0x0046:
                java.lang.String r0 = r3.isInside
                java.lang.String r2 = r4.getMax
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0051
                return r1
            L_0x0051:
                java.lang.String r4 = r4.setMin
                com.facebook.litho.Transition$setMax r0 = r3.setMin
                com.facebook.litho.Transition$setMin r0 = r0.getMin
                java.lang.Object r0 = r0.getMin
                boolean r4 = r4.equals(r0)
                return r4
            L_0x005e:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.Transition.isInside.length(o.pageScroll):boolean");
        }

        public final boolean getMax(requestChildFocus requestchildfocus) {
            int i = AnonymousClass1.length[this.setMin.length.setMin.ordinal()];
            if (i == 1) {
                return Transition.setMax(computeScroll.isInside, requestchildfocus);
            }
            if (i == 2) {
                return Transition.setMax((requestChildFocus[]) this.setMin.length.length, requestchildfocus);
            }
            if (i == 3) {
                return requestchildfocus.equals(this.setMin.length.length);
            }
            StringBuilder sb = new StringBuilder("Didn't handle type: ");
            sb.append(this.setMin.length.length);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: com.facebook.litho.Transition$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] length;
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        static {
            /*
                com.facebook.litho.Transition$PropertyTargetType[] r0 = com.facebook.litho.Transition.PropertyTargetType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                r1 = 1
                com.facebook.litho.Transition$PropertyTargetType r2 = com.facebook.litho.Transition.PropertyTargetType.AUTO_LAYOUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.litho.Transition$PropertyTargetType r3 = com.facebook.litho.Transition.PropertyTargetType.SET     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = length     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.litho.Transition$PropertyTargetType r4 = com.facebook.litho.Transition.PropertyTargetType.SINGLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.facebook.litho.Transition$ComponentTargetType[] r3 = com.facebook.litho.Transition.ComponentTargetType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                setMin = r3
                com.facebook.litho.Transition$ComponentTargetType r4 = com.facebook.litho.Transition.ComponentTargetType.ALL     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = setMin     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.facebook.litho.Transition$ComponentTargetType r3 = com.facebook.litho.Transition.ComponentTargetType.AUTO_LAYOUT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x004d }
                com.facebook.litho.Transition$ComponentTargetType r1 = com.facebook.litho.Transition.ComponentTargetType.LOCAL_KEY     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.facebook.litho.Transition$ComponentTargetType r1 = com.facebook.litho.Transition.ComponentTargetType.GLOBAL_KEY     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.facebook.litho.Transition$ComponentTargetType r1 = com.facebook.litho.Transition.ComponentTargetType.LOCAL_KEY_SET     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x006e }
                com.facebook.litho.Transition$ComponentTargetType r1 = com.facebook.litho.Transition.ComponentTargetType.GLOBAL_KEY_SET     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.Transition.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static <T> boolean setMax(T[] tArr, T t) {
        for (T t2 : tArr) {
            if (t2 == t) {
                return true;
            }
        }
        return false;
    }

    public static class equals implements toFloatRange {
        final obtainAccessibilityNodeInfo setMax;

        public equals(obtainAccessibilityNodeInfo obtainaccessibilitynodeinfo) {
            this.setMax = obtainaccessibilitynodeinfo;
        }

        public final getAccessibilityFocusedVirtualViewId length(describeContents describecontents) {
            return new getSuperState(describecontents, this.setMax);
        }
    }

    static class IsOverlapping implements dispatchHoverEvent {
        private final requestChildFocus length;
        private final LayoutState setMax;

        /* synthetic */ IsOverlapping(LayoutState layoutState, requestChildFocus requestchildfocus, byte b) {
            this(layoutState, requestchildfocus);
        }

        private IsOverlapping(LayoutState layoutState, requestChildFocus requestchildfocus) {
            this.setMax = layoutState;
            this.length = requestchildfocus;
        }

        public final float getMin(writeToParcel writetoparcel) {
            return this.length.getMax(this.setMax.toFloatRange.get(0));
        }

        public final NestedScrollView.SavedState setMin(writeToParcel writetoparcel) {
            throw new UnsupportedOperationException();
        }
    }

    static float getMin(isInside isinside, LayoutState layoutState, requestChildFocus requestchildfocus) {
        new IsOverlapping(layoutState, requestchildfocus, (byte) 0);
        pageScroll pagescroll = layoutState.FastBitmap$CoordinateSystem;
        AbsSavedState.AnonymousClass1 r2 = isinside.equals;
        new writeToParcel(pagescroll, requestchildfocus);
        return r2.setMin();
    }

    public static abstract class getMax extends Transition {
        AbsSavedState.AnonymousClass1 IsOverlapping;
        toFloatRange equals = Transition.setMin;
        length isInside;
        setMin setMax;
        ArrayList<isInside> setMin = new ArrayList<>();
        String toFloatRange;
        AbsSavedState.AnonymousClass1 toIntRange;

        public final ArrayList<isInside> getMin() {
            if (this.isInside != null) {
                this.setMin.add(new isInside(new setMax(this.setMax, this.isInside), this.equals, this.IsOverlapping, this.toIntRange, this.toFloatRange));
                this.isInside = null;
                this.equals = Transition.setMin;
                this.IsOverlapping = null;
                this.toIntRange = null;
                this.toFloatRange = null;
            }
            return this.setMin;
        }
    }
}
