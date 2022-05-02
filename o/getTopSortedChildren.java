package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.util.Map;
import o.getTopSortedChildren;

public abstract class getTopSortedChildren<T extends getTopSortedChildren<T>> implements Cloneable {
    @NonNull
    public Map<Class<?>, updatePostLayout<?>> FastBitmap$CoordinateSystem = new onChildViewsChanged();
    private boolean Grayscale$Algorithm = true;
    private boolean ICustomTabsCallback;
    @Nullable
    public Drawable IsOverlapping;
    private boolean Mean$Arithmetic;
    private boolean b;
    private boolean create;
    @NonNull
    public setPivotY equals = resolveAnchoredChildGravity.setMin();
    private boolean getCause = true;
    @NonNull
    public evaluate getMax = evaluate.setMin;
    public int getMin;
    @Nullable
    public Resources.Theme hashCode;
    private int invoke = -1;
    private boolean invokeSuspend = true;
    public int isInside;
    private int length;
    private boolean onMessageChannelReady;
    private boolean onNavigationEvent;
    @Nullable
    public Drawable setMax;
    public float setMin = 1.0f;
    @NonNull
    public Class<?> toDoubleRange = Object.class;
    public int toFloatRange;
    @Nullable
    public Drawable toIntRange;
    @NonNull
    public MotionHelper toString = new MotionHelper();
    private int valueOf = -1;
    @NonNull
    private Priority values = Priority.NORMAL;

    private static boolean getMax(int i, int i2) {
        return (i & i2) != 0;
    }

    @CheckResult
    @NonNull
    public T setMax(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.create) {
            return clone().setMax(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.setMin = f;
        this.length |= 2;
        if (!this.onNavigationEvent) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @CheckResult
    @NonNull
    public T getMin(boolean z) {
        if (this.create) {
            return clone().getMin(z);
        }
        this.onMessageChannelReady = z;
        this.length |= 1048576;
        if (!this.onNavigationEvent) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @CheckResult
    @NonNull
    public T getMax(boolean z) {
        if (this.create) {
            return clone().getMax(z);
        }
        this.ICustomTabsCallback = z;
        this.length |= 524288;
        if (!this.onNavigationEvent) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @CheckResult
    @NonNull
    public T getMin(@NonNull evaluate evaluate) {
        if (this.create) {
            return clone().getMin(evaluate);
        }
        if (evaluate != null) {
            this.getMax = evaluate;
            this.length |= 4;
            if (!this.onNavigationEvent) {
                return this;
            }
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        throw new NullPointerException("Argument must not be null");
    }

    @CheckResult
    @NonNull
    public T length(@NonNull Priority priority) {
        if (this.create) {
            return clone().length(priority);
        }
        if (priority != null) {
            this.values = priority;
            this.length |= 8;
            if (!this.onNavigationEvent) {
                return this;
            }
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        throw new NullPointerException("Argument must not be null");
    }

    @CheckResult
    @NonNull
    public T length(@Nullable Drawable drawable) {
        if (this.create) {
            return clone().length(drawable);
        }
        this.IsOverlapping = drawable;
        int i = this.length | 64;
        this.length = i;
        this.toFloatRange = 0;
        this.length = i & -129;
        if (!this.onNavigationEvent) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @CheckResult
    @NonNull
    public T length(@DrawableRes int i) {
        if (this.create) {
            return clone().length(i);
        }
        this.toFloatRange = i;
        int i2 = this.length | 128;
        this.length = i2;
        this.IsOverlapping = null;
        this.length = i2 & -65;
        if (!this.onNavigationEvent) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @CheckResult
    @NonNull
    public T setMax(@Nullable Drawable drawable) {
        if (this.create) {
            return clone().setMax(drawable);
        }
        this.setMax = drawable;
        int i = this.length | 16;
        this.length = i;
        this.getMin = 0;
        this.length = i & -33;
        if (!this.onNavigationEvent) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @CheckResult
    @NonNull
    public T getMin(@DrawableRes int i) {
        if (this.create) {
            return clone().getMin(i);
        }
        this.getMin = i;
        int i2 = this.length | 32;
        this.length = i2;
        this.setMax = null;
        this.length = i2 & -17;
        if (!this.onNavigationEvent) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @CheckResult
    @NonNull
    public T length(boolean z) {
        if (this.create) {
            return clone().length(true);
        }
        this.Grayscale$Algorithm = !z;
        this.length |= 256;
        if (!this.onNavigationEvent) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @CheckResult
    @NonNull
    public T length(int i, int i2) {
        if (this.create) {
            return clone().length(i, i2);
        }
        this.invoke = i;
        this.valueOf = i2;
        this.length |= 512;
        if (!this.onNavigationEvent) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @CheckResult
    @NonNull
    public T getMax(int i) {
        return length(i, i);
    }

    @CheckResult
    @NonNull
    public T length(@NonNull setPivotY setpivoty) {
        if (this.create) {
            return clone().length(setpivoty);
        }
        if (setpivoty != null) {
            this.equals = setpivoty;
            this.length |= 1024;
            if (!this.onNavigationEvent) {
                return this;
            }
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        throw new NullPointerException("Argument must not be null");
    }

    @CheckResult
    /* renamed from: length */
    public T clone() {
        try {
            T t = (getTopSortedChildren) super.clone();
            MotionHelper motionHelper = new MotionHelper();
            t.toString = motionHelper;
            motionHelper.length.length(this.toString.length);
            onChildViewsChanged onchildviewschanged = new onChildViewsChanged();
            t.FastBitmap$CoordinateSystem = onchildviewschanged;
            onchildviewschanged.putAll(this.FastBitmap$CoordinateSystem);
            t.onNavigationEvent = false;
            t.create = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [o.setTranslationX, java.lang.Object, o.setTranslationX<Y>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T getMin(@androidx.annotation.NonNull o.setTranslationX<Y> r2, @androidx.annotation.NonNull Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.create
            if (r0 == 0) goto L_0x000d
            o.getTopSortedChildren r0 = r1.clone()
            o.getTopSortedChildren r2 = r0.getMin(r2, r3)
            return r2
        L_0x000d:
            java.lang.String r0 = "Argument must not be null"
            if (r2 == 0) goto L_0x002d
            if (r3 == 0) goto L_0x0027
            o.MotionHelper r0 = r1.toString
            o.PlaybackStateCompat<o.setTranslationX<?>, java.lang.Object> r0 = r0.length
            r0.put(r2, r3)
            boolean r2 = r1.onNavigationEvent
            if (r2 != 0) goto L_0x001f
            return r1
        L_0x001f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "You cannot modify locked T, consider clone()"
            r2.<init>(r3)
            throw r2
        L_0x0027:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r0)
            throw r2
        L_0x002d:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTopSortedChildren.getMin(o.setTranslationX, java.lang.Object):o.getTopSortedChildren");
    }

    @CheckResult
    @NonNull
    public T length(@NonNull Class<?> cls) {
        if (this.create) {
            return clone().length(cls);
        }
        if (cls != null) {
            this.toDoubleRange = cls;
            this.length |= 4096;
            if (!this.onNavigationEvent) {
                return this;
            }
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final boolean getMax() {
        return this.invokeSuspend;
    }

    public final boolean getMin() {
        return setMax(2048);
    }

    @CheckResult
    @NonNull
    public T setMin(@NonNull DownsampleStrategy downsampleStrategy) {
        setTranslationX settranslationx = DownsampleStrategy.IsOverlapping;
        if (downsampleStrategy != null) {
            return getMin(settranslationx, downsampleStrategy);
        }
        throw new NullPointerException("Argument must not be null");
    }

    @CheckResult
    @NonNull
    public T toFloatRange() {
        DownsampleStrategy downsampleStrategy = DownsampleStrategy.setMax;
        allowsGoneWidget allowsgonewidget = new allowsGoneWidget();
        if (this.create) {
            getTopSortedChildren length2 = clone();
            while (length2.create) {
                length2 = length2.clone();
            }
            length2.setMin(downsampleStrategy);
            return length2.getMin((updatePostLayout<Bitmap>) allowsgonewidget, false);
        }
        setMin(downsampleStrategy);
        return getMin((updatePostLayout<Bitmap>) allowsgonewidget, false);
    }

    @CheckResult
    @NonNull
    public T toIntRange() {
        T t;
        DownsampleStrategy downsampleStrategy = DownsampleStrategy.setMin;
        removeView removeview = new removeView();
        if (this.create) {
            getTopSortedChildren length2 = clone();
            while (length2.create) {
                length2 = length2.clone();
            }
            length2.setMin(downsampleStrategy);
            t = length2.getMin((updatePostLayout<Bitmap>) removeview, false);
        } else {
            setMin(downsampleStrategy);
            t = getMin((updatePostLayout<Bitmap>) removeview, false);
        }
        t.getCause = true;
        return t;
    }

    @CheckResult
    @NonNull
    public T isInside() {
        T t;
        DownsampleStrategy downsampleStrategy = DownsampleStrategy.setMin;
        removeView removeview = new removeView();
        if (this.create) {
            getTopSortedChildren length2 = clone();
            while (length2.create) {
                length2 = length2.clone();
            }
            length2.setMin(downsampleStrategy);
            t = length2.setMax((updatePostLayout<Bitmap>) removeview);
        } else {
            setMin(downsampleStrategy);
            t = setMax((updatePostLayout<Bitmap>) removeview);
        }
        t.getCause = true;
        return t;
    }

    @CheckResult
    @NonNull
    public T IsOverlapping() {
        T t;
        DownsampleStrategy downsampleStrategy = DownsampleStrategy.getMin;
        getMargin getmargin = new getMargin();
        if (this.create) {
            getTopSortedChildren length2 = clone();
            while (length2.create) {
                length2 = length2.clone();
            }
            length2.setMin(downsampleStrategy);
            t = length2.getMin((updatePostLayout<Bitmap>) getmargin, false);
        } else {
            setMin(downsampleStrategy);
            t = getMin((updatePostLayout<Bitmap>) getmargin, false);
        }
        t.getCause = true;
        return t;
    }

    @CheckResult
    @NonNull
    public T equals() {
        DownsampleStrategy downsampleStrategy = DownsampleStrategy.getMin;
        setDpMargin setdpmargin = new setDpMargin();
        if (this.create) {
            getTopSortedChildren length2 = clone();
            while (length2.create) {
                length2 = length2.clone();
            }
            length2.setMin(downsampleStrategy);
            return length2.setMax((updatePostLayout<Bitmap>) setdpmargin);
        }
        setMin(downsampleStrategy);
        return setMax((updatePostLayout<Bitmap>) setdpmargin);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [o.updatePostLayout, o.updatePostLayout<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T setMax(@androidx.annotation.NonNull o.updatePostLayout<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            o.getTopSortedChildren r2 = r1.getMin((o.updatePostLayout<android.graphics.Bitmap>) r2, (boolean) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTopSortedChildren.setMax(o.updatePostLayout):o.getTopSortedChildren");
    }

    @CheckResult
    @NonNull
    public T getMin(@NonNull updatePostLayout<Bitmap>... updatepostlayoutArr) {
        if (updatepostlayoutArr.length > 1) {
            return getMin((updatePostLayout<Bitmap>) new setScaleX(updatepostlayoutArr), true);
        }
        if (updatepostlayoutArr.length == 1) {
            return setMax((updatePostLayout<Bitmap>) updatepostlayoutArr[0]);
        }
        if (!this.onNavigationEvent) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @CheckResult
    @NonNull
    @Deprecated
    public T length(@NonNull updatePostLayout<Bitmap>... updatepostlayoutArr) {
        return getMin((updatePostLayout<Bitmap>) new setScaleX(updatepostlayoutArr), true);
    }

    @NonNull
    private T getMin(@NonNull updatePostLayout<Bitmap> updatepostlayout, boolean z) {
        getTopSortedChildren gettopsortedchildren = this;
        while (gettopsortedchildren.create) {
            gettopsortedchildren = gettopsortedchildren.clone();
        }
        getReferencedIds getreferencedids = new getReferencedIds(updatepostlayout, z);
        gettopsortedchildren.getMin(Bitmap.class, updatepostlayout, z);
        gettopsortedchildren.getMin(Drawable.class, getreferencedids, z);
        gettopsortedchildren.getMin(BitmapDrawable.class, getreferencedids, z);
        gettopsortedchildren.getMin(getViewWidget.class, new resolveMeasuredDimension(updatepostlayout), z);
        if (!gettopsortedchildren.onNavigationEvent) {
            return gettopsortedchildren;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @NonNull
    private <Y> T getMin(@NonNull Class<Y> cls, @NonNull updatePostLayout<Y> updatepostlayout, boolean z) {
        getTopSortedChildren gettopsortedchildren = this;
        while (gettopsortedchildren.create) {
            gettopsortedchildren = gettopsortedchildren.clone();
        }
        if (updatepostlayout != null) {
            gettopsortedchildren.FastBitmap$CoordinateSystem.put(cls, updatepostlayout);
            int i = gettopsortedchildren.length | 2048;
            gettopsortedchildren.length = i;
            gettopsortedchildren.invokeSuspend = true;
            int i2 = i | 65536;
            gettopsortedchildren.length = i2;
            gettopsortedchildren.getCause = false;
            if (z) {
                gettopsortedchildren.length = i2 | 131072;
                gettopsortedchildren.Mean$Arithmetic = true;
            }
            if (!gettopsortedchildren.onNavigationEvent) {
                return gettopsortedchildren;
            }
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        throw new NullPointerException("Argument must not be null");
    }

    @CheckResult
    @NonNull
    public T FastBitmap$CoordinateSystem() {
        return getMin(getPaddingWidth.length, Boolean.TRUE);
    }

    @CheckResult
    @NonNull
    public T getMin(@NonNull getTopSortedChildren<?> gettopsortedchildren) {
        if (this.create) {
            return clone().getMin(gettopsortedchildren);
        }
        if (getMax(gettopsortedchildren.length, 2)) {
            this.setMin = gettopsortedchildren.setMin;
        }
        if (getMax(gettopsortedchildren.length, 262144)) {
            this.b = gettopsortedchildren.b;
        }
        if (getMax(gettopsortedchildren.length, 1048576)) {
            this.onMessageChannelReady = gettopsortedchildren.onMessageChannelReady;
        }
        if (getMax(gettopsortedchildren.length, 4)) {
            this.getMax = gettopsortedchildren.getMax;
        }
        if (getMax(gettopsortedchildren.length, 8)) {
            this.values = gettopsortedchildren.values;
        }
        if (getMax(gettopsortedchildren.length, 16)) {
            this.setMax = gettopsortedchildren.setMax;
            this.getMin = 0;
            this.length &= -33;
        }
        if (getMax(gettopsortedchildren.length, 32)) {
            this.getMin = gettopsortedchildren.getMin;
            this.setMax = null;
            this.length &= -17;
        }
        if (getMax(gettopsortedchildren.length, 64)) {
            this.IsOverlapping = gettopsortedchildren.IsOverlapping;
            this.toFloatRange = 0;
            this.length &= -129;
        }
        if (getMax(gettopsortedchildren.length, 128)) {
            this.toFloatRange = gettopsortedchildren.toFloatRange;
            this.IsOverlapping = null;
            this.length &= -65;
        }
        if (getMax(gettopsortedchildren.length, 256)) {
            this.Grayscale$Algorithm = gettopsortedchildren.Grayscale$Algorithm;
        }
        if (getMax(gettopsortedchildren.length, 512)) {
            this.invoke = gettopsortedchildren.invoke;
            this.valueOf = gettopsortedchildren.valueOf;
        }
        if (getMax(gettopsortedchildren.length, 1024)) {
            this.equals = gettopsortedchildren.equals;
        }
        if (getMax(gettopsortedchildren.length, 4096)) {
            this.toDoubleRange = gettopsortedchildren.toDoubleRange;
        }
        if (getMax(gettopsortedchildren.length, 8192)) {
            this.toIntRange = gettopsortedchildren.toIntRange;
            this.isInside = 0;
            this.length &= -16385;
        }
        if (getMax(gettopsortedchildren.length, 16384)) {
            this.isInside = gettopsortedchildren.isInside;
            this.toIntRange = null;
            this.length &= -8193;
        }
        if (getMax(gettopsortedchildren.length, 32768)) {
            this.hashCode = gettopsortedchildren.hashCode;
        }
        if (getMax(gettopsortedchildren.length, 65536)) {
            this.invokeSuspend = gettopsortedchildren.invokeSuspend;
        }
        if (getMax(gettopsortedchildren.length, 131072)) {
            this.Mean$Arithmetic = gettopsortedchildren.Mean$Arithmetic;
        }
        if (getMax(gettopsortedchildren.length, 2048)) {
            this.FastBitmap$CoordinateSystem.putAll(gettopsortedchildren.FastBitmap$CoordinateSystem);
            this.getCause = gettopsortedchildren.getCause;
        }
        if (getMax(gettopsortedchildren.length, 524288)) {
            this.ICustomTabsCallback = gettopsortedchildren.ICustomTabsCallback;
        }
        if (!this.invokeSuspend) {
            this.FastBitmap$CoordinateSystem.clear();
            int i = this.length & -2049;
            this.length = i;
            this.Mean$Arithmetic = false;
            this.length = i & -131073;
            this.getCause = true;
        }
        this.length |= gettopsortedchildren.length;
        this.toString.length.length(gettopsortedchildren.toString.length);
        if (!this.onNavigationEvent) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public boolean equals(Object obj) {
        if (obj instanceof getTopSortedChildren) {
            getTopSortedChildren gettopsortedchildren = (getTopSortedChildren) obj;
            if (Float.compare(gettopsortedchildren.setMin, this.setMin) == 0 && this.getMin == gettopsortedchildren.getMin && getDependents.setMin(this.setMax, gettopsortedchildren.setMax) && this.toFloatRange == gettopsortedchildren.toFloatRange && getDependents.setMin(this.IsOverlapping, gettopsortedchildren.IsOverlapping) && this.isInside == gettopsortedchildren.isInside && getDependents.setMin(this.toIntRange, gettopsortedchildren.toIntRange) && this.Grayscale$Algorithm == gettopsortedchildren.Grayscale$Algorithm && this.valueOf == gettopsortedchildren.valueOf && this.invoke == gettopsortedchildren.invoke && this.Mean$Arithmetic == gettopsortedchildren.Mean$Arithmetic && this.invokeSuspend == gettopsortedchildren.invokeSuspend && this.b == gettopsortedchildren.b && this.ICustomTabsCallback == gettopsortedchildren.ICustomTabsCallback && this.getMax.equals(gettopsortedchildren.getMax) && this.values == gettopsortedchildren.values && this.toString.equals(gettopsortedchildren.toString) && this.FastBitmap$CoordinateSystem.equals(gettopsortedchildren.FastBitmap$CoordinateSystem) && this.toDoubleRange.equals(gettopsortedchildren.toDoubleRange) && getDependents.setMin(this.equals, gettopsortedchildren.equals) && getDependents.setMin(this.hashCode, gettopsortedchildren.hashCode)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return getDependents.length((Object) this.hashCode, getDependents.length((Object) this.equals, getDependents.length((Object) this.toDoubleRange, getDependents.length((Object) this.FastBitmap$CoordinateSystem, getDependents.length((Object) this.toString, getDependents.length((Object) this.values, getDependents.length((Object) this.getMax, getDependents.getMax(this.ICustomTabsCallback, getDependents.getMax(this.b, getDependents.getMax(this.invokeSuspend, getDependents.getMax(this.Mean$Arithmetic, getDependents.setMax(this.invoke, getDependents.setMax(this.valueOf, getDependents.getMax(this.Grayscale$Algorithm, getDependents.length((Object) this.toIntRange, getDependents.setMax(this.isInside, getDependents.length((Object) this.IsOverlapping, getDependents.setMax(this.toFloatRange, getDependents.length((Object) this.setMax, getDependents.setMax(this.getMin, getDependents.getMax(this.setMin)))))))))))))))))))));
    }

    @NonNull
    public T values() {
        this.onNavigationEvent = true;
        return this;
    }

    @NonNull
    public T toDoubleRange() {
        if (!this.onNavigationEvent || this.create) {
            this.create = true;
            return values();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    public final boolean valueOf() {
        return this.Mean$Arithmetic;
    }

    public final boolean invoke() {
        return this.Grayscale$Algorithm;
    }

    public final boolean invokeSuspend() {
        return setMax(8);
    }

    @NonNull
    public final Priority Grayscale$Algorithm() {
        return this.values;
    }

    public final int Mean$Arithmetic() {
        return this.invoke;
    }

    public final boolean ICustomTabsCallback() {
        return getDependents.length(this.invoke, this.valueOf);
    }

    public final int create() {
        return this.valueOf;
    }

    public final boolean onNavigationEvent() {
        return this.getCause;
    }

    private boolean setMax(int i) {
        return getMax(this.length, i);
    }

    public final boolean getCause() {
        return this.b;
    }

    public final boolean b() {
        return this.onMessageChannelReady;
    }

    public final boolean extraCallback() {
        return this.ICustomTabsCallback;
    }
}
