package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import o.PluralsRes;
import o.setCancelable;
import o.setNegativeButtonIcon;

public class WindowInsetsCompat {
    @NonNull
    public static final WindowInsetsCompat getMax;
    private final IsOverlapping getMin;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            getMax = hashCode.getMax;
        } else {
            getMax = IsOverlapping.getMin;
        }
    }

    @RequiresApi(20)
    private WindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.getMin = new hashCode(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.getMin = new toString(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.getMin = new equals(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.getMin = new isInside(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.getMin = new toIntRange(this, windowInsets);
        } else {
            this.getMin = new IsOverlapping(this);
        }
    }

    public WindowInsetsCompat(@Nullable WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            IsOverlapping isOverlapping = windowInsetsCompat.getMin;
            if (Build.VERSION.SDK_INT >= 30 && (isOverlapping instanceof hashCode)) {
                this.getMin = new hashCode(this, (hashCode) isOverlapping);
            } else if (Build.VERSION.SDK_INT >= 29 && (isOverlapping instanceof toString)) {
                this.getMin = new toString(this, (toString) isOverlapping);
            } else if (Build.VERSION.SDK_INT >= 28 && (isOverlapping instanceof equals)) {
                this.getMin = new equals(this, (equals) isOverlapping);
            } else if (Build.VERSION.SDK_INT >= 21 && (isOverlapping instanceof isInside)) {
                this.getMin = new isInside(this, (isInside) isOverlapping);
            } else if (Build.VERSION.SDK_INT < 20 || !(isOverlapping instanceof toIntRange)) {
                this.getMin = new IsOverlapping(this);
            } else {
                this.getMin = new toIntRange(this, (toIntRange) isOverlapping);
            }
            isOverlapping.setMin(this);
            return;
        }
        this.getMin = new IsOverlapping(this);
    }

    @RequiresApi(20)
    @NonNull
    public static WindowInsetsCompat getMin(@NonNull WindowInsets windowInsets) {
        return setMax(windowInsets, (View) null);
    }

    @RequiresApi(20)
    @NonNull
    public static WindowInsetsCompat setMax(@NonNull WindowInsets windowInsets, @Nullable View view) {
        if (windowInsets != null) {
            WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
            if (view != null && view.isAttachedToWindow()) {
                windowInsetsCompat.getMax(ViewCompat.create(view));
                windowInsetsCompat.length(view.getRootView());
            }
            return windowInsetsCompat;
        }
        throw null;
    }

    @Deprecated
    public int getMax() {
        return this.getMin.IsOverlapping().setMin;
    }

    @Deprecated
    public int setMax() {
        return this.getMin.IsOverlapping().length;
    }

    @Deprecated
    public int setMin() {
        return this.getMin.IsOverlapping().getMin;
    }

    @Deprecated
    public int getMin() {
        return this.getMin.IsOverlapping().getMax;
    }

    @Deprecated
    public boolean length() {
        return !this.getMin.IsOverlapping().equals(PluralsRes.setMax);
    }

    public boolean IsOverlapping() {
        return this.getMin.length();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat toIntRange() {
        return this.getMin.setMin();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat setMax(int i, int i2, int i3, int i4) {
        return new getMax(this).length(PluralsRes.setMax(i, i2, i3, i4)).setMax();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat equals() {
        return this.getMin.getMin();
    }

    @Nullable
    public setCancelable isInside() {
        return this.getMin.setMax();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat toFloatRange() {
        return this.getMin.isInside();
    }

    @NonNull
    @Deprecated
    public PluralsRes toDoubleRange() {
        return this.getMin.equals();
    }

    @NonNull
    @Deprecated
    public PluralsRes FastBitmap$CoordinateSystem() {
        return this.getMin.toFloatRange();
    }

    @NonNull
    public WindowInsetsCompat getMin(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4) {
        return this.getMin.length(i, i2, i3, i4);
    }

    @NonNull
    public PluralsRes length(int i) {
        return this.getMin.getMax(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return setNegativeButtonIcon.getMax(this.getMin, ((WindowInsetsCompat) obj).getMin);
    }

    public int hashCode() {
        IsOverlapping isOverlapping = this.getMin;
        if (isOverlapping == null) {
            return 0;
        }
        return isOverlapping.hashCode();
    }

    @RequiresApi(20)
    @Nullable
    public WindowInsets values() {
        IsOverlapping isOverlapping = this.getMin;
        if (isOverlapping instanceof toIntRange) {
            return ((toIntRange) isOverlapping).setMin;
        }
        return null;
    }

    static class IsOverlapping {
        @NonNull
        static final WindowInsetsCompat getMin = new getMax().setMax().toFloatRange().equals().toIntRange();
        final WindowInsetsCompat length;

        /* access modifiers changed from: package-private */
        public boolean getMax() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void getMin(@Nullable WindowInsetsCompat windowInsetsCompat) {
        }

        public void getMin(PluralsRes pluralsRes) {
        }

        /* access modifiers changed from: package-private */
        public void length(@NonNull PluralsRes pluralsRes) {
        }

        /* access modifiers changed from: package-private */
        public boolean length() {
            return false;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public setCancelable setMax() {
            return null;
        }

        public void setMax(PluralsRes[] pluralsResArr) {
        }

        /* access modifiers changed from: package-private */
        public void setMin(@NonNull View view) {
        }

        /* access modifiers changed from: package-private */
        public void setMin(@NonNull WindowInsetsCompat windowInsetsCompat) {
        }

        IsOverlapping(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.length = windowInsetsCompat;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public WindowInsetsCompat setMin() {
            return this.length;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public WindowInsetsCompat getMin() {
            return this.length;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public WindowInsetsCompat isInside() {
            return this.length;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public PluralsRes IsOverlapping() {
            return PluralsRes.setMax;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public PluralsRes equals() {
            return PluralsRes.setMax;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public PluralsRes toIntRange() {
            return IsOverlapping();
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public PluralsRes toFloatRange() {
            return IsOverlapping();
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public PluralsRes toDoubleRange() {
            return IsOverlapping();
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public WindowInsetsCompat length(int i, int i2, int i3, int i4) {
            return getMin;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public PluralsRes getMax(int i) {
            return PluralsRes.setMax;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IsOverlapping)) {
                return false;
            }
            IsOverlapping isOverlapping = (IsOverlapping) obj;
            return getMax() == isOverlapping.getMax() && length() == isOverlapping.length() && setNegativeButtonIcon.getMax(IsOverlapping(), isOverlapping.IsOverlapping()) && setNegativeButtonIcon.getMax(equals(), isOverlapping.equals()) && setNegativeButtonIcon.getMax(setMax(), isOverlapping.setMax());
        }

        public int hashCode() {
            return setNegativeButtonIcon.setMin(Boolean.valueOf(getMax()), Boolean.valueOf(length()), IsOverlapping(), equals(), setMax());
        }
    }

    @RequiresApi(20)
    static class toIntRange extends IsOverlapping {
        private static Class<?> IsOverlapping = null;
        private static Field equals = null;
        private static boolean getMax = false;
        private static Method isInside;
        private static Field toFloatRange;
        private static Class<?> toIntRange;
        private PluralsRes FastBitmap$CoordinateSystem;
        private WindowInsetsCompat hashCode;
        PluralsRes setMax;
        @NonNull
        final WindowInsets setMin;
        private PluralsRes[] values;

        toIntRange(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.FastBitmap$CoordinateSystem = null;
            this.setMin = windowInsets;
        }

        toIntRange(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull toIntRange tointrange) {
            this(windowInsetsCompat, new WindowInsets(tointrange.setMin));
        }

        /* access modifiers changed from: package-private */
        public boolean getMax() {
            return this.setMin.isRound();
        }

        @NonNull
        public PluralsRes getMax(int i) {
            return setMin(i, false);
        }

        @SuppressLint({"WrongConstant"})
        @NonNull
        private PluralsRes setMin(int i, boolean z) {
            PluralsRes pluralsRes = PluralsRes.setMax;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    pluralsRes = PluralsRes.length(pluralsRes, length(i2, z));
                }
            }
            return pluralsRes;
        }

        /* access modifiers changed from: protected */
        @NonNull
        public PluralsRes length(int i, boolean z) {
            setCancelable setcancelable;
            if (i != 1) {
                PluralsRes pluralsRes = null;
                if (i != 2) {
                    if (i == 8) {
                        PluralsRes[] pluralsResArr = this.values;
                        if (pluralsResArr != null) {
                            pluralsRes = pluralsResArr[Type.setMax(8)];
                        }
                        if (pluralsRes != null) {
                            return pluralsRes;
                        }
                        PluralsRes IsOverlapping2 = IsOverlapping();
                        PluralsRes FastBitmap$CoordinateSystem2 = FastBitmap$CoordinateSystem();
                        if (IsOverlapping2.getMax > FastBitmap$CoordinateSystem2.getMax) {
                            return PluralsRes.setMax(0, 0, 0, IsOverlapping2.getMax);
                        }
                        PluralsRes pluralsRes2 = this.setMax;
                        if (pluralsRes2 == null || pluralsRes2.equals(PluralsRes.setMax) || this.setMax.getMax <= FastBitmap$CoordinateSystem2.getMax) {
                            return PluralsRes.setMax;
                        }
                        return PluralsRes.setMax(0, 0, 0, this.setMax.getMax);
                    } else if (i == 16) {
                        return toIntRange();
                    } else {
                        if (i == 32) {
                            return toFloatRange();
                        }
                        if (i == 64) {
                            return toDoubleRange();
                        }
                        if (i != 128) {
                            return PluralsRes.setMax;
                        }
                        WindowInsetsCompat windowInsetsCompat = this.hashCode;
                        if (windowInsetsCompat != null) {
                            setcancelable = windowInsetsCompat.isInside();
                        } else {
                            setcancelable = setMax();
                        }
                        if (setcancelable != null) {
                            return PluralsRes.setMax(setcancelable.setMin(), setcancelable.getMax(), setcancelable.getMin(), setcancelable.length());
                        }
                        return PluralsRes.setMax;
                    }
                } else if (z) {
                    PluralsRes FastBitmap$CoordinateSystem3 = FastBitmap$CoordinateSystem();
                    PluralsRes equals2 = equals();
                    return PluralsRes.setMax(Math.max(FastBitmap$CoordinateSystem3.setMin, equals2.setMin), 0, Math.max(FastBitmap$CoordinateSystem3.getMin, equals2.getMin), Math.max(FastBitmap$CoordinateSystem3.getMax, equals2.getMax));
                } else {
                    PluralsRes IsOverlapping3 = IsOverlapping();
                    WindowInsetsCompat windowInsetsCompat2 = this.hashCode;
                    if (windowInsetsCompat2 != null) {
                        pluralsRes = windowInsetsCompat2.toDoubleRange();
                    }
                    int i2 = IsOverlapping3.getMax;
                    if (pluralsRes != null) {
                        i2 = Math.min(i2, pluralsRes.getMax);
                    }
                    return PluralsRes.setMax(IsOverlapping3.setMin, 0, IsOverlapping3.getMin, i2);
                }
            } else if (z) {
                return PluralsRes.setMax(0, Math.max(FastBitmap$CoordinateSystem().length, IsOverlapping().length), 0, 0);
            } else {
                return PluralsRes.setMax(0, IsOverlapping().length, 0, 0);
            }
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public final PluralsRes IsOverlapping() {
            if (this.FastBitmap$CoordinateSystem == null) {
                this.FastBitmap$CoordinateSystem = PluralsRes.setMax(this.setMin.getSystemWindowInsetLeft(), this.setMin.getSystemWindowInsetTop(), this.setMin.getSystemWindowInsetRight(), this.setMin.getSystemWindowInsetBottom());
            }
            return this.FastBitmap$CoordinateSystem;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public WindowInsetsCompat length(int i, int i2, int i3, int i4) {
            getMax getmax = new getMax(WindowInsetsCompat.getMin(this.setMin));
            getmax.length(WindowInsetsCompat.length(IsOverlapping(), i, i2, i3, i4));
            getmax.setMax(WindowInsetsCompat.length(equals(), i, i2, i3, i4));
            return getmax.setMax();
        }

        /* access modifiers changed from: package-private */
        public void setMin(@NonNull WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.getMax(this.hashCode);
            windowInsetsCompat.length(this.setMax);
        }

        /* access modifiers changed from: package-private */
        public void getMin(@Nullable WindowInsetsCompat windowInsetsCompat) {
            this.hashCode = windowInsetsCompat;
        }

        /* access modifiers changed from: package-private */
        public void length(@NonNull PluralsRes pluralsRes) {
            this.setMax = pluralsRes;
        }

        private PluralsRes FastBitmap$CoordinateSystem() {
            WindowInsetsCompat windowInsetsCompat = this.hashCode;
            if (windowInsetsCompat != null) {
                return windowInsetsCompat.toDoubleRange();
            }
            return PluralsRes.setMax;
        }

        /* access modifiers changed from: package-private */
        public void setMin(@NonNull View view) {
            PluralsRes max = setMax(view);
            if (max == null) {
                max = PluralsRes.setMax;
            }
            length(max);
        }

        @Nullable
        private PluralsRes setMax(@NonNull View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!getMax) {
                    values();
                }
                Method method = isInside;
                if (!(method == null || IsOverlapping == null || toFloatRange == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            new NullPointerException();
                            return null;
                        }
                        Rect rect = (Rect) toFloatRange.get(equals.get(invoke));
                        if (rect != null) {
                            return PluralsRes.setMin(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        e.getMessage();
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public void setMax(PluralsRes[] pluralsResArr) {
            this.values = pluralsResArr;
        }

        @SuppressLint({"PrivateApi"})
        private static void values() {
            try {
                isInside = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                toIntRange = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                IsOverlapping = cls;
                toFloatRange = cls.getDeclaredField("mVisibleInsets");
                equals = toIntRange.getDeclaredField("mAttachInfo");
                toFloatRange.setAccessible(true);
                equals.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
            getMax = true;
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.setMax, ((toIntRange) obj).setMax);
        }
    }

    @RequiresApi(21)
    static class isInside extends toIntRange {
        private PluralsRes getMax = null;

        isInside(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        isInside(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull isInside isinside) {
            super(windowInsetsCompat, (toIntRange) isinside);
            this.getMax = isinside.getMax;
        }

        /* access modifiers changed from: package-private */
        public boolean length() {
            return this.setMin.isConsumed();
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public WindowInsetsCompat getMin() {
            return WindowInsetsCompat.getMin(this.setMin.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public WindowInsetsCompat setMin() {
            return WindowInsetsCompat.getMin(this.setMin.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public final PluralsRes equals() {
            if (this.getMax == null) {
                this.getMax = PluralsRes.setMax(this.setMin.getStableInsetLeft(), this.setMin.getStableInsetTop(), this.setMin.getStableInsetRight(), this.setMin.getStableInsetBottom());
            }
            return this.getMax;
        }

        public void getMin(@Nullable PluralsRes pluralsRes) {
            this.getMax = pluralsRes;
        }
    }

    @RequiresApi(28)
    static class equals extends isInside {
        equals(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        equals(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull equals equals) {
            super(windowInsetsCompat, (isInside) equals);
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public setCancelable setMax() {
            return setCancelable.getMin(this.setMin.getDisplayCutout());
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public WindowInsetsCompat isInside() {
            return WindowInsetsCompat.getMin(this.setMin.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof equals)) {
                return false;
            }
            equals equals = (equals) obj;
            return Objects.equals(this.setMin, equals.setMin) && Objects.equals(this.setMax, equals.setMax);
        }

        public int hashCode() {
            return this.setMin.hashCode();
        }
    }

    @RequiresApi(29)
    static class toString extends equals {
        private PluralsRes IsOverlapping = null;
        private PluralsRes getMax = null;
        private PluralsRes isInside = null;

        public void getMin(@Nullable PluralsRes pluralsRes) {
        }

        toString(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        toString(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull toString tostring) {
            super(windowInsetsCompat, (equals) tostring);
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public PluralsRes toIntRange() {
            if (this.getMax == null) {
                this.getMax = PluralsRes.getMin(this.setMin.getSystemGestureInsets());
            }
            return this.getMax;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public PluralsRes toFloatRange() {
            if (this.IsOverlapping == null) {
                this.IsOverlapping = PluralsRes.getMin(this.setMin.getMandatorySystemGestureInsets());
            }
            return this.IsOverlapping;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public PluralsRes toDoubleRange() {
            if (this.isInside == null) {
                this.isInside = PluralsRes.getMin(this.setMin.getTappableElementInsets());
            }
            return this.isInside;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public WindowInsetsCompat length(int i, int i2, int i3, int i4) {
            return WindowInsetsCompat.getMin(this.setMin.inset(i, i2, i3, i4));
        }
    }

    static PluralsRes length(@NonNull PluralsRes pluralsRes, int i, int i2, int i3, int i4) {
        int max = Math.max(0, pluralsRes.setMin - i);
        int max2 = Math.max(0, pluralsRes.length - i2);
        int max3 = Math.max(0, pluralsRes.getMin - i3);
        int max4 = Math.max(0, pluralsRes.getMax - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return pluralsRes;
        }
        return PluralsRes.setMax(max, max2, max3, max4);
    }

    @RequiresApi(30)
    static class hashCode extends toString {
        @NonNull
        static final WindowInsetsCompat getMax = WindowInsetsCompat.getMin(WindowInsets.CONSUMED);

        /* access modifiers changed from: package-private */
        public final void setMin(@NonNull View view) {
        }

        hashCode(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        hashCode(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull hashCode hashcode) {
            super(windowInsetsCompat, (toString) hashcode);
        }

        @NonNull
        public PluralsRes getMax(int i) {
            return PluralsRes.getMin(this.setMin.getInsets(toDoubleRange.setMax(i)));
        }
    }

    public static final class getMax {
        private final setMin setMin;

        public getMax() {
            if (Build.VERSION.SDK_INT >= 30) {
                this.setMin = new toFloatRange();
            } else if (Build.VERSION.SDK_INT >= 29) {
                this.setMin = new setMax();
            } else if (Build.VERSION.SDK_INT >= 20) {
                this.setMin = new getMin();
            } else {
                this.setMin = new setMin();
            }
        }

        public getMax(@NonNull WindowInsetsCompat windowInsetsCompat) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.setMin = new toFloatRange(windowInsetsCompat);
            } else if (Build.VERSION.SDK_INT >= 29) {
                this.setMin = new setMax(windowInsetsCompat);
            } else if (Build.VERSION.SDK_INT >= 20) {
                this.setMin = new getMin(windowInsetsCompat);
            } else {
                this.setMin = new setMin(windowInsetsCompat);
            }
        }

        @NonNull
        @Deprecated
        public final getMax length(@NonNull PluralsRes pluralsRes) {
            this.setMin.getMin(pluralsRes);
            return this;
        }

        @NonNull
        @Deprecated
        public final getMax setMax(@NonNull PluralsRes pluralsRes) {
            this.setMin.setMin(pluralsRes);
            return this;
        }

        @NonNull
        public final WindowInsetsCompat setMax() {
            return this.setMin.getMin();
        }
    }

    static class setMin {
        private final WindowInsetsCompat length;
        PluralsRes[] setMin;

        /* access modifiers changed from: package-private */
        public void getMax(@NonNull PluralsRes pluralsRes) {
        }

        /* access modifiers changed from: package-private */
        public void getMin(@NonNull PluralsRes pluralsRes) {
        }

        /* access modifiers changed from: package-private */
        public void length(@NonNull PluralsRes pluralsRes) {
        }

        /* access modifiers changed from: package-private */
        public void setMax(@NonNull PluralsRes pluralsRes) {
        }

        /* access modifiers changed from: package-private */
        public void setMin(@NonNull PluralsRes pluralsRes) {
        }

        setMin() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        setMin(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.length = windowInsetsCompat;
        }

        /* access modifiers changed from: protected */
        public final void length() {
            PluralsRes[] pluralsResArr = this.setMin;
            if (pluralsResArr != null) {
                PluralsRes pluralsRes = pluralsResArr[Type.setMax(1)];
                PluralsRes pluralsRes2 = this.setMin[Type.setMax(2)];
                if (pluralsRes2 == null) {
                    pluralsRes2 = this.length.length(2);
                }
                if (pluralsRes == null) {
                    pluralsRes = this.length.length(1);
                }
                getMin(PluralsRes.length(pluralsRes, pluralsRes2));
                PluralsRes pluralsRes3 = this.setMin[Type.setMax(16)];
                if (pluralsRes3 != null) {
                    setMax(pluralsRes3);
                }
                PluralsRes pluralsRes4 = this.setMin[Type.setMax(32)];
                if (pluralsRes4 != null) {
                    getMax(pluralsRes4);
                }
                PluralsRes pluralsRes5 = this.setMin[Type.setMax(64)];
                if (pluralsRes5 != null) {
                    length(pluralsRes5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public WindowInsetsCompat getMin() {
            length();
            return this.length;
        }
    }

    /* access modifiers changed from: package-private */
    public void getMin(PluralsRes[] pluralsResArr) {
        this.getMin.setMax(pluralsResArr);
    }

    @RequiresApi(api = 20)
    static class getMin extends setMin {
        private static boolean getMax = false;
        private static Field getMin = null;
        private static Constructor<WindowInsets> length = null;
        private static boolean setMax = false;
        private PluralsRes equals;
        private WindowInsets isInside;

        getMin() {
            this.isInside = getMax();
        }

        getMin(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.isInside = windowInsetsCompat.values();
        }

        /* access modifiers changed from: package-private */
        public void getMin(@NonNull PluralsRes pluralsRes) {
            WindowInsets windowInsets = this.isInside;
            if (windowInsets != null) {
                this.isInside = windowInsets.replaceSystemWindowInsets(pluralsRes.setMin, pluralsRes.length, pluralsRes.getMin, pluralsRes.getMax);
            }
        }

        /* access modifiers changed from: package-private */
        public void setMin(@Nullable PluralsRes pluralsRes) {
            this.equals = pluralsRes;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public WindowInsetsCompat getMin() {
            length();
            WindowInsetsCompat min = WindowInsetsCompat.getMin(this.isInside);
            min.getMin(this.setMin);
            min.getMax(this.equals);
            return min;
        }

        @Nullable
        private static WindowInsets getMax() {
            if (!getMax) {
                try {
                    getMin = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                getMax = true;
            }
            Field field = getMin;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!setMax) {
                try {
                    length = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException unused3) {
                }
                setMax = true;
            }
            Constructor<WindowInsets> constructor = length;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void getMax(@Nullable PluralsRes pluralsRes) {
        this.getMin.getMin(pluralsRes);
    }

    @RequiresApi(api = 29)
    static class setMax extends setMin {
        final WindowInsets.Builder length;

        setMax() {
            this.length = new WindowInsets.Builder();
        }

        setMax(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets.Builder builder;
            WindowInsets values = windowInsetsCompat.values();
            if (values != null) {
                builder = new WindowInsets.Builder(values);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.length = builder;
        }

        /* access modifiers changed from: package-private */
        public void getMin(@NonNull PluralsRes pluralsRes) {
            this.length.setSystemWindowInsets(Insets.of(pluralsRes.setMin, pluralsRes.length, pluralsRes.getMin, pluralsRes.getMax));
        }

        /* access modifiers changed from: package-private */
        public void setMax(@NonNull PluralsRes pluralsRes) {
            this.length.setSystemGestureInsets(Insets.of(pluralsRes.setMin, pluralsRes.length, pluralsRes.getMin, pluralsRes.getMax));
        }

        /* access modifiers changed from: package-private */
        public void getMax(@NonNull PluralsRes pluralsRes) {
            this.length.setMandatorySystemGestureInsets(Insets.of(pluralsRes.setMin, pluralsRes.length, pluralsRes.getMin, pluralsRes.getMax));
        }

        /* access modifiers changed from: package-private */
        public void length(@NonNull PluralsRes pluralsRes) {
            this.length.setTappableElementInsets(Insets.of(pluralsRes.setMin, pluralsRes.length, pluralsRes.getMin, pluralsRes.getMax));
        }

        /* access modifiers changed from: package-private */
        public void setMin(@NonNull PluralsRes pluralsRes) {
            this.length.setStableInsets(Insets.of(pluralsRes.setMin, pluralsRes.length, pluralsRes.getMin, pluralsRes.getMax));
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public WindowInsetsCompat getMin() {
            length();
            WindowInsetsCompat min = WindowInsetsCompat.getMin(this.length.build());
            min.getMin(this.setMin);
            return min;
        }
    }

    @RequiresApi(30)
    static class toFloatRange extends setMax {
        toFloatRange() {
        }

        toFloatRange(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    public static final class Type {

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InsetsType {
        }

        public static int getMax() {
            return 1;
        }

        public static int getMin() {
            return 7;
        }

        static int setMax(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=".concat(String.valueOf(i)));
        }
    }

    @RequiresApi(30)
    static final class toDoubleRange {
        static int setMax(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    /* access modifiers changed from: package-private */
    public void getMax(@Nullable WindowInsetsCompat windowInsetsCompat) {
        this.getMin.getMin(windowInsetsCompat);
    }

    /* access modifiers changed from: package-private */
    public void length(@NonNull PluralsRes pluralsRes) {
        this.getMin.length(pluralsRes);
    }

    /* access modifiers changed from: package-private */
    public void length(@NonNull View view) {
        this.getMin.setMin(view);
    }

    @RequiresApi(21)
    static class length {
        private static boolean getMax = true;
        private static Field length;
        private static Field setMax;
        private static Field setMin;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                setMax = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                length = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                setMin = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }

        @Nullable
        public static WindowInsetsCompat setMin(@NonNull View view) {
            if (getMax && view.isAttachedToWindow()) {
                try {
                    Object obj = setMax.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) length.get(obj);
                        Rect rect2 = (Rect) setMin.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            WindowInsetsCompat max = new getMax().setMax(PluralsRes.setMin(rect)).length(PluralsRes.setMin(rect2)).setMax();
                            max.getMax(max);
                            max.length(view.getRootView());
                            return max;
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.getMessage();
                }
            }
            return null;
        }
    }
}
