package o;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import o.INotificationSideChannel;
import o.IResultReceiver;
import o.PlaybackStateCompat;
import o.RemoteActionCompatParcelizer;
import o.read;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
public class cancel extends read implements allOf {
    private static final String getMax = cancel.class.getSimpleName();
    private int getMin;
    private equals length;
    private setMin setMax;
    private int setMin;
    private boolean toIntRange;

    public boolean isStateful() {
        return true;
    }

    @RequiresApi(21)
    public /* bridge */ /* synthetic */ void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @RequiresApi(21)
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @NonNull
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(@NonNull Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @RequiresApi(21)
    public /* bridge */ /* synthetic */ void getOutline(@NonNull Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(@NonNull Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(@NonNull Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(@NonNull PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public cancel() {
        this((setMin) null, (Resources) null);
    }

    cancel(@Nullable setMin setmin, @Nullable Resources resources) {
        super((read.getMin) null);
        this.getMin = -1;
        this.setMin = -1;
        setMax(new setMin(setmin, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static cancel getMin(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            cancel cancel = new cancel();
            cancel.setMin(context, resources, xmlPullParser, attributeSet, theme);
            return cancel;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    public void setMin(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        int[] iArr = RemoteActionCompatParcelizer.getMax.getMax;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        setVisible(typedArray.getBoolean(RemoteActionCompatParcelizer.getMax.setMin, true), true);
        getMax(typedArray);
        getMin(resources);
        typedArray.recycle();
        length(context, resources, xmlPullParser, attributeSet, theme);
        length();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.length != null && (visible || z2)) {
            if (z) {
                this.length.setMin();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        equals equals2 = this.length;
        if (equals2 != null) {
            equals2.getMin();
            this.length = null;
            setMax(this.getMin);
            this.getMin = -1;
            this.setMin = -1;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int max = this.setMax.getMax(iArr);
        boolean z = max != getMin() && (getMin(max) || setMax(max));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    private boolean getMin(int i) {
        int i2;
        int min;
        equals equals2;
        equals equals3 = this.length;
        if (equals3 == null) {
            i2 = getMin();
        } else if (i == this.getMin) {
            return true;
        } else {
            if (i != this.setMin || !equals3.getMax()) {
                i2 = this.getMin;
                equals3.getMin();
            } else {
                equals3.setMax();
                this.getMin = this.setMin;
                this.setMin = i;
                return true;
            }
        }
        this.length = null;
        this.setMin = -1;
        this.getMin = -1;
        setMin setmin = this.setMax;
        int max = setmin.setMax(i2);
        int max2 = setmin.setMax(i);
        if (max2 == 0 || max == 0 || (min = setmin.getMin(max, max2)) < 0) {
            return false;
        }
        boolean length2 = setmin.length(max, max2);
        setMax(min);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            equals2 = new getMax((AnimationDrawable) current, setmin.getMax(max, max2), length2);
        } else if (current instanceof generateOverflowButtonLayoutParams) {
            equals2 = new setMax((generateOverflowButtonLayoutParams) current);
        } else {
            if (current instanceof Animatable) {
                equals2 = new length((Animatable) current);
            }
            return false;
        }
        equals2.setMin();
        this.length = equals2;
        this.setMin = i2;
        this.getMin = i;
        return true;
    }

    static abstract class equals {
        public boolean getMax() {
            return false;
        }

        public abstract void getMin();

        public void setMax() {
        }

        public abstract void setMin();

        private equals() {
        }
    }

    static class length extends equals {
        private final Animatable setMin;

        length(Animatable animatable) {
            super();
            this.setMin = animatable;
        }

        public void setMin() {
            this.setMin.start();
        }

        public void getMin() {
            this.setMin.stop();
        }
    }

    static class getMax extends equals {
        private final boolean getMin;
        private final ObjectAnimator setMin;

        getMax(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            getMin getmin = new getMin(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) getmin.setMin());
            ofInt.setInterpolator(getmin);
            this.getMin = z2;
            this.setMin = ofInt;
        }

        public boolean getMax() {
            return this.getMin;
        }

        public void setMin() {
            this.setMin.start();
        }

        public void setMax() {
            this.setMin.reverse();
        }

        public void getMin() {
            this.setMin.cancel();
        }
    }

    static class setMax extends equals {
        private final generateOverflowButtonLayoutParams length;

        setMax(generateOverflowButtonLayoutParams generateoverflowbuttonlayoutparams) {
            super();
            this.length = generateoverflowbuttonlayoutparams;
        }

        public void setMin() {
            this.length.start();
        }

        public void getMin() {
            this.length.stop();
        }
    }

    private void getMax(TypedArray typedArray) {
        setMin setmin = this.setMax;
        if (Build.VERSION.SDK_INT >= 21) {
            setmin.isInside |= typedArray.getChangingConfigurations();
        }
        setmin.setMax(typedArray.getBoolean(RemoteActionCompatParcelizer.getMax.setMax, setmin.values));
        setmin.getMin(typedArray.getBoolean(RemoteActionCompatParcelizer.getMax.length, setmin.toDoubleRange));
        setmin.getMin(typedArray.getInt(RemoteActionCompatParcelizer.getMax.toFloatRange, setmin.onPostMessage));
        setmin.length(typedArray.getInt(RemoteActionCompatParcelizer.getMax.toIntRange, setmin.extraCallback));
        setDither(typedArray.getBoolean(RemoteActionCompatParcelizer.getMax.getMin, setmin.extraCallbackWithResult));
    }

    private void length() {
        onStateChange(getState());
    }

    private void length(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        setMax(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        getMax(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private int getMax(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        int next;
        int[] iArr = RemoteActionCompatParcelizer.getMax.FastBitmap$CoordinateSystem;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int resourceId = typedArray.getResourceId(RemoteActionCompatParcelizer.getMax.toDoubleRange, -1);
        int resourceId2 = typedArray.getResourceId(RemoteActionCompatParcelizer.getMax.values, -1);
        Drawable drawable = null;
        int resourceId3 = typedArray.getResourceId(RemoteActionCompatParcelizer.getMax.hashCode, -1);
        if (resourceId3 > 0) {
            drawable = getRepeatMode.setMin().getMax(context, resourceId3);
        }
        boolean z = typedArray.getBoolean(RemoteActionCompatParcelizer.getMax.toString, false);
        typedArray.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = generateOverflowButtonLayoutParams.getMax(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawable == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.setMax.setMin(resourceId, resourceId2, drawable, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    private int setMax(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        int next;
        int[] iArr = RemoteActionCompatParcelizer.getMax.equals;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int resourceId = typedArray.getResourceId(RemoteActionCompatParcelizer.getMax.IsOverlapping, 0);
        Drawable drawable = null;
        int resourceId2 = typedArray.getResourceId(RemoteActionCompatParcelizer.getMax.isInside, -1);
        if (resourceId2 > 0) {
            drawable = getRepeatMode.setMin().getMax(context, resourceId2);
        }
        typedArray.recycle();
        int[] length2 = length(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("vector")) {
                drawable = setExpandActivityOverflowButtonContentDescription.length(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawable != null) {
            return this.setMax.getMax(length2, drawable, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(sb2.toString());
    }

    public Drawable mutate() {
        if (!this.toIntRange && super.mutate() == this) {
            this.setMax.getMin();
            this.toIntRange = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: getMax */
    public setMin setMin() {
        return new setMin(this.setMax, this, (Resources) null);
    }

    static class setMin extends read.getMin {
        IResultReceiver.Stub<Integer> length;
        PlaybackStateCompat.ShuffleMode<Long> setMin;

        private static long toIntRange(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        setMin(@Nullable setMin setmin, @NonNull cancel cancel, @Nullable Resources resources) {
            super(setmin, cancel, resources);
            if (setmin != null) {
                this.setMin = setmin.setMin;
                this.length = setmin.length;
                return;
            }
            this.setMin = new PlaybackStateCompat.ShuffleMode<>();
            this.length = new IResultReceiver.Stub<>();
        }

        /* access modifiers changed from: package-private */
        public void getMin() {
            this.setMin = this.setMin.clone();
            this.length = this.length.clone();
        }

        /* access modifiers changed from: package-private */
        public int setMin(int i, int i2, @NonNull Drawable drawable, boolean z) {
            int min = super.setMin(drawable);
            long intRange = toIntRange(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) min;
            this.setMin.length(intRange, Long.valueOf(j2 | j));
            if (z) {
                this.setMin.length(toIntRange(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return min;
        }

        /* access modifiers changed from: package-private */
        public int getMax(@NonNull int[] iArr, @NonNull Drawable drawable, int i) {
            int min = super.getMin(iArr, drawable);
            this.length.setMax(min, Integer.valueOf(i));
            return min;
        }

        /* access modifiers changed from: package-private */
        public int getMax(@NonNull int[] iArr) {
            int min = super.getMin(iArr);
            if (min >= 0) {
                return min;
            }
            return super.getMin(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        public int setMax(int i) {
            if (i < 0) {
                return 0;
            }
            return this.length.getMin(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        public int getMin(int i, int i2) {
            return (int) this.setMin.getMax(toIntRange(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        public boolean getMax(int i, int i2) {
            return (this.setMin.getMax(toIntRange(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean length(int i, int i2) {
            return (this.setMin.getMax(toIntRange(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @NonNull
        public Drawable newDrawable() {
            return new cancel(this, (Resources) null);
        }

        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new cancel(this, resources);
        }
    }

    /* access modifiers changed from: package-private */
    public void setMax(@NonNull INotificationSideChannel.Stub.Proxy.setMin setmin) {
        super.setMax(setmin);
        if (setmin instanceof setMin) {
            this.setMax = (setMin) setmin;
        }
    }

    static class getMin implements TimeInterpolator {
        private int length;
        private int setMax;
        private int[] setMin;

        getMin(AnimationDrawable animationDrawable, boolean z) {
            getMin(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        public int getMin(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.length = numberOfFrames;
            int[] iArr = this.setMin;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.setMin = new int[numberOfFrames];
            }
            int[] iArr2 = this.setMin;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.setMax = i;
            return i;
        }

        /* access modifiers changed from: package-private */
        public int setMin() {
            return this.setMax;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.setMax)) + 0.5f);
            int i2 = this.length;
            int[] iArr = this.setMin;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.setMax) : 0.0f);
        }
    }
}
