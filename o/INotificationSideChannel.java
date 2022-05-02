package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import o.ITrustedWebActivityCallback;
import o.IconCompatParcelizer;
import o.MediaMetadataCompat;
import o.RequiresPermission;
import o.onEvent;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class INotificationSideChannel {
    @NonNull
    private final Deque<WeakReference<XmlPullParser>> length = new ArrayDeque();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class Stub extends Drawable implements Drawable.Callback {
        private Drawable mDrawable;

        public Stub(Drawable drawable) {
            setWrappedDrawable(drawable);
        }

        public void draw(Canvas canvas) {
            this.mDrawable.draw(canvas);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        class Proxy extends Drawable implements Drawable.Callback {
            private int IsOverlapping = -1;
            private long equals;
            private Drawable getMax;
            private Drawable getMin;
            private long hashCode;
            private boolean isInside;
            private int length = 255;
            private Rect setMax;
            private setMin setMin;
            private boolean toFloatRange;
            private Runnable toIntRange;
            private length toString;

            Proxy() {
            }

            public void draw(@NonNull Canvas canvas) {
                Drawable drawable = this.getMax;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                Drawable drawable2 = this.getMin;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
            }

            public int getChangingConfigurations() {
                return super.getChangingConfigurations() | this.setMin.getChangingConfigurations();
            }

            private boolean setMin() {
                return isAutoMirrored() && RequiresPermission.Read.isInside(this) == 1;
            }

            public boolean getPadding(@NonNull Rect rect) {
                boolean z;
                Rect max = this.setMin.setMax();
                if (max != null) {
                    rect.set(max);
                    z = (max.right | ((max.left | max.top) | max.bottom)) != 0;
                } else {
                    Drawable drawable = this.getMax;
                    if (drawable != null) {
                        z = drawable.getPadding(rect);
                    } else {
                        z = super.getPadding(rect);
                    }
                }
                if (setMin()) {
                    int i = rect.left;
                    rect.left = rect.right;
                    rect.right = i;
                }
                return z;
            }

            @RequiresApi(21)
            public void getOutline(@NonNull Outline outline) {
                Drawable drawable = this.getMax;
                if (drawable != null) {
                    getMin.getMin(drawable, outline);
                }
            }

            public void setAlpha(int i) {
                if (!this.isInside || this.length != i) {
                    this.isInside = true;
                    this.length = i;
                    Drawable drawable = this.getMax;
                    if (drawable == null) {
                        return;
                    }
                    if (this.equals == 0) {
                        drawable.setAlpha(i);
                    } else {
                        setMax(false);
                    }
                }
            }

            public int getAlpha() {
                return this.length;
            }

            public void setDither(boolean z) {
                if (this.setMin.extraCallbackWithResult != z) {
                    this.setMin.extraCallbackWithResult = z;
                    Drawable drawable = this.getMax;
                    if (drawable != null) {
                        drawable.setDither(this.setMin.extraCallbackWithResult);
                    }
                }
            }

            public void setColorFilter(ColorFilter colorFilter) {
                this.setMin.onTransact = true;
                if (this.setMin.ICustomTabsCallback$Stub != colorFilter) {
                    this.setMin.ICustomTabsCallback$Stub = colorFilter;
                    Drawable drawable = this.getMax;
                    if (drawable != null) {
                        drawable.setColorFilter(colorFilter);
                    }
                }
            }

            public void setTintList(ColorStateList colorStateList) {
                this.setMin.setDefaultImpl = true;
                if (this.setMin.asBinder != colorStateList) {
                    this.setMin.asBinder = colorStateList;
                    RequiresPermission.Read.setMin(this.getMax, colorStateList);
                }
            }

            public void setTintMode(@NonNull PorterDuff.Mode mode) {
                this.setMin.getInterfaceDescriptor = true;
                if (this.setMin.ICustomTabsCallback$Default != mode) {
                    this.setMin.ICustomTabsCallback$Default = mode;
                    RequiresPermission.Read.setMin(this.getMax, mode);
                }
            }

            /* access modifiers changed from: protected */
            public void onBoundsChange(Rect rect) {
                Drawable drawable = this.getMin;
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                Drawable drawable2 = this.getMax;
                if (drawable2 != null) {
                    drawable2.setBounds(rect);
                }
            }

            public boolean isStateful() {
                return this.setMin.values();
            }

            public void setAutoMirrored(boolean z) {
                if (this.setMin.asInterface != z) {
                    this.setMin.asInterface = z;
                    Drawable drawable = this.getMax;
                    if (drawable != null) {
                        RequiresPermission.Read.getMin(drawable, this.setMin.asInterface);
                    }
                }
            }

            public boolean isAutoMirrored() {
                return this.setMin.asInterface;
            }

            public void jumpToCurrentState() {
                boolean z;
                Drawable drawable = this.getMin;
                boolean z2 = true;
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                    this.getMin = null;
                    z = true;
                } else {
                    z = false;
                }
                Drawable drawable2 = this.getMax;
                if (drawable2 != null) {
                    drawable2.jumpToCurrentState();
                    if (this.isInside) {
                        this.getMax.setAlpha(this.length);
                    }
                }
                if (this.hashCode != 0) {
                    this.hashCode = 0;
                    z = true;
                }
                if (this.equals != 0) {
                    this.equals = 0;
                } else {
                    z2 = z;
                }
                if (z2) {
                    invalidateSelf();
                }
            }

            public void setHotspot(float f, float f2) {
                Drawable drawable = this.getMax;
                if (drawable != null) {
                    RequiresPermission.Read.getMax(drawable, f, f2);
                }
            }

            public void setHotspotBounds(int i, int i2, int i3, int i4) {
                Rect rect = this.setMax;
                if (rect == null) {
                    this.setMax = new Rect(i, i2, i3, i4);
                } else {
                    rect.set(i, i2, i3, i4);
                }
                Drawable drawable = this.getMax;
                if (drawable != null) {
                    RequiresPermission.Read.setMin(drawable, i, i2, i3, i4);
                }
            }

            public void getHotspotBounds(@NonNull Rect rect) {
                Rect rect2 = this.setMax;
                if (rect2 != null) {
                    rect.set(rect2);
                } else {
                    super.getHotspotBounds(rect);
                }
            }

            /* access modifiers changed from: protected */
            public boolean onStateChange(int[] iArr) {
                Drawable drawable = this.getMin;
                if (drawable != null) {
                    return drawable.setState(iArr);
                }
                Drawable drawable2 = this.getMax;
                if (drawable2 != null) {
                    return drawable2.setState(iArr);
                }
                return false;
            }

            /* access modifiers changed from: protected */
            public boolean onLevelChange(int i) {
                Drawable drawable = this.getMin;
                if (drawable != null) {
                    return drawable.setLevel(i);
                }
                Drawable drawable2 = this.getMax;
                if (drawable2 != null) {
                    return drawable2.setLevel(i);
                }
                return false;
            }

            public boolean onLayoutDirectionChanged(int i) {
                return this.setMin.setMin(i, getMin());
            }

            public int getIntrinsicWidth() {
                if (this.setMin.IsOverlapping()) {
                    return this.setMin.equals();
                }
                Drawable drawable = this.getMax;
                if (drawable != null) {
                    return drawable.getIntrinsicWidth();
                }
                return -1;
            }

            public int getIntrinsicHeight() {
                if (this.setMin.IsOverlapping()) {
                    return this.setMin.isInside();
                }
                Drawable drawable = this.getMax;
                if (drawable != null) {
                    return drawable.getIntrinsicHeight();
                }
                return -1;
            }

            public int getMinimumWidth() {
                if (this.setMin.IsOverlapping()) {
                    return this.setMin.toFloatRange();
                }
                Drawable drawable = this.getMax;
                if (drawable != null) {
                    return drawable.getMinimumWidth();
                }
                return 0;
            }

            public int getMinimumHeight() {
                if (this.setMin.IsOverlapping()) {
                    return this.setMin.toIntRange();
                }
                Drawable drawable = this.getMax;
                if (drawable != null) {
                    return drawable.getMinimumHeight();
                }
                return 0;
            }

            public void invalidateDrawable(@NonNull Drawable drawable) {
                setMin setmin = this.setMin;
                if (setmin != null) {
                    setmin.getMax();
                }
                if (drawable == this.getMax && getCallback() != null) {
                    getCallback().invalidateDrawable(this);
                }
            }

            public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
                if (drawable == this.getMax && getCallback() != null) {
                    getCallback().scheduleDrawable(this, runnable, j);
                }
            }

            public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
                if (drawable == this.getMax && getCallback() != null) {
                    getCallback().unscheduleDrawable(this, runnable);
                }
            }

            public boolean setVisible(boolean z, boolean z2) {
                boolean visible = super.setVisible(z, z2);
                Drawable drawable = this.getMin;
                if (drawable != null) {
                    drawable.setVisible(z, z2);
                }
                Drawable drawable2 = this.getMax;
                if (drawable2 != null) {
                    drawable2.setVisible(z, z2);
                }
                return visible;
            }

            public int getOpacity() {
                Drawable drawable = this.getMax;
                if (drawable == null || !drawable.isVisible()) {
                    return -2;
                }
                return this.setMin.toDoubleRange();
            }

            /* access modifiers changed from: package-private */
            public int getMin() {
                return this.IsOverlapping;
            }

            /* access modifiers changed from: package-private */
            public boolean setMax(int i) {
                if (i == this.IsOverlapping) {
                    return false;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.setMin.extraCallback > 0) {
                    Drawable drawable = this.getMin;
                    if (drawable != null) {
                        drawable.setVisible(false, false);
                    }
                    Drawable drawable2 = this.getMax;
                    if (drawable2 != null) {
                        this.getMin = drawable2;
                        this.hashCode = ((long) this.setMin.extraCallback) + uptimeMillis;
                    } else {
                        this.getMin = null;
                        this.hashCode = 0;
                    }
                } else {
                    Drawable drawable3 = this.getMax;
                    if (drawable3 != null) {
                        drawable3.setVisible(false, false);
                    }
                }
                if (i < 0 || i >= this.setMin.toFloatRange) {
                    this.getMax = null;
                    this.IsOverlapping = -1;
                } else {
                    Drawable min = this.setMin.setMin(i);
                    this.getMax = min;
                    this.IsOverlapping = i;
                    if (min != null) {
                        if (this.setMin.onPostMessage > 0) {
                            this.equals = uptimeMillis + ((long) this.setMin.onPostMessage);
                        }
                        setMax(min);
                    }
                }
                if (!(this.equals == 0 && this.hashCode == 0)) {
                    Runnable runnable = this.toIntRange;
                    if (runnable == null) {
                        this.toIntRange = new Runnable() {
                            public final void run() {
                                Proxy.this.setMax(true);
                                Proxy.this.invalidateSelf();
                            }
                        };
                    } else {
                        unscheduleSelf(runnable);
                    }
                    setMax(true);
                }
                invalidateSelf();
                return true;
            }

            private void setMax(Drawable drawable) {
                if (this.toString == null) {
                    this.toString = new length();
                }
                length length2 = this.toString;
                length2.getMin = drawable.getCallback();
                drawable.setCallback(length2);
                try {
                    if (this.setMin.onPostMessage <= 0 && this.isInside) {
                        drawable.setAlpha(this.length);
                    }
                    if (this.setMin.onTransact) {
                        drawable.setColorFilter(this.setMin.ICustomTabsCallback$Stub);
                    } else {
                        if (this.setMin.setDefaultImpl) {
                            RequiresPermission.Read.setMin(drawable, this.setMin.asBinder);
                        }
                        if (this.setMin.getInterfaceDescriptor) {
                            RequiresPermission.Read.setMin(drawable, this.setMin.ICustomTabsCallback$Default);
                        }
                    }
                    drawable.setVisible(isVisible(), true);
                    drawable.setDither(this.setMin.extraCallbackWithResult);
                    drawable.setState(getState());
                    drawable.setLevel(getLevel());
                    drawable.setBounds(getBounds());
                    if (Build.VERSION.SDK_INT >= 23) {
                        RequiresPermission.Read.setMax(drawable, RequiresPermission.Read.isInside(this));
                    }
                    if (Build.VERSION.SDK_INT >= 19) {
                        RequiresPermission.Read.getMin(drawable, this.setMin.asInterface);
                    }
                    Rect rect = this.setMax;
                    if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                        RequiresPermission.Read.setMin(drawable, rect.left, rect.top, rect.right, rect.bottom);
                    }
                } finally {
                    length length3 = this.toString;
                    Drawable.Callback callback = length3.getMin;
                    length3.getMin = null;
                    drawable.setCallback(callback);
                }
            }

            /* access modifiers changed from: package-private */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void setMax(boolean r14) {
                /*
                    r13 = this;
                    r0 = 1
                    r13.isInside = r0
                    long r1 = android.os.SystemClock.uptimeMillis()
                    android.graphics.drawable.Drawable r3 = r13.getMax
                    r4 = 255(0xff, double:1.26E-321)
                    r6 = 0
                    r7 = 0
                    if (r3 == 0) goto L_0x0038
                    long r9 = r13.equals
                    int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                    if (r11 == 0) goto L_0x003a
                    int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                    if (r11 > 0) goto L_0x0020
                    int r9 = r13.length
                    r3.setAlpha(r9)
                    goto L_0x0038
                L_0x0020:
                    long r9 = r9 - r1
                    long r9 = r9 * r4
                    int r3 = (int) r9
                    o.INotificationSideChannel$Stub$Proxy$setMin r9 = r13.setMin
                    int r9 = r9.onPostMessage
                    int r3 = r3 / r9
                    android.graphics.drawable.Drawable r9 = r13.getMax
                    int r3 = 255 - r3
                    int r10 = r13.length
                    int r3 = r3 * r10
                    int r3 = r3 / 255
                    r9.setAlpha(r3)
                    r3 = 1
                    goto L_0x003b
                L_0x0038:
                    r13.equals = r7
                L_0x003a:
                    r3 = 0
                L_0x003b:
                    android.graphics.drawable.Drawable r9 = r13.getMin
                    if (r9 == 0) goto L_0x0065
                    long r10 = r13.hashCode
                    int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                    if (r12 == 0) goto L_0x0067
                    int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                    if (r12 > 0) goto L_0x0050
                    r9.setVisible(r6, r6)
                    r0 = 0
                    r13.getMin = r0
                    goto L_0x0065
                L_0x0050:
                    long r10 = r10 - r1
                    long r10 = r10 * r4
                    int r3 = (int) r10
                    o.INotificationSideChannel$Stub$Proxy$setMin r4 = r13.setMin
                    int r4 = r4.extraCallback
                    int r3 = r3 / r4
                    android.graphics.drawable.Drawable r4 = r13.getMin
                    int r5 = r13.length
                    int r3 = r3 * r5
                    int r3 = r3 / 255
                    r4.setAlpha(r3)
                    goto L_0x0068
                L_0x0065:
                    r13.hashCode = r7
                L_0x0067:
                    r0 = r3
                L_0x0068:
                    if (r14 == 0) goto L_0x0074
                    if (r0 == 0) goto L_0x0074
                    java.lang.Runnable r14 = r13.toIntRange
                    r3 = 16
                    long r1 = r1 + r3
                    r13.scheduleSelf(r14, r1)
                L_0x0074:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.INotificationSideChannel.Stub.Proxy.setMax(boolean):void");
            }

            @NonNull
            public Drawable getCurrent() {
                return this.getMax;
            }

            /* access modifiers changed from: package-private */
            public final void getMin(Resources resources) {
                this.setMin.length(resources);
            }

            @RequiresApi(21)
            public void applyTheme(@NonNull Resources.Theme theme) {
                this.setMin.getMax(theme);
            }

            @RequiresApi(21)
            public boolean canApplyTheme() {
                return this.setMin.canApplyTheme();
            }

            public final Drawable.ConstantState getConstantState() {
                if (!this.setMin.Mean$Arithmetic()) {
                    return null;
                }
                this.setMin.isInside = getChangingConfigurations();
                return this.setMin;
            }

            public Drawable mutate() {
                if (!this.toFloatRange && super.mutate() == this) {
                    setMin max = setMax();
                    max.getMin();
                    setMax(max);
                    this.toFloatRange = true;
                }
                return this;
            }

            /* access modifiers changed from: package-private */
            public setMin setMax() {
                return this.setMin;
            }

            static abstract class setMin extends Drawable.ConstantState {
                boolean FastBitmap$CoordinateSystem;
                boolean Grayscale$Algorithm;
                boolean ICustomTabsCallback;
                PorterDuff.Mode ICustomTabsCallback$Default;
                ColorFilter ICustomTabsCallback$Stub;
                SparseArray<Drawable.ConstantState> IsOverlapping;
                int Mean$Arithmetic;
                ColorStateList asBinder;
                boolean asInterface;
                boolean b;
                int create;
                int equals;
                int extraCallback = 0;
                boolean extraCallbackWithResult = true;
                boolean getCause;
                boolean getInterfaceDescriptor;
                final Proxy getMax;
                Resources getMin;
                Rect hashCode;
                int invoke;
                int invokeSuspend;
                int isInside;
                int onMessageChannelReady;
                boolean onNavigationEvent;
                int onPostMessage = 0;
                boolean onRelationshipValidationResult;
                boolean onTransact;
                boolean setDefaultImpl;
                int setMax;
                boolean toDoubleRange = false;
                int toFloatRange;
                Drawable[] toIntRange;
                boolean toString;
                int valueOf;
                boolean values = false;

                setMin(setMin setmin, Proxy proxy, Resources resources) {
                    Resources resources2;
                    this.getMax = proxy;
                    Rect rect = null;
                    if (resources != null) {
                        resources2 = resources;
                    } else {
                        resources2 = setmin != null ? setmin.getMin : null;
                    }
                    this.getMin = resources2;
                    int max = Proxy.setMax(resources, setmin != null ? setmin.setMax : 0);
                    this.setMax = max;
                    if (setmin != null) {
                        this.isInside = setmin.isInside;
                        this.equals = setmin.equals;
                        this.ICustomTabsCallback = true;
                        this.onNavigationEvent = true;
                        this.values = setmin.values;
                        this.toDoubleRange = setmin.toDoubleRange;
                        this.extraCallbackWithResult = setmin.extraCallbackWithResult;
                        this.onRelationshipValidationResult = setmin.onRelationshipValidationResult;
                        this.onMessageChannelReady = setmin.onMessageChannelReady;
                        this.onPostMessage = setmin.onPostMessage;
                        this.extraCallback = setmin.extraCallback;
                        this.asInterface = setmin.asInterface;
                        this.ICustomTabsCallback$Stub = setmin.ICustomTabsCallback$Stub;
                        this.onTransact = setmin.onTransact;
                        this.asBinder = setmin.asBinder;
                        this.ICustomTabsCallback$Default = setmin.ICustomTabsCallback$Default;
                        this.setDefaultImpl = setmin.setDefaultImpl;
                        this.getInterfaceDescriptor = setmin.getInterfaceDescriptor;
                        if (setmin.setMax == max) {
                            if (setmin.FastBitmap$CoordinateSystem) {
                                this.hashCode = setmin.hashCode != null ? new Rect(setmin.hashCode) : rect;
                                this.FastBitmap$CoordinateSystem = true;
                            }
                            if (setmin.toString) {
                                this.invokeSuspend = setmin.invokeSuspend;
                                this.invoke = setmin.invoke;
                                this.Mean$Arithmetic = setmin.Mean$Arithmetic;
                                this.valueOf = setmin.valueOf;
                                this.toString = true;
                            }
                        }
                        if (setmin.Grayscale$Algorithm) {
                            this.create = setmin.create;
                            this.Grayscale$Algorithm = true;
                        }
                        if (setmin.getCause) {
                            this.b = setmin.b;
                            this.getCause = true;
                        }
                        Drawable[] drawableArr = setmin.toIntRange;
                        this.toIntRange = new Drawable[drawableArr.length];
                        this.toFloatRange = setmin.toFloatRange;
                        SparseArray<Drawable.ConstantState> sparseArray = setmin.IsOverlapping;
                        if (sparseArray != null) {
                            this.IsOverlapping = sparseArray.clone();
                        } else {
                            this.IsOverlapping = new SparseArray<>(this.toFloatRange);
                        }
                        int i = this.toFloatRange;
                        for (int i2 = 0; i2 < i; i2++) {
                            if (drawableArr[i2] != null) {
                                Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                                if (constantState != null) {
                                    this.IsOverlapping.put(i2, constantState);
                                } else {
                                    this.toIntRange[i2] = drawableArr[i2];
                                }
                            }
                        }
                        return;
                    }
                    this.toIntRange = new Drawable[10];
                    this.toFloatRange = 0;
                }

                public int getChangingConfigurations() {
                    return this.isInside | this.equals;
                }

                public final int setMin(Drawable drawable) {
                    int i = this.toFloatRange;
                    if (i >= this.toIntRange.length) {
                        setMax(i, i + 10);
                    }
                    drawable.mutate();
                    drawable.setVisible(false, true);
                    drawable.setCallback(this.getMax);
                    this.toIntRange[i] = drawable;
                    this.toFloatRange++;
                    this.equals = drawable.getChangingConfigurations() | this.equals;
                    getMax();
                    this.hashCode = null;
                    this.FastBitmap$CoordinateSystem = false;
                    this.toString = false;
                    this.ICustomTabsCallback = false;
                    return i;
                }

                /* access modifiers changed from: package-private */
                public void getMax() {
                    this.Grayscale$Algorithm = false;
                    this.getCause = false;
                }

                /* access modifiers changed from: package-private */
                public final int setMin() {
                    return this.toIntRange.length;
                }

                private void valueOf() {
                    SparseArray<Drawable.ConstantState> sparseArray = this.IsOverlapping;
                    if (sparseArray != null) {
                        int size = sparseArray.size();
                        for (int i = 0; i < size; i++) {
                            this.toIntRange[this.IsOverlapping.keyAt(i)] = getMax(this.IsOverlapping.valueAt(i).newDrawable(this.getMin));
                        }
                        this.IsOverlapping = null;
                    }
                }

                private Drawable getMax(Drawable drawable) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        RequiresPermission.Read.setMax(drawable, this.onMessageChannelReady);
                    }
                    Drawable mutate = drawable.mutate();
                    mutate.setCallback(this.getMax);
                    return mutate;
                }

                public final int length() {
                    return this.toFloatRange;
                }

                public final Drawable setMin(int i) {
                    int indexOfKey;
                    Drawable drawable = this.toIntRange[i];
                    if (drawable != null) {
                        return drawable;
                    }
                    SparseArray<Drawable.ConstantState> sparseArray = this.IsOverlapping;
                    if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                        return null;
                    }
                    Drawable max = getMax(this.IsOverlapping.valueAt(indexOfKey).newDrawable(this.getMin));
                    this.toIntRange[i] = max;
                    this.IsOverlapping.removeAt(indexOfKey);
                    if (this.IsOverlapping.size() == 0) {
                        this.IsOverlapping = null;
                    }
                    return max;
                }

                /* access modifiers changed from: package-private */
                public final boolean setMin(int i, int i2) {
                    int i3 = this.toFloatRange;
                    Drawable[] drawableArr = this.toIntRange;
                    boolean z = false;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (drawableArr[i4] != null) {
                            boolean max = Build.VERSION.SDK_INT >= 23 ? RequiresPermission.Read.setMax(drawableArr[i4], i) : false;
                            if (i4 == i2) {
                                z = max;
                            }
                        }
                    }
                    this.onMessageChannelReady = i;
                    return z;
                }

                /* access modifiers changed from: package-private */
                public final void length(Resources resources) {
                    if (resources != null) {
                        this.getMin = resources;
                        int max = Proxy.setMax(resources, this.setMax);
                        int i = this.setMax;
                        this.setMax = max;
                        if (i != max) {
                            this.toString = false;
                            this.FastBitmap$CoordinateSystem = false;
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                @RequiresApi(21)
                public final void getMax(Resources.Theme theme) {
                    if (theme != null) {
                        valueOf();
                        int i = this.toFloatRange;
                        Drawable[] drawableArr = this.toIntRange;
                        for (int i2 = 0; i2 < i; i2++) {
                            if (drawableArr[i2] != null && RequiresPermission.Read.getMax(drawableArr[i2])) {
                                RequiresPermission.Read.getMax(drawableArr[i2], theme);
                                this.equals |= drawableArr[i2].getChangingConfigurations();
                            }
                        }
                        length(getMin.getMin(theme));
                    }
                }

                @RequiresApi(21)
                public boolean canApplyTheme() {
                    int i = this.toFloatRange;
                    Drawable[] drawableArr = this.toIntRange;
                    for (int i2 = 0; i2 < i; i2++) {
                        Drawable drawable = drawableArr[i2];
                        if (drawable == null) {
                            Drawable.ConstantState constantState = this.IsOverlapping.get(i2);
                            if (constantState != null && getMin.length(constantState)) {
                                return true;
                            }
                        } else if (RequiresPermission.Read.getMax(drawable)) {
                            return true;
                        }
                    }
                    return false;
                }

                /* access modifiers changed from: package-private */
                public void getMin() {
                    int i = this.toFloatRange;
                    Drawable[] drawableArr = this.toIntRange;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (drawableArr[i2] != null) {
                            drawableArr[i2].mutate();
                        }
                    }
                    this.onRelationshipValidationResult = true;
                }

                public final void setMax(boolean z) {
                    this.values = z;
                }

                public final Rect setMax() {
                    Rect rect = null;
                    if (this.values) {
                        return null;
                    }
                    if (this.hashCode != null || this.FastBitmap$CoordinateSystem) {
                        return this.hashCode;
                    }
                    valueOf();
                    Rect rect2 = new Rect();
                    int i = this.toFloatRange;
                    Drawable[] drawableArr = this.toIntRange;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (drawableArr[i2].getPadding(rect2)) {
                            if (rect == null) {
                                rect = new Rect(0, 0, 0, 0);
                            }
                            if (rect2.left > rect.left) {
                                rect.left = rect2.left;
                            }
                            if (rect2.top > rect.top) {
                                rect.top = rect2.top;
                            }
                            if (rect2.right > rect.right) {
                                rect.right = rect2.right;
                            }
                            if (rect2.bottom > rect.bottom) {
                                rect.bottom = rect2.bottom;
                            }
                        }
                    }
                    this.FastBitmap$CoordinateSystem = true;
                    this.hashCode = rect;
                    return rect;
                }

                public final void getMin(boolean z) {
                    this.toDoubleRange = z;
                }

                public final boolean IsOverlapping() {
                    return this.toDoubleRange;
                }

                public final int equals() {
                    if (!this.toString) {
                        FastBitmap$CoordinateSystem();
                    }
                    return this.invokeSuspend;
                }

                public final int isInside() {
                    if (!this.toString) {
                        FastBitmap$CoordinateSystem();
                    }
                    return this.invoke;
                }

                public final int toFloatRange() {
                    if (!this.toString) {
                        FastBitmap$CoordinateSystem();
                    }
                    return this.Mean$Arithmetic;
                }

                public final int toIntRange() {
                    if (!this.toString) {
                        FastBitmap$CoordinateSystem();
                    }
                    return this.valueOf;
                }

                /* access modifiers changed from: protected */
                public void FastBitmap$CoordinateSystem() {
                    this.toString = true;
                    valueOf();
                    int i = this.toFloatRange;
                    Drawable[] drawableArr = this.toIntRange;
                    this.invoke = -1;
                    this.invokeSuspend = -1;
                    this.valueOf = 0;
                    this.Mean$Arithmetic = 0;
                    for (int i2 = 0; i2 < i; i2++) {
                        Drawable drawable = drawableArr[i2];
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        if (intrinsicWidth > this.invokeSuspend) {
                            this.invokeSuspend = intrinsicWidth;
                        }
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        if (intrinsicHeight > this.invoke) {
                            this.invoke = intrinsicHeight;
                        }
                        int minimumWidth = drawable.getMinimumWidth();
                        if (minimumWidth > this.Mean$Arithmetic) {
                            this.Mean$Arithmetic = minimumWidth;
                        }
                        int minimumHeight = drawable.getMinimumHeight();
                        if (minimumHeight > this.valueOf) {
                            this.valueOf = minimumHeight;
                        }
                    }
                }

                public final void getMin(int i) {
                    this.onPostMessage = i;
                }

                public final void length(int i) {
                    this.extraCallback = i;
                }

                public final int toDoubleRange() {
                    if (this.Grayscale$Algorithm) {
                        return this.create;
                    }
                    valueOf();
                    int i = this.toFloatRange;
                    Drawable[] drawableArr = this.toIntRange;
                    int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
                    for (int i2 = 1; i2 < i; i2++) {
                        opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
                    }
                    this.create = opacity;
                    this.Grayscale$Algorithm = true;
                    return opacity;
                }

                public final boolean values() {
                    if (this.getCause) {
                        return this.b;
                    }
                    valueOf();
                    int i = this.toFloatRange;
                    Drawable[] drawableArr = this.toIntRange;
                    boolean z = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            break;
                        } else if (drawableArr[i2].isStateful()) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    this.b = z;
                    this.getCause = true;
                    return z;
                }

                public void setMax(int i, int i2) {
                    Drawable[] drawableArr = new Drawable[i2];
                    Drawable[] drawableArr2 = this.toIntRange;
                    if (drawableArr2 != null) {
                        System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
                    }
                    this.toIntRange = drawableArr;
                }

                public boolean Mean$Arithmetic() {
                    if (this.ICustomTabsCallback) {
                        return this.onNavigationEvent;
                    }
                    valueOf();
                    this.ICustomTabsCallback = true;
                    int i = this.toFloatRange;
                    Drawable[] drawableArr = this.toIntRange;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (drawableArr[i2].getConstantState() == null) {
                            this.onNavigationEvent = false;
                            return false;
                        }
                    }
                    this.onNavigationEvent = true;
                    return true;
                }
            }

            /* access modifiers changed from: package-private */
            public void setMax(setMin setmin) {
                this.setMin = setmin;
                int i = this.IsOverlapping;
                if (i >= 0) {
                    Drawable min = setmin.setMin(i);
                    this.getMax = min;
                    if (min != null) {
                        setMax(min);
                    }
                }
                this.getMin = null;
            }

            static class length implements Drawable.Callback {
                Drawable.Callback getMin;

                public final void invalidateDrawable(@NonNull Drawable drawable) {
                }

                length() {
                }

                public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
                    Drawable.Callback callback = this.getMin;
                    if (callback != null) {
                        callback.scheduleDrawable(drawable, runnable, j);
                    }
                }

                public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
                    Drawable.Callback callback = this.getMin;
                    if (callback != null) {
                        callback.unscheduleDrawable(drawable, runnable);
                    }
                }
            }

            static int setMax(@Nullable Resources resources, int i) {
                if (resources != null) {
                    i = resources.getDisplayMetrics().densityDpi;
                }
                return i == 0 ? BlobStatic.MONITOR_IMAGE_WIDTH : i;
            }

            @RequiresApi(21)
            static class getMin {
                public static boolean length(Drawable.ConstantState constantState) {
                    return constantState.canApplyTheme();
                }

                public static Resources getMin(Resources.Theme theme) {
                    return theme.getResources();
                }

                public static void getMin(Drawable drawable, Outline outline) {
                    drawable.getOutline(outline);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onBoundsChange(Rect rect) {
            this.mDrawable.setBounds(rect);
        }

        public void setChangingConfigurations(int i) {
            this.mDrawable.setChangingConfigurations(i);
        }

        public int getChangingConfigurations() {
            return this.mDrawable.getChangingConfigurations();
        }

        public void setDither(boolean z) {
            this.mDrawable.setDither(z);
        }

        public void setFilterBitmap(boolean z) {
            this.mDrawable.setFilterBitmap(z);
        }

        public void setAlpha(int i) {
            this.mDrawable.setAlpha(i);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mDrawable.setColorFilter(colorFilter);
        }

        public boolean isStateful() {
            return this.mDrawable.isStateful();
        }

        public boolean setState(int[] iArr) {
            return this.mDrawable.setState(iArr);
        }

        public int[] getState() {
            return this.mDrawable.getState();
        }

        public void jumpToCurrentState() {
            this.mDrawable.jumpToCurrentState();
        }

        public Drawable getCurrent() {
            return this.mDrawable.getCurrent();
        }

        public boolean setVisible(boolean z, boolean z2) {
            return super.setVisible(z, z2) || this.mDrawable.setVisible(z, z2);
        }

        public int getOpacity() {
            return this.mDrawable.getOpacity();
        }

        public Region getTransparentRegion() {
            return this.mDrawable.getTransparentRegion();
        }

        public int getIntrinsicWidth() {
            return this.mDrawable.getIntrinsicWidth();
        }

        public int getIntrinsicHeight() {
            return this.mDrawable.getIntrinsicHeight();
        }

        public int getMinimumWidth() {
            return this.mDrawable.getMinimumWidth();
        }

        public int getMinimumHeight() {
            return this.mDrawable.getMinimumHeight();
        }

        public boolean getPadding(Rect rect) {
            return this.mDrawable.getPadding(rect);
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            unscheduleSelf(runnable);
        }

        /* access modifiers changed from: protected */
        public boolean onLevelChange(int i) {
            return this.mDrawable.setLevel(i);
        }

        public void setAutoMirrored(boolean z) {
            RequiresPermission.Read.getMin(this.mDrawable, z);
        }

        public boolean isAutoMirrored() {
            return RequiresPermission.Read.setMin(this.mDrawable);
        }

        public void setTint(int i) {
            RequiresPermission.Read.getMin(this.mDrawable, i);
        }

        public void setTintList(ColorStateList colorStateList) {
            RequiresPermission.Read.setMin(this.mDrawable, colorStateList);
        }

        public void setTintMode(PorterDuff.Mode mode) {
            RequiresPermission.Read.setMin(this.mDrawable, mode);
        }

        public void setHotspot(float f, float f2) {
            RequiresPermission.Read.getMax(this.mDrawable, f, f2);
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            RequiresPermission.Read.setMin(this.mDrawable, i, i2, i3, i4);
        }

        public Drawable getWrappedDrawable() {
            return this.mDrawable;
        }

        public void setWrappedDrawable(Drawable drawable) {
            Drawable drawable2 = this.mDrawable;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.mDrawable = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
    }

    public final boolean getMax(@NonNull AttributeSet attributeSet) {
        XmlPullParser xmlPullParser;
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser2 = (XmlPullParser) attributeSet;
        if (xmlPullParser2.getDepth() != 1) {
            return false;
        }
        Deque<WeakReference<XmlPullParser>> deque = this.length;
        while (true) {
            if (deque.isEmpty()) {
                xmlPullParser = null;
                break;
            }
            xmlPullParser = (XmlPullParser) deque.peek().get();
            if (!setMax(xmlPullParser)) {
                break;
            }
            deque.pop();
        }
        this.length.push(new WeakReference(xmlPullParser2));
        if (setMax(xmlPullParser2, xmlPullParser)) {
            return true;
        }
        return false;
    }

    private static boolean setMax(@NonNull XmlPullParser xmlPullParser, @Nullable XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    private static boolean setMax(@Nullable XmlPullParser xmlPullParser) {
        if (xmlPullParser != null) {
            try {
                if (xmlPullParser.getEventType() == 3 || xmlPullParser.getEventType() == 1) {
                    return true;
                }
                return false;
            } catch (XmlPullParserException unused) {
            }
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final class Default extends ActionBar implements ActionBarOverlayLayout.setMax {
        private static final Interpolator Grayscale$Algorithm = new DecelerateInterpolator();
        private static final Interpolator invoke = new AccelerateInterpolator();
        boolean FastBitmap$CoordinateSystem;
        private Activity ICustomTabsCallback;
        private boolean ICustomTabsCallback$Stub = true;
        IconCompatParcelizer.getMin IsOverlapping;
        final supportInvalidateOptionsMenu Mean$Arithmetic = new onTitleChanged() {
            public final void length(View view) {
                if (Default.this.toString && Default.this.toFloatRange != null) {
                    Default.this.toFloatRange.setTranslationY(0.0f);
                    Default.this.setMin.setTranslationY(0.0f);
                }
                Default.this.setMin.setVisibility(8);
                Default.this.setMin.setTransitioning(false);
                Default.this.hashCode = null;
                Default defaultR = Default.this;
                if (defaultR.IsOverlapping != null) {
                    defaultR.IsOverlapping.setMax(defaultR.equals);
                    defaultR.equals = null;
                    defaultR.IsOverlapping = null;
                }
                if (Default.this.getMax != null) {
                    ViewCompat.b(Default.this.getMax);
                }
            }
        };
        private boolean asBinder;
        private Context b;
        private boolean create;
        IconCompatParcelizer equals;
        private boolean extraCallback;
        private boolean extraCallbackWithResult;
        private int getCause = -1;
        ActionBarOverlayLayout getMax;
        ActionBarContextView getMin;
        MediaMetadataCompat.TextKey hashCode;
        final supportInvalidateOptionsMenu invokeSuspend = new onTitleChanged() {
            public final void length(View view) {
                Default.this.hashCode = null;
                Default.this.setMin.requestLayout();
            }
        };
        getMax isInside;
        getMetadata length;
        private ArrayList<Object> onMessageChannelReady = new ArrayList<>();
        private ArrayList<Object> onNavigationEvent = new ArrayList<>();
        private int onPostMessage = 0;
        private boolean onRelationshipValidationResult;
        Context setMax;
        ActionBarContainer setMin;
        boolean toDoubleRange;
        View toFloatRange;
        ScrollingTabContainerView toIntRange;
        boolean toString = true;
        final supportRequestWindowFeature valueOf = new supportRequestWindowFeature() {
            public final void setMin() {
                ((View) Default.this.setMin.getParent()).invalidate();
            }
        };
        boolean values;

        static boolean getMin(boolean z, boolean z2, boolean z3) {
            if (z3) {
                return true;
            }
            return !z && !z2;
        }

        public Default(Activity activity, boolean z) {
            this.ICustomTabsCallback = activity;
            View decorView = activity.getWindow().getDecorView();
            setMin(decorView);
            if (!z) {
                this.toFloatRange = decorView.findViewById(16908290);
            }
        }

        public Default(Dialog dialog) {
            setMin(dialog.getWindow().getDecorView());
        }

        private void setMin(View view) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.Mean$Arithmetic);
            this.getMax = actionBarOverlayLayout;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setActionBarVisibilityCallback(this);
            }
            this.length = setMax(view.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.length));
            this.getMin = (ActionBarContextView) view.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.toIntRange);
            ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.setMax);
            this.setMin = actionBarContainer;
            getMetadata getmetadata = this.length;
            if (getmetadata == null || this.getMin == null || actionBarContainer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getSimpleName());
                sb.append(" can only be used with a compatible window decor layout");
                throw new IllegalStateException(sb.toString());
            }
            this.setMax = getmetadata.getMin();
            if ((this.length.valueOf() & 4) != 0) {
                this.create = true;
            }
            MediaBrowserCompat$CustomActionResultReceiver mediaBrowserCompat$CustomActionResultReceiver = new MediaBrowserCompat$CustomActionResultReceiver(this.setMax);
            mediaBrowserCompat$CustomActionResultReceiver.getMax();
            toFloatRange(mediaBrowserCompat$CustomActionResultReceiver.setMax());
            TypedArray obtainStyledAttributes = this.setMax.obtainStyledAttributes((AttributeSet) null, ITrustedWebActivityCallback.Stub.toIntRange.length, ITrustedWebActivityCallback.Stub.getMin.setMin, 0);
            if (obtainStyledAttributes.getBoolean(ITrustedWebActivityCallback.Stub.toIntRange.toDoubleRange, false)) {
                setMin();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.toIntRange.equals, 0);
            if (dimensionPixelSize != 0) {
                ViewCompat.getMax((View) this.setMin, (float) dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
        }

        private static getMetadata setMax(View view) {
            if (view instanceof getMetadata) {
                return (getMetadata) view;
            }
            if (view instanceof Toolbar) {
                return ((Toolbar) view).getWrapper();
            }
            StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
            sb.append(view != null ? view.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }

        public final void length(Configuration configuration) {
            toFloatRange(new MediaBrowserCompat$CustomActionResultReceiver(this.setMax).setMax());
        }

        private void toFloatRange(boolean z) {
            this.onRelationshipValidationResult = z;
            if (!z) {
                this.length.getMin((ScrollingTabContainerView) null);
                this.setMin.setTabContainer(this.toIntRange);
            } else {
                this.setMin.setTabContainer((ScrollingTabContainerView) null);
                this.length.getMin(this.toIntRange);
            }
            boolean z2 = true;
            boolean z3 = this.length.Mean$Arithmetic() == 2;
            ScrollingTabContainerView scrollingTabContainerView = this.toIntRange;
            if (scrollingTabContainerView != null) {
                if (z3) {
                    scrollingTabContainerView.setVisibility(0);
                    ActionBarOverlayLayout actionBarOverlayLayout = this.getMax;
                    if (actionBarOverlayLayout != null) {
                        ViewCompat.b(actionBarOverlayLayout);
                    }
                } else {
                    scrollingTabContainerView.setVisibility(8);
                }
            }
            this.length.setMax(!this.onRelationshipValidationResult && z3);
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.getMax;
            if (this.onRelationshipValidationResult || !z3) {
                z2 = false;
            }
            actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
        }

        public final void length(int i) {
            this.onPostMessage = i;
        }

        public final void getMin(boolean z) {
            MediaMetadataCompat.TextKey textKey;
            this.asBinder = z;
            if (!z && (textKey = this.hashCode) != null) {
                textKey.getMax();
            }
        }

        public final void length(boolean z) {
            if (z != this.extraCallback) {
                this.extraCallback = z;
                int size = this.onMessageChannelReady.size();
                for (int i = 0; i < size; i++) {
                    this.onMessageChannelReady.get(i);
                }
            }
        }

        public final void setMax() {
            setMin(0, 8);
        }

        public final void getMin(CharSequence charSequence) {
            this.length.length(charSequence);
        }

        public final void setMin(CharSequence charSequence) {
            this.length.setMin(charSequence);
        }

        private void setMin(int i, int i2) {
            int valueOf2 = this.length.valueOf();
            if ((i2 & 4) != 0) {
                this.create = true;
            }
            this.length.getMin((i & i2) | ((i2 ^ -1) & valueOf2));
        }

        public final int getMin() {
            return this.length.valueOf();
        }

        public final IconCompatParcelizer length(IconCompatParcelizer.getMin getmin) {
            getMax getmax = this.isInside;
            if (getmax != null) {
                getmax.getMin();
            }
            this.getMax.setHideOnContentScrollEnabled(false);
            this.getMin.killMode();
            getMax getmax2 = new getMax(this.getMin.getContext(), getmin);
            if (!getmax2.setMin()) {
                return null;
            }
            this.isInside = getmax2;
            getmax2.length();
            this.getMin.initForMode(getmax2);
            setMin(true);
            this.getMin.sendAccessibilityEvent(32);
            return getmax2;
        }

        public final int length() {
            return this.setMin.getHeight();
        }

        public final void setMax(boolean z) {
            this.toString = z;
        }

        private void invoke() {
            if (!this.extraCallbackWithResult) {
                this.extraCallbackWithResult = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.getMax;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                equals(false);
            }
        }

        public final void toDoubleRange() {
            if (this.values) {
                this.values = false;
                equals(true);
            }
        }

        private void invokeSuspend() {
            if (this.extraCallbackWithResult) {
                this.extraCallbackWithResult = false;
                ActionBarOverlayLayout actionBarOverlayLayout = this.getMax;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(false);
                }
                equals(false);
            }
        }

        public final void values() {
            if (!this.values) {
                this.values = true;
                equals(true);
            }
        }

        public final void setMin() {
            if (this.getMax.isInOverlayMode()) {
                this.toDoubleRange = true;
                this.getMax.setHideOnContentScrollEnabled(true);
                return;
            }
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }

        private void equals(boolean z) {
            if (getMin(this.FastBitmap$CoordinateSystem, this.values, this.extraCallbackWithResult)) {
                if (!this.ICustomTabsCallback$Stub) {
                    this.ICustomTabsCallback$Stub = true;
                    IsOverlapping(z);
                }
            } else if (this.ICustomTabsCallback$Stub) {
                this.ICustomTabsCallback$Stub = false;
                isInside(z);
            }
        }

        private void IsOverlapping(boolean z) {
            View view;
            View view2;
            MediaMetadataCompat.TextKey textKey = this.hashCode;
            if (textKey != null) {
                textKey.getMax();
            }
            this.setMin.setVisibility(0);
            if (this.onPostMessage != 0 || (!this.asBinder && !z)) {
                this.setMin.setAlpha(1.0f);
                this.setMin.setTranslationY(0.0f);
                if (this.toString && (view = this.toFloatRange) != null) {
                    view.setTranslationY(0.0f);
                }
                this.invokeSuspend.length((View) null);
            } else {
                this.setMin.setTranslationY(0.0f);
                float f = (float) (-this.setMin.getHeight());
                if (z) {
                    int[] iArr = {0, 0};
                    this.setMin.getLocationInWindow(iArr);
                    f -= (float) iArr[1];
                }
                this.setMin.setTranslationY(f);
                MediaMetadataCompat.TextKey textKey2 = new MediaMetadataCompat.TextKey();
                invalidateOptionsMenu max = ViewCompat.Grayscale$Algorithm(this.setMin).getMax(0.0f);
                max.setMax(this.valueOf);
                textKey2.length(max);
                if (this.toString && (view2 = this.toFloatRange) != null) {
                    view2.setTranslationY(f);
                    textKey2.length(ViewCompat.Grayscale$Algorithm(this.toFloatRange).getMax(0.0f));
                }
                textKey2.getMin(Grayscale$Algorithm);
                textKey2.setMin(250);
                textKey2.getMax(this.invokeSuspend);
                this.hashCode = textKey2;
                textKey2.length();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.getMax;
            if (actionBarOverlayLayout != null) {
                ViewCompat.b(actionBarOverlayLayout);
            }
        }

        private void isInside(boolean z) {
            View view;
            MediaMetadataCompat.TextKey textKey = this.hashCode;
            if (textKey != null) {
                textKey.getMax();
            }
            if (this.onPostMessage != 0 || (!this.asBinder && !z)) {
                this.Mean$Arithmetic.length((View) null);
                return;
            }
            this.setMin.setAlpha(1.0f);
            this.setMin.setTransitioning(true);
            MediaMetadataCompat.TextKey textKey2 = new MediaMetadataCompat.TextKey();
            float f = (float) (-this.setMin.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.setMin.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            invalidateOptionsMenu max = ViewCompat.Grayscale$Algorithm(this.setMin).getMax(f);
            max.setMax(this.valueOf);
            textKey2.length(max);
            if (this.toString && (view = this.toFloatRange) != null) {
                textKey2.length(ViewCompat.Grayscale$Algorithm(view).getMax(f));
            }
            textKey2.getMin(invoke);
            textKey2.setMin(250);
            textKey2.getMax(this.Mean$Arithmetic);
            this.hashCode = textKey2;
            textKey2.length();
        }

        public final void setMin(boolean z) {
            invalidateOptionsMenu invalidateoptionsmenu;
            invalidateOptionsMenu invalidateoptionsmenu2;
            if (z) {
                invoke();
            } else {
                invokeSuspend();
            }
            if (Grayscale$Algorithm()) {
                if (z) {
                    invalidateoptionsmenu = this.length.setMax(4, 100);
                    invalidateoptionsmenu2 = this.getMin.setupAnimatorToVisibility(0, 200);
                } else {
                    invalidateoptionsmenu2 = this.length.setMax(0, 200);
                    invalidateoptionsmenu = this.getMin.setupAnimatorToVisibility(8, 100);
                }
                MediaMetadataCompat.TextKey textKey = new MediaMetadataCompat.TextKey();
                textKey.getMax(invalidateoptionsmenu, invalidateoptionsmenu2);
                textKey.length();
            } else if (z) {
                this.length.getMax(4);
                this.getMin.setVisibility(0);
            } else {
                this.length.getMax(0);
                this.getMin.setVisibility(8);
            }
        }

        private boolean Grayscale$Algorithm() {
            return ViewCompat.asInterface(this.setMin);
        }

        public final Context getMax() {
            if (this.b == null) {
                TypedValue typedValue = new TypedValue();
                this.setMax.getTheme().resolveAttribute(ITrustedWebActivityCallback.Stub.getMin.IsOverlapping, typedValue, true);
                int i = typedValue.resourceId;
                if (i != 0) {
                    this.b = new ContextThemeWrapper(this.setMax, i);
                } else {
                    this.b = this.setMax;
                }
            }
            return this.b;
        }

        public final void getMax(int i) {
            this.length.setMin(i);
        }

        public final void FastBitmap$CoordinateSystem() {
            MediaMetadataCompat.TextKey textKey = this.hashCode;
            if (textKey != null) {
                textKey.getMax();
                this.hashCode = null;
            }
        }

        public final boolean isInside() {
            getMetadata getmetadata = this.length;
            if (getmetadata == null || !getmetadata.length()) {
                return false;
            }
            this.length.getMax();
            return true;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public class getMax extends IconCompatParcelizer implements onEvent.length {
            private IconCompatParcelizer.getMin getMax;
            final onEvent length;
            private final Context setMin;
            private WeakReference<View> toFloatRange;

            public getMax(Context context, IconCompatParcelizer.getMin getmin) {
                this.setMin = context;
                this.getMax = getmin;
                onEvent defaultShowAsAction = new onEvent(context).setDefaultShowAsAction(1);
                this.length = defaultShowAsAction;
                defaultShowAsAction.setCallback(this);
            }

            public final MenuInflater setMax() {
                return new MediaDescriptionCompat(this.setMin);
            }

            public final Menu getMax() {
                return this.length;
            }

            public final void getMin() {
                if (Default.this.isInside == this) {
                    if (!Default.getMin(Default.this.FastBitmap$CoordinateSystem, Default.this.values, false)) {
                        Default.this.equals = this;
                        Default.this.IsOverlapping = this.getMax;
                    } else {
                        this.getMax.setMax(this);
                    }
                    this.getMax = null;
                    Default.this.setMin(false);
                    Default.this.getMin.closeMode();
                    Default.this.length.setMax().sendAccessibilityEvent(32);
                    Default.this.getMax.setHideOnContentScrollEnabled(Default.this.toDoubleRange);
                    Default.this.isInside = null;
                }
            }

            public final void length() {
                if (Default.this.isInside == this) {
                    this.length.stopDispatchingItemsChanged();
                    try {
                        this.getMax.getMin((IconCompatParcelizer) this, (Menu) this.length);
                    } finally {
                        this.length.startDispatchingItemsChanged();
                    }
                }
            }

            public final boolean setMin() {
                this.length.stopDispatchingItemsChanged();
                try {
                    return this.getMax.setMax(this, this.length);
                } finally {
                    this.length.startDispatchingItemsChanged();
                }
            }

            public final void setMin(View view) {
                Default.this.getMin.setCustomView(view);
                this.toFloatRange = new WeakReference<>(view);
            }

            public final void setMin(CharSequence charSequence) {
                Default.this.getMin.setSubtitle(charSequence);
            }

            public final void getMin(CharSequence charSequence) {
                Default.this.getMin.setTitle(charSequence);
            }

            public final void setMin(int i) {
                Default.this.getMin.setTitle(Default.this.setMax.getResources().getString(i));
            }

            public final void getMax(int i) {
                Default.this.getMin.setSubtitle(Default.this.setMax.getResources().getString(i));
            }

            public final CharSequence toIntRange() {
                return Default.this.getMin.getTitle();
            }

            public final CharSequence equals() {
                return Default.this.getMin.getSubtitle();
            }

            public final void getMax(boolean z) {
                super.getMax(z);
                Default.this.getMin.setTitleOptional(z);
            }

            public final boolean isInside() {
                return Default.this.getMin.isTitleOptional();
            }

            public final View IsOverlapping() {
                WeakReference<View> weakReference = this.toFloatRange;
                if (weakReference != null) {
                    return weakReference.get();
                }
                return null;
            }

            public final boolean onMenuItemSelected(@NonNull onEvent onevent, @NonNull MenuItem menuItem) {
                IconCompatParcelizer.getMin getmin = this.getMax;
                if (getmin != null) {
                    return getmin.getMin((IconCompatParcelizer) this, menuItem);
                }
                return false;
            }

            public final void onMenuModeChange(@NonNull onEvent onevent) {
                if (this.getMax != null) {
                    length();
                    Default.this.getMin.showOverflowMenu();
                }
            }
        }

        public final void getMax(boolean z) {
            if (!this.create) {
                setMin(z ? 4 : 0, 4);
            }
        }

        public final boolean setMin(int i, KeyEvent keyEvent) {
            onEvent onevent;
            getMax getmax = this.isInside;
            if (getmax == null || (onevent = getmax.length) == null) {
                return false;
            }
            boolean z = true;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                z = false;
            }
            onevent.setQwertyMode(z);
            return onevent.performShortcut(i, keyEvent, 0);
        }
    }
}
