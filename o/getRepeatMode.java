package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o.IResultReceiver;
import o.PlaybackStateCompat;
import o.RemoteActionCompatParcelizer;
import o.RequiresPermission;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class getRepeatMode {
    private static final PorterDuff.Mode getMax = PorterDuff.Mode.SRC_IN;
    private static getRepeatMode getMin;
    private static final getMin length = new getMin();
    private TypedValue IsOverlapping;
    private boolean equals;
    private isInside isInside;
    private PlaybackStateCompat.RepeatMode<String, length> setMax;
    private WeakHashMap<Context, IResultReceiver.Stub<ColorStateList>> setMin;
    private IResultReceiver.Stub<String> toFloatRange;
    private final WeakHashMap<Context, PlaybackStateCompat.ShuffleMode<WeakReference<Drawable.ConstantState>>> toIntRange = new WeakHashMap<>(0);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface isInside {
        boolean getMax(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable);

        @Nullable
        ColorStateList getMin(@NonNull Context context, @DrawableRes int i);

        @Nullable
        PorterDuff.Mode length(int i);

        @Nullable
        Drawable setMax(@NonNull getRepeatMode getrepeatmode, @NonNull Context context, @DrawableRes int i);

        boolean setMax(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable);
    }

    interface length {
        Drawable length(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    public static synchronized getRepeatMode setMin() {
        getRepeatMode getrepeatmode;
        synchronized (getRepeatMode.class) {
            if (getMin == null) {
                getRepeatMode getrepeatmode2 = new getRepeatMode();
                getMin = getrepeatmode2;
                if (Build.VERSION.SDK_INT < 24) {
                    equals equals2 = new equals();
                    if (getrepeatmode2.setMax == null) {
                        getrepeatmode2.setMax = new PlaybackStateCompat.RepeatMode<>();
                    }
                    getrepeatmode2.setMax.put("vector", equals2);
                    setMin setmin = new setMin();
                    if (getrepeatmode2.setMax == null) {
                        getrepeatmode2.setMax = new PlaybackStateCompat.RepeatMode<>();
                    }
                    getrepeatmode2.setMax.put("animated-vector", setmin);
                    setMax setmax = new setMax();
                    if (getrepeatmode2.setMax == null) {
                        getrepeatmode2.setMax = new PlaybackStateCompat.RepeatMode<>();
                    }
                    getrepeatmode2.setMax.put("animated-selector", setmax);
                    getMax getmax = new getMax();
                    if (getrepeatmode2.setMax == null) {
                        getrepeatmode2.setMax = new PlaybackStateCompat.RepeatMode<>();
                    }
                    getrepeatmode2.setMax.put("drawable", getmax);
                }
            }
            getrepeatmode = getMin;
        }
        return getrepeatmode;
    }

    public final synchronized void getMin(isInside isinside) {
        this.isInside = isinside;
    }

    public final synchronized Drawable getMax(@NonNull Context context, @DrawableRes int i) {
        return getMax(context, i, false);
    }

    public final synchronized void getMin(@NonNull Context context) {
        PlaybackStateCompat.ShuffleMode shuffleMode = this.toIntRange.get(context);
        if (shuffleMode != null) {
            shuffleMode.setMin();
        }
    }

    private Drawable setMin(@NonNull Context context, @DrawableRes int i, boolean z, @NonNull Drawable drawable) {
        ColorStateList min = getMin(context, i);
        PorterDuff.Mode mode = null;
        if (min != null) {
            if (adjustVolume.setMin(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable intRange = RequiresPermission.Read.toIntRange(drawable);
            RequiresPermission.Read.setMin(intRange, min);
            isInside isinside = this.isInside;
            if (isinside != null) {
                mode = isinside.length(i);
            }
            if (mode == null) {
                return intRange;
            }
            RequiresPermission.Read.setMin(intRange, mode);
            return intRange;
        }
        isInside isinside2 = this.isInside;
        if ((isinside2 == null || !isinside2.getMax(context, i, drawable)) && !length(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    private Drawable setMin(@NonNull Context context, @DrawableRes int i) {
        int next;
        PlaybackStateCompat.RepeatMode<String, length> repeatMode = this.setMax;
        if (repeatMode == null || repeatMode.isEmpty()) {
            return null;
        }
        IResultReceiver.Stub<String> stub = this.toFloatRange;
        if (stub != null) {
            String min = stub.setMin(i);
            if ("appcompat_skip_skip".equals(min) || (min != null && this.setMax.get(min) == null)) {
                return null;
            }
        } else {
            this.toFloatRange = new IResultReceiver.Stub<>();
        }
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new TypedValue();
        }
        TypedValue typedValue = this.IsOverlapping;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable min2 = setMin(context, j);
        if (min2 != null) {
            return min2;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.toFloatRange.setMin(i, name);
                    length length2 = this.setMax.get(name);
                    if (length2 != null) {
                        min2 = length2.length(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (min2 != null) {
                        min2.setChangingConfigurations(typedValue.changingConfigurations);
                        length(context, j, min2);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception unused) {
            }
        }
        if (min2 == null) {
            this.toFloatRange.setMin(i, "appcompat_skip_skip");
        }
        return min2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable setMin(@androidx.annotation.NonNull android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, o.PlaybackStateCompat$ShuffleMode<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.toIntRange     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            o.PlaybackStateCompat$ShuffleMode r0 = (o.PlaybackStateCompat.ShuffleMode) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.getMax(r5, r1)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.getMin((long) r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRepeatMode.setMin(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private synchronized boolean length(@NonNull Context context, long j, @NonNull Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        PlaybackStateCompat.ShuffleMode shuffleMode = this.toIntRange.get(context);
        if (shuffleMode == null) {
            shuffleMode = new PlaybackStateCompat.ShuffleMode();
            this.toIntRange.put(context, shuffleMode);
        }
        shuffleMode.setMax(j, new WeakReference(constantState));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Drawable getMax(@NonNull Context context, @NonNull playFromMediaId playfrommediaid, @DrawableRes int i) {
        Drawable min = setMin(context, i);
        if (min == null) {
            min = playfrommediaid.length(i);
        }
        if (min == null) {
            return null;
        }
        return setMin(context, i, false, min);
    }

    /* access modifiers changed from: package-private */
    public final boolean length(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable) {
        isInside isinside = this.isInside;
        return isinside != null && isinside.setMax(context, i, drawable);
    }

    static class getMin extends PlaybackStateCompat.ErrorCode<Integer, PorterDuffColorFilter> {
        public getMin() {
            super(6);
        }

        static int getMax(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    static void setMax(Drawable drawable, addQueueItemAt addqueueitemat, int[] iArr) {
        if (!adjustVolume.setMin(drawable) || drawable.mutate() == drawable) {
            if (addqueueitemat.setMin || addqueueitemat.getMin) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = addqueueitemat.setMin ? addqueueitemat.getMax : null;
                PorterDuff.Mode mode = addqueueitemat.getMin ? addqueueitemat.length : getMax;
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = setMin(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public static synchronized PorterDuffColorFilter setMin(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (getRepeatMode.class) {
            porterDuffColorFilter = (PorterDuffColorFilter) length.get(Integer.valueOf(getMin.getMax(i, mode)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                length.put(Integer.valueOf(getMin.getMax(i, mode)), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    private static boolean length(@NonNull Drawable drawable) {
        return (drawable instanceof setExpandActivityOverflowButtonContentDescription) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    static class equals implements length {
        equals() {
        }

        public final Drawable length(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return setExpandActivityOverflowButtonContentDescription.length(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static class setMin implements length {
        setMin() {
        }

        public final Drawable length(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return generateOverflowButtonLayoutParams.getMax(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static class setMax implements length {
        setMax() {
        }

        public final Drawable length(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return cancel.getMin(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static class getMax implements length {
        getMax() {
        }

        public final Drawable length(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) getMax.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized Drawable getMax(@NonNull Context context, @DrawableRes int i, boolean z) {
        Drawable min;
        if (!this.equals) {
            this.equals = true;
            Drawable max = getMax(context, RemoteActionCompatParcelizer.setMin.getMax);
            if (max == null || !length(max)) {
                this.equals = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        min = setMin(context, i);
        if (min == null) {
            if (this.IsOverlapping == null) {
                this.IsOverlapping = new TypedValue();
            }
            TypedValue typedValue = this.IsOverlapping;
            context.getResources().getValue(i, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            Drawable min2 = setMin(context, j);
            if (min2 == null) {
                if (this.isInside == null) {
                    min2 = null;
                } else {
                    min2 = this.isInside.setMax(this, context, i);
                }
                if (min2 != null) {
                    min2.setChangingConfigurations(typedValue.changingConfigurations);
                    length(context, j, min2);
                }
            }
            min = min2;
        }
        if (min == null) {
            min = IntRange.length(context, i);
        }
        if (min != null) {
            min = setMin(context, i, z, min);
        }
        if (min != null) {
            adjustVolume.length(min);
        }
        return min;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r3.setMin.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList getMin(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.DrawableRes int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, o.IResultReceiver$Stub<android.content.res.ColorStateList>> r0 = r3.setMin     // Catch:{ all -> 0x004c }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.util.WeakHashMap<android.content.Context, o.IResultReceiver$Stub<android.content.res.ColorStateList>> r0 = r3.setMin     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004c }
            o.IResultReceiver$Stub r0 = (o.IResultReceiver.Stub) r0     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.setMin(r5)     // Catch:{ all -> 0x004c }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x004c }
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 != 0) goto L_0x004a
            o.getRepeatMode$isInside r0 = r3.isInside     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            o.getRepeatMode$isInside r0 = r3.isInside     // Catch:{ all -> 0x004c }
            android.content.res.ColorStateList r1 = r0.getMin(r4, r5)     // Catch:{ all -> 0x004c }
        L_0x0025:
            if (r1 == 0) goto L_0x0049
            java.util.WeakHashMap<android.content.Context, o.IResultReceiver$Stub<android.content.res.ColorStateList>> r0 = r3.setMin     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0032
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x004c }
            r0.<init>()     // Catch:{ all -> 0x004c }
            r3.setMin = r0     // Catch:{ all -> 0x004c }
        L_0x0032:
            java.util.WeakHashMap<android.content.Context, o.IResultReceiver$Stub<android.content.res.ColorStateList>> r0 = r3.setMin     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004c }
            o.IResultReceiver$Stub r0 = (o.IResultReceiver.Stub) r0     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0046
            o.IResultReceiver$Stub r0 = new o.IResultReceiver$Stub     // Catch:{ all -> 0x004c }
            r0.<init>()     // Catch:{ all -> 0x004c }
            java.util.WeakHashMap<android.content.Context, o.IResultReceiver$Stub<android.content.res.ColorStateList>> r2 = r3.setMin     // Catch:{ all -> 0x004c }
            r2.put(r4, r0)     // Catch:{ all -> 0x004c }
        L_0x0046:
            r0.setMin(r5, r1)     // Catch:{ all -> 0x004c }
        L_0x0049:
            r0 = r1
        L_0x004a:
            monitor-exit(r3)
            return r0
        L_0x004c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRepeatMode.getMin(android.content.Context, int):android.content.res.ColorStateList");
    }
}
