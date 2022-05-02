package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.LayoutOutput;
import com.facebook.litho.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o.IResultReceiver;
import o.NestedScrollView;

public final class smoothScrollBy {
    public final toFloatRange IsOverlapping = new toFloatRange(this, (byte) 0);
    final setMax equals;
    public final setMin getMax = new setMin(this, (byte) 0);
    final Map<AbsSavedState, List<writeToParcel>> getMin = new HashMap();
    public AbsSavedState isInside;
    final getScrollRange<getMin> length = new getScrollRange<>();
    final IResultReceiver.Stub<String> setMax = new IResultReceiver.Stub<>();
    final ArrayList<AbsSavedState> setMin = new ArrayList<>();
    private final Map<writeToParcel, Float> toFloatRange = new HashMap();
    private final getMax toIntRange = new getMax(this, (byte) 0);
    private final WindowInsetsCompat$Type$InsetsType toString;

    public interface setMax {
        void length(pageScroll pagescroll);
    }

    static class length {
        public AbsSavedState getMax;
        public Float getMin;
        public NestedScrollView.SavedState length;
        public int setMax;
        public Float setMin;

        private length() {
        }

        /* synthetic */ length(byte b) {
            this();
        }
    }

    static class getMin {
        @Nullable
        public hide<Object> getMax;
        @Nullable
        public hide<LayoutOutput> getMin;
        @Nullable
        public hide<LayoutOutput> length;
        public int setMax;
        public final Map<requestChildFocus, length> setMin;
        public boolean toFloatRange;

        private getMin() {
            this.setMin = new HashMap();
            this.setMax = -1;
            this.toFloatRange = false;
        }

        /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public smoothScrollBy(setMax setmax, WindowInsetsCompat$Type$InsetsType windowInsetsCompat$Type$InsetsType) {
        this.equals = setmax;
        this.toString = windowInsetsCompat$Type$InsetsType;
    }

    public final void length(pageScroll pagescroll, hide<Object> hide) {
        getMin getmin = (getMin) this.length.getMin.get(pagescroll);
        if (getmin != null) {
            getMax(getmin, hide);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean getMin(pageScroll pagescroll) {
        return this.length.setMin(pagescroll);
    }

    /* access modifiers changed from: package-private */
    public final boolean length(pageScroll pagescroll) {
        getMin getmin = (getMin) this.length.getMin.get(pagescroll);
        if (getmin != null && getmin.setMax == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void length(pageScroll pagescroll, hide<LayoutOutput> hide, hide<LayoutOutput> hide2) {
        getMin getmin = (getMin) this.length.getMin.get(pagescroll);
        if (getmin == null) {
            getmin = new getMin((byte) 0);
            this.length.getMin(pagescroll, getmin);
        }
        if (hide == null && hide2 == null) {
            throw new RuntimeException("Both current and next LayoutOutput groups were null!");
        }
        if (hide == null && hide2 != null) {
            getmin.setMax = 0;
        } else if (hide == null || hide2 == null) {
            getmin.setMax = 2;
        } else {
            getmin.setMax = 1;
        }
        if (hide != null) {
            getMin(hide);
        }
        getmin.getMin = hide;
        if (hide2 != null) {
            getMin(hide2);
        }
        getmin.length = hide2;
        length(getmin);
        getmin.toFloatRange = true;
    }

    private static void length(getMin getmin) {
        LayoutOutput max = getmin.length != null ? getmin.length.getMax() : null;
        for (requestChildFocus next : getmin.setMin.keySet()) {
            length length2 = getmin.setMin.get(next);
            if (max == null) {
                length2.setMin = null;
            } else {
                length2.setMin = Float.valueOf(next.getMax(max));
            }
        }
    }

    @Nullable
    static Transition setMin(List<Transition> list) {
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new hasNestedScrollingParent(list);
    }

    /* access modifiers changed from: package-private */
    public final AbsSavedState getMax(Transition transition) {
        if (transition instanceof Transition.isInside) {
            return getMin((Transition.isInside) transition);
        }
        if (transition instanceof smoothScrollTo) {
            return length((smoothScrollTo) transition);
        }
        throw new RuntimeException("Unhandled Transition type: ".concat(String.valueOf(transition)));
    }

    private void getMin(Transition.isInside isinside, ArrayList<AbsSavedState> arrayList) {
        for (pageScroll next : this.length.getMin.keySet()) {
            if (((getMin) this.length.getMin.get(next)).toFloatRange) {
                setMax(isinside, next, arrayList);
            }
        }
    }

    /* renamed from: o.smoothScrollBy$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] getMax;
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
                setMin = r0
                r1 = 1
                com.facebook.litho.Transition$PropertyTargetType r2 = com.facebook.litho.Transition.PropertyTargetType.AUTO_LAYOUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.litho.Transition$PropertyTargetType r3 = com.facebook.litho.Transition.PropertyTargetType.SET     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = setMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.litho.Transition$PropertyTargetType r4 = com.facebook.litho.Transition.PropertyTargetType.SINGLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.facebook.litho.Transition$ComponentTargetType[] r3 = com.facebook.litho.Transition.ComponentTargetType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                getMax = r3
                com.facebook.litho.Transition$ComponentTargetType r4 = com.facebook.litho.Transition.ComponentTargetType.ALL     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = getMax     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.facebook.litho.Transition$ComponentTargetType r3 = com.facebook.litho.Transition.ComponentTargetType.AUTO_LAYOUT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x004d }
                com.facebook.litho.Transition$ComponentTargetType r1 = com.facebook.litho.Transition.ComponentTargetType.LOCAL_KEY     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.facebook.litho.Transition$ComponentTargetType r1 = com.facebook.litho.Transition.ComponentTargetType.LOCAL_KEY_SET     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.facebook.litho.Transition$ComponentTargetType r1 = com.facebook.litho.Transition.ComponentTargetType.GLOBAL_KEY     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x006e }
                com.facebook.litho.Transition$ComponentTargetType r1 = com.facebook.litho.Transition.ComponentTargetType.GLOBAL_KEY_SET     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.smoothScrollBy.AnonymousClass5.<clinit>():void");
        }
    }

    @Nullable
    private AbsSavedState getMax(Transition.isInside isinside, pageScroll pagescroll, requestChildFocus requestchildfocus) {
        float f;
        float f2;
        getMin getmin = (getMin) this.length.getMin.get(pagescroll);
        getAccessibilityFocusedVirtualViewId getaccessibilityfocusedvirtualviewid = null;
        if (!(getmin == null || (getmin.getMin == null && getmin.length == null))) {
            int i = getmin.setMax;
            getMax(getmin.setMax);
            if ((i == 0 && !isinside.setMin()) || (i == 2 && !isinside.length())) {
                return null;
            }
            length length2 = getmin.setMin.get(requestchildfocus);
            writeToParcel writetoparcel = new writeToParcel(pagescroll, requestchildfocus);
            if (length2 != null) {
                f = length2.length.setMax;
            } else if (getmin.setMax != 0) {
                f = requestchildfocus.getMax(getmin.getMin.getMax());
            } else {
                f = isinside.equals.setMin();
            }
            if (getmin.setMax != 2) {
                f2 = requestchildfocus.getMax(getmin.length.getMax());
            } else {
                f2 = isinside.IsOverlapping.setMin();
            }
            if (length2 == null || length2.getMin == null) {
                if (f == f2) {
                    return null;
                }
            } else if (f2 == length2.getMin.floatValue()) {
                return null;
            }
            getaccessibilityfocusedvirtualviewid = isinside.setMax.length(new describeContents(writetoparcel, f2));
            getaccessibilityfocusedvirtualviewid.getMax(this.toIntRange);
            if (length2 == null) {
                length2 = new length((byte) 0);
                length2.length = new NestedScrollView.SavedState(getmin.getMax, requestchildfocus);
                getmin.setMin.put(requestchildfocus, length2);
            }
            length2.length.getMax(f);
            length2.setMax++;
            ArrayList arrayList = new ArrayList();
            arrayList.add(writetoparcel);
            this.getMin.put(getaccessibilityfocusedvirtualviewid, arrayList);
            this.toFloatRange.put(writetoparcel, Float.valueOf(f));
            if (!TextUtils.isEmpty(isinside.toFloatRange)) {
                this.setMax.setMax(getaccessibilityfocusedvirtualviewid.hashCode(), isinside.toFloatRange);
            }
        }
        return getaccessibilityfocusedvirtualviewid;
    }

    public final void getMin() {
        for (writeToParcel next : this.toFloatRange.keySet()) {
            float floatValue = this.toFloatRange.get(next).floatValue();
            getMin getmin = (getMin) this.length.getMin.get(next.setMin);
            if (getmin.getMax != null) {
                setMax(next.setMax, floatValue, getmin.getMax);
            }
        }
        this.toFloatRange.clear();
    }

    static void getMax(getMin getmin, hide<Object> hide) {
        hide<Object> hide2 = getmin.getMax;
        if (hide2 != null || hide != null) {
            if (hide2 == null || !hide2.equals(hide)) {
                Map<requestChildFocus, length> map = getmin.setMin;
                if (getmin.getMax != null) {
                    for (requestChildFocus next : map.keySet()) {
                        hide<Object> hide3 = getmin.getMax;
                        short s = hide3.getMin;
                        for (int i = 0; i < s; i++) {
                            next.setMax(hide3.setMax[hide3.getMax(i)]);
                        }
                    }
                    Object obj = getmin.getMax.setMax[3];
                    if (obj instanceof View) {
                        getMin((View) obj, true);
                    }
                }
                for (length length2 : map.values()) {
                    NestedScrollView.SavedState savedState = length2.length;
                    savedState.setMax(hide);
                    savedState.getMin(savedState.setMax);
                }
                if (hide != null) {
                    Object obj2 = hide.setMax[3];
                    if (obj2 instanceof View) {
                        getMin((View) obj2, false);
                    }
                }
                getmin.getMax = hide;
            }
        }
    }

    private static void getMin(View view, boolean z) {
        while (true) {
            if (view instanceof ComponentHost) {
                if (z) {
                    ((ComponentHost) view).restoreChildClipping();
                } else {
                    ((ComponentHost) view).temporaryDisableChildClipping();
                }
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ComponentHost) {
                view = (View) parent;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMax() {
        HashSet<pageScroll> hashSet = new HashSet<>();
        for (pageScroll next : this.length.getMin.keySet()) {
            getMin getmin = (getMin) this.length.getMin.get(next);
            if (getmin.setMin.isEmpty()) {
                getMax(getmin, (hide<Object>) null);
                setMax(getmin);
                hashSet.add(next);
            }
        }
        for (pageScroll length2 : hashSet) {
            this.length.length(length2);
        }
    }

    private static String getMax(int i) {
        if (i == -1) {
            return "UNSET";
        }
        if (i == 0) {
            return "APPEARED";
        }
        if (i == 1) {
            return "CHANGED";
        }
        if (i == 2) {
            return "DISAPPEARED";
        }
        throw new RuntimeException("Unknown changeType: ".concat(String.valueOf(i)));
    }

    /* access modifiers changed from: package-private */
    public static void setMax(getMin getmin) {
        if (getmin.getMin != null) {
            hide<LayoutOutput> hide = getmin.getMin;
            short s = hide.getMin;
            for (int i = 0; i < s; i++) {
                ((LayoutOutput) hide.setMax[hide.getMax(i)]).IsOverlapping();
            }
            getmin.getMin = null;
        }
        if (getmin.length != null) {
            hide<LayoutOutput> hide2 = getmin.length;
            short s2 = hide2.getMin;
            for (int i2 = 0; i2 < s2; i2++) {
                ((LayoutOutput) hide2.setMax[hide2.getMax(i2)]).IsOverlapping();
            }
            getmin.length = null;
        }
    }

    class getMax implements fling {
        private final ArrayList<describeContents> setMin;

        private getMax() {
            this.setMin = new ArrayList<>();
        }

        /* synthetic */ getMax(smoothScrollBy smoothscrollby, byte b) {
            this();
        }

        public final void length(AbsSavedState absSavedState) {
            toIntRange(absSavedState);
        }

        public final void getMin(AbsSavedState absSavedState) {
            toIntRange(absSavedState);
            if (!TextUtils.isEmpty(smoothScrollBy.this.setMax.setMin(absSavedState.hashCode()))) {
                absSavedState.hashCode();
                NotificationCompat$StreamType.setMax();
            }
        }

        public final void setMin(AbsSavedState absSavedState) {
            toFloatRange(absSavedState);
        }

        public final void setMax(AbsSavedState absSavedState) {
            toFloatRange(absSavedState);
        }

        public final boolean getMax(AbsSavedState absSavedState) {
            absSavedState.setMin(this.setMin);
            int size = this.setMin.size();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                describeContents describecontents = this.setMin.get(i);
                length length = ((getMin) smoothScrollBy.this.length.getMin.get(describecontents.getMin.setMin)).setMin.get(describecontents.getMin.setMax);
                if (!(length.setMin == null || length.setMin.floatValue() == describecontents.length)) {
                    z = false;
                }
            }
            this.setMin.clear();
            return z;
        }

        private void toIntRange(AbsSavedState absSavedState) {
            absSavedState.setMin(this.setMin);
            int size = this.setMin.size();
            for (int i = 0; i < size; i++) {
                describeContents describecontents = this.setMin.get(i);
                length length = ((getMin) smoothScrollBy.this.length.getMin.get(describecontents.getMin.setMin)).setMin.get(describecontents.getMin.setMax);
                length.getMin = Float.valueOf(describecontents.length);
                length.getMax = absSavedState;
            }
            this.setMin.clear();
        }

        private void toFloatRange(AbsSavedState absSavedState) {
            boolean z;
            List remove = smoothScrollBy.this.getMin.remove(absSavedState);
            if (remove != null) {
                int size = remove.size();
                for (int i = 0; i < size; i++) {
                    writeToParcel writetoparcel = (writeToParcel) remove.get(i);
                    pageScroll pagescroll = writetoparcel.setMin;
                    getMin getmin = (getMin) smoothScrollBy.this.length.getMin.get(pagescroll);
                    requestChildFocus requestchildfocus = writetoparcel.setMax;
                    if (getmin.setMax == 2) {
                        length length = getmin.setMin.get(requestchildfocus);
                        if (length != null) {
                            length.setMax--;
                            z = setMin(getmin);
                            if (z && getmin.getMax != null) {
                                for (requestChildFocus length2 : getmin.setMin.keySet()) {
                                    smoothScrollBy.length(length2, (hide) getmin.getMax);
                                }
                            }
                        } else {
                            throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                        }
                    } else {
                        length length3 = getmin.setMin.get(requestchildfocus);
                        if (length3 != null) {
                            length3.setMax--;
                            if (length3.setMax > 0) {
                                z = false;
                            } else {
                                getmin.setMin.remove(requestchildfocus);
                                boolean isEmpty = getmin.setMin.isEmpty();
                                if (getmin.getMax != null) {
                                    smoothScrollBy.setMax(requestchildfocus, requestchildfocus.getMax(getmin.length.getMax()), getmin.getMax);
                                }
                                z = isEmpty;
                            }
                        } else {
                            throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                        }
                    }
                    if (z) {
                        if (getmin.getMax != null) {
                            smoothScrollBy.setMin(getmin.getMax);
                        }
                        if (smoothScrollBy.this.equals != null) {
                            smoothScrollBy.this.equals.length(pagescroll);
                        }
                        smoothScrollBy.this.length.length(pagescroll);
                        smoothScrollBy.setMax(getmin);
                    }
                }
                if (!TextUtils.isEmpty(smoothScrollBy.this.setMax.setMin(absSavedState.hashCode()))) {
                    absSavedState.hashCode();
                    NotificationCompat$StreamType.getMin();
                    smoothScrollBy.this.setMax.setMax(absSavedState.hashCode());
                }
            }
        }

        private static boolean setMin(getMin getmin) {
            if (getmin.setMax == 2) {
                for (length length : getmin.setMin.values()) {
                    if (length.setMax > 0) {
                        return false;
                    }
                }
                return true;
            }
            throw new RuntimeException("This should only be checked for disappearing animations");
        }
    }

    class toFloatRange implements dispatchHoverEvent {
        private toFloatRange() {
        }

        /* synthetic */ toFloatRange(smoothScrollBy smoothscrollby, byte b) {
            this();
        }

        public final float getMin(writeToParcel writetoparcel) {
            requestChildFocus requestchildfocus = writetoparcel.setMax;
            getMin getmin = (getMin) smoothScrollBy.this.length.getMin.get(writetoparcel.setMin);
            length length = getmin.setMin.get(requestchildfocus);
            if (length != null) {
                return length.length.setMax;
            }
            hide<LayoutOutput> hide = getmin.setMax == 0 ? getmin.length : getmin.getMin;
            if (hide != null) {
                return requestchildfocus.getMax(hide.getMax());
            }
            throw new RuntimeException("Both LayoutOutputs were null!");
        }

        public final NestedScrollView.SavedState setMin(writeToParcel writetoparcel) {
            return ((getMin) smoothScrollBy.this.length.getMin.get(writetoparcel.setMin)).setMin.get(writetoparcel.setMax).length;
        }
    }

    class setMin implements fling {
        public final boolean getMax(AbsSavedState absSavedState) {
            return true;
        }

        public final void length(AbsSavedState absSavedState) {
        }

        private setMin() {
        }

        /* synthetic */ setMin(smoothScrollBy smoothscrollby, byte b) {
            this();
        }

        public final void getMin(AbsSavedState absSavedState) {
            smoothScrollBy.this.setMin.add(absSavedState);
        }

        public final void setMin(AbsSavedState absSavedState) {
            smoothScrollBy.this.setMin.remove(absSavedState);
        }

        public final void setMax(AbsSavedState absSavedState) {
            smoothScrollBy.this.setMin.remove(absSavedState);
        }
    }

    private static void getMin(hide<LayoutOutput> hide) {
        short s = hide.getMin;
        int i = 0;
        while (i < s) {
            if (((LayoutOutput) hide.setMax[hide.getMax(i)]).isInside.getAndIncrement() > 0) {
                i++;
            } else {
                throw new RuntimeException("Tried to acquire a reference to a released LayoutOutput!");
            }
        }
    }

    @Nullable
    private AbsSavedState length(smoothScrollTo smoothscrollto) {
        ArrayList<Transition> arrayList = smoothscrollto.setMax;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbsSavedState max = getMax(arrayList.get(i));
            if (max != null) {
                arrayList2.add(max);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return smoothscrollto.length(arrayList2);
    }

    @Nullable
    private AbsSavedState getMin(Transition.isInside isinside) {
        Transition.setMax setmax = isinside.setMin;
        ArrayList arrayList = new ArrayList();
        switch (AnonymousClass5.getMax[setmax.getMin.setMax.ordinal()]) {
            case 1:
            case 2:
                getMin(isinside, (ArrayList<AbsSavedState>) arrayList);
                break;
            case 3:
                String str = (String) setmax.getMin.getMin;
                Map map = this.length.setMax.get(isinside.isInside);
                setMax(isinside, map != null ? (pageScroll) map.get(str) : null, (ArrayList<AbsSavedState>) arrayList);
                break;
            case 4:
                String[] strArr = (String[]) setmax.getMin.getMin;
                String str2 = isinside.isInside;
                for (String str3 : strArr) {
                    Map map2 = this.length.setMax.get(str2);
                    pageScroll pagescroll = map2 != null ? (pageScroll) map2.get(str3) : null;
                    if (pagescroll != null) {
                        setMax(isinside, pagescroll, (ArrayList<AbsSavedState>) arrayList);
                    }
                }
                break;
            case 5:
                setMax(isinside, this.length.getMax.get((String) setmax.getMin.getMin), (ArrayList<AbsSavedState>) arrayList);
                break;
            case 6:
                String[] strArr2 = (String[]) setmax.getMin.getMin;
                for (String str4 : strArr2) {
                    pageScroll pagescroll2 = this.length.getMax.get(str4);
                    if (pagescroll2 != null) {
                        setMax(isinside, pagescroll2, (ArrayList<AbsSavedState>) arrayList);
                    }
                }
                break;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (AbsSavedState) arrayList.get(0);
        }
        return new TextViewCompat$AutoSizeTextType(0, arrayList);
    }

    private void setMax(Transition.isInside isinside, pageScroll pagescroll, ArrayList<AbsSavedState> arrayList) {
        AbsSavedState max;
        Transition.setMax setmax = isinside.setMin;
        int i = AnonymousClass5.setMin[setmax.length.setMin.ordinal()];
        int i2 = 0;
        if (i == 1) {
            while (i2 < computeScroll.isInside.length) {
                AbsSavedState max2 = getMax(isinside, pagescroll, computeScroll.isInside[i2]);
                if (max2 != null) {
                    arrayList.add(max2);
                }
                i2++;
            }
        } else if (i == 2) {
            requestChildFocus[] requestchildfocusArr = (requestChildFocus[]) setmax.length.length;
            while (i2 < requestchildfocusArr.length) {
                AbsSavedState max3 = getMax(isinside, pagescroll, requestchildfocusArr[i2]);
                if (max3 != null) {
                    arrayList.add(max3);
                }
                i2++;
            }
        } else if (i == 3 && (max = getMax(isinside, pagescroll, (requestChildFocus) setmax.length.length)) != null) {
            arrayList.add(max);
        }
    }

    static void setMin(hide<Object> hide) {
        Object obj = hide.setMax[3];
        if (obj instanceof View) {
            getMin((View) obj, true);
        }
    }

    /* access modifiers changed from: private */
    public static void setMax(requestChildFocus requestchildfocus, float f, hide<Object> hide) {
        short s = hide.getMin;
        for (int i = 0; i < s; i++) {
            requestchildfocus.setMin(hide.setMax[hide.getMax(i)], f);
        }
    }

    static /* synthetic */ void length(requestChildFocus requestchildfocus, hide hide) {
        short s = hide.getMin;
        for (int i = 0; i < s; i++) {
            requestchildfocus.setMax(hide.setMax[hide.getMax(i)]);
        }
    }
}
