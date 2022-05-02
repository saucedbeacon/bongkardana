package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import o.LinearLayoutCompat;
import o.ListPopupWindow;
import o.MenuPopupWindow$MenuDropDownListView;
import o.ScrollingTabContainerView;
import o.cancelAll;
import o.dispatchOnCancelled;
import o.getNextLocationOffset;
import o.getOrientation;
import o.isTitleTruncated;
import o.onCancelLoad;
import o.onCanceled;
import o.setAllowCollapse;
import o.setChildFrame;
import o.setGravity;
import o.setHorizontalGravity;
import o.setMaxWidth;
import o.setOrientation;
import o.setSuggestionsAdapter;
import o.setTabSelected;
import o.setTitleMargin;
import o.setTitleMarginBottom;
import o.setTitleMarginEnd;
import o.setTitleMarginStart;
import o.setVerticalGravity;

public class LottieAnimationView extends AppCompatImageView {
    private static final String getMin = LottieAnimationView.class.getSimpleName();
    /* access modifiers changed from: private */
    public static final setHorizontalGravity<Throwable> setMin = new setHorizontalGravity<Throwable>() {
        public final /* synthetic */ void length(Object obj) {
            Throwable th = (Throwable) obj;
            if (setTitleMarginStart.getMin(th)) {
                setTitleMargin.setMin("Unable to load composition.");
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    };
    private boolean FastBitmap$CoordinateSystem = false;
    private int Grayscale$Algorithm = 0;
    private boolean IsOverlapping;
    private final Set<LinearLayoutCompat.OrientationMode> Mean$Arithmetic = new HashSet();
    @Nullable
    private setVerticalGravity create;
    /* access modifiers changed from: private */
    @DrawableRes
    public int equals = 0;
    private final setHorizontalGravity<setVerticalGravity> getMax = new setHorizontalGravity<setVerticalGravity>() {
        public final /* synthetic */ void length(Object obj) {
            LottieAnimationView.this.setComposition((setVerticalGravity) obj);
        }
    };
    private boolean hashCode = false;
    /* access modifiers changed from: private */
    public boolean invoke = true;
    private RenderMode invokeSuspend = RenderMode.AUTOMATIC;
    @RawRes
    private int isInside;
    private final setHorizontalGravity<Throwable> length = new setHorizontalGravity<Throwable>() {
        public final /* synthetic */ void length(Object obj) {
            Throwable th = (Throwable) obj;
            if (LottieAnimationView.this.equals != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.equals);
            }
            (LottieAnimationView.this.setMax == null ? LottieAnimationView.setMin : LottieAnimationView.this.setMax).length(th);
        }
    };
    /* access modifiers changed from: private */
    @Nullable
    public setHorizontalGravity<Throwable> setMax;
    private boolean toDoubleRange = false;
    private String toFloatRange;
    private final LottieDrawable toIntRange = new LottieDrawable();
    private boolean toString = false;
    @Nullable
    private ListPopupWindow<setVerticalGravity> valueOf;
    private boolean values = false;

    public LottieAnimationView(Context context) {
        super(context);
        setMax((AttributeSet) null, setAllowCollapse.getMax.setMin);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMax(attributeSet, setAllowCollapse.getMax.setMin);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMax(attributeSet, i);
    }

    private void setMax(@Nullable AttributeSet attributeSet, @AttrRes int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setAllowCollapse.length.extraCallback, i, 0);
        this.invoke = obtainStyledAttributes.getBoolean(setAllowCollapse.length.asInterface, true);
        boolean hasValue = obtainStyledAttributes.hasValue(setAllowCollapse.length.getDefaultImpl);
        boolean hasValue2 = obtainStyledAttributes.hasValue(setAllowCollapse.length.asBinder);
        boolean hasValue3 = obtainStyledAttributes.hasValue(setAllowCollapse.length.postMessage);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(setAllowCollapse.length.getDefaultImpl, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(setAllowCollapse.length.asBinder);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(setAllowCollapse.length.postMessage)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(setAllowCollapse.length.ICustomTabsCallback$Default, 0));
            if (obtainStyledAttributes.getBoolean(setAllowCollapse.length.onPostMessage, false)) {
                this.values = true;
                this.hashCode = true;
            }
            if (obtainStyledAttributes.getBoolean(setAllowCollapse.length.ICustomTabsCallback$Stub$Proxy, false)) {
                this.toIntRange.setMax.setRepeatCount(-1);
            }
            if (obtainStyledAttributes.hasValue(setAllowCollapse.length.warmup)) {
                setRepeatMode(obtainStyledAttributes.getInt(setAllowCollapse.length.warmup, 1));
            }
            if (obtainStyledAttributes.hasValue(setAllowCollapse.length.mayLaunchUrl)) {
                setRepeatCount(obtainStyledAttributes.getInt(setAllowCollapse.length.mayLaunchUrl, -1));
            }
            if (obtainStyledAttributes.hasValue(setAllowCollapse.length.newSessionWithExtras)) {
                setSpeed(obtainStyledAttributes.getFloat(setAllowCollapse.length.newSessionWithExtras, 1.0f));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(setAllowCollapse.length.getInterfaceDescriptor));
            setProgress(obtainStyledAttributes.getFloat(setAllowCollapse.length.setDefaultImpl, 0.0f));
            enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(setAllowCollapse.length.ICustomTabsCallback$Stub, false));
            if (obtainStyledAttributes.hasValue(setAllowCollapse.length.onTransact)) {
                setTabSelected settabselected = new setTabSelected(cancelAll.setMin(getContext(), obtainStyledAttributes.getResourceId(setAllowCollapse.length.onTransact, -1)).getDefaultColor());
                addValueCallback(new setMaxWidth("**"), MenuPopupWindow$MenuDropDownListView.asBinder, new setTitleMarginBottom(settabselected));
            }
            if (obtainStyledAttributes.hasValue(setAllowCollapse.length.newSession)) {
                this.toIntRange.setMin = obtainStyledAttributes.getFloat(setAllowCollapse.length.newSession, 1.0f);
            }
            if (obtainStyledAttributes.hasValue(setAllowCollapse.length.extraCommand)) {
                int i2 = obtainStyledAttributes.getInt(setAllowCollapse.length.extraCommand, RenderMode.AUTOMATIC.ordinal());
                if (i2 >= RenderMode.values().length) {
                    i2 = RenderMode.AUTOMATIC.ordinal();
                }
                setRenderMode(RenderMode.values()[i2]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(setAllowCollapse.length.ICustomTabsService, false));
            obtainStyledAttributes.recycle();
            LottieDrawable lottieDrawable = this.toIntRange;
            if (setTitleMarginStart.length(getContext()) != 0.0f) {
                z = true;
            }
            lottieDrawable.getMax = z;
            length();
            this.IsOverlapping = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.toDoubleRange && drawable == (lottieDrawable = this.toIntRange) && lottieDrawable.IsOverlapping()) {
            pauseAnimation();
        } else if (!this.toDoubleRange && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.IsOverlapping()) {
                lottieDrawable2.toIntRange.clear();
                lottieDrawable2.setMax.toIntRange();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.toIntRange;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.getMin = this.toFloatRange;
        savedState.setMin = this.isInside;
        savedState.getMax = this.toIntRange.setMax.getMin();
        savedState.setMax = this.toIntRange.IsOverlapping() || (!ViewCompat.ICustomTabsService(this) && this.values);
        savedState.length = this.toIntRange.isInside;
        savedState.isInside = this.toIntRange.setMax.getRepeatMode();
        savedState.toFloatRange = this.toIntRange.setMax.getRepeatCount();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.getMin;
        this.toFloatRange = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.toFloatRange);
        }
        int i = savedState.setMin;
        this.isInside = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.getMax);
        if (savedState.setMax) {
            playAnimation();
        }
        this.toIntRange.isInside = savedState.length;
        setRepeatMode(savedState.isInside);
        setRepeatCount(savedState.toFloatRange);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(@NonNull View view, int i) {
        if (this.IsOverlapping) {
            if (isShown()) {
                if (this.FastBitmap$CoordinateSystem) {
                    resumeAnimation();
                } else if (this.toString) {
                    playAnimation();
                }
                this.FastBitmap$CoordinateSystem = false;
                this.toString = false;
            } else if (isAnimating()) {
                pauseAnimation();
                this.FastBitmap$CoordinateSystem = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.hashCode || this.values)) {
            playAnimation();
            this.hashCode = false;
            this.values = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (isAnimating()) {
            cancelAnimation();
            this.values = true;
        }
        super.onDetachedFromWindow();
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.toIntRange.getMin = z;
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        LottieDrawable lottieDrawable = this.toIntRange;
        if (lottieDrawable.FastBitmap$CoordinateSystem == z) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            setTitleMargin.setMax("Merge paths are not supported pre-Kit Kat.");
            return;
        }
        lottieDrawable.FastBitmap$CoordinateSystem = z;
        if (lottieDrawable.length != null) {
            lottieDrawable.isInside();
        }
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.toIntRange.setMin();
    }

    public void setCacheComposition(boolean z) {
        this.invoke = z;
    }

    public void setOutlineMasksAndMattes(boolean z) {
        LottieDrawable lottieDrawable = this.toIntRange;
        if (lottieDrawable.valueOf != z) {
            lottieDrawable.valueOf = z;
            if (lottieDrawable.invoke != null) {
                lottieDrawable.invoke.length(z);
            }
        }
    }

    public void setAnimation(@RawRes final int i) {
        ListPopupWindow<setVerticalGravity> listPopupWindow;
        this.isInside = i;
        this.toFloatRange = null;
        if (isInEditMode()) {
            listPopupWindow = new ListPopupWindow<>(new Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>() {
                public final /* synthetic */ Object call() throws Exception {
                    return LottieAnimationView.this.invoke ? getOrientation.getMin(LottieAnimationView.this.getContext(), i) : getOrientation.getMax(LottieAnimationView.this.getContext(), i, (String) null);
                }
            }, true);
        } else {
            listPopupWindow = this.invoke ? getOrientation.length(getContext(), i) : getOrientation.setMin(getContext(), i);
        }
        this.create = null;
        this.toIntRange.equals();
        ListPopupWindow<setVerticalGravity> listPopupWindow2 = this.valueOf;
        if (listPopupWindow2 != null) {
            listPopupWindow2.getMin(this.getMax);
            this.valueOf.setMax(this.length);
        }
        this.valueOf = listPopupWindow.length(this.getMax).getMax((setHorizontalGravity<Throwable>) this.length);
    }

    public void setAnimation(final String str) {
        ListPopupWindow<setVerticalGravity> listPopupWindow;
        this.toFloatRange = str;
        this.isInside = 0;
        if (isInEditMode()) {
            listPopupWindow = new ListPopupWindow<>(new Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>() {
                public final /* synthetic */ Object call() throws Exception {
                    return LottieAnimationView.this.invoke ? getOrientation.length(LottieAnimationView.this.getContext(), str) : getOrientation.setMax(LottieAnimationView.this.getContext(), str, (String) null);
                }
            }, true);
        } else {
            listPopupWindow = this.invoke ? getOrientation.getMax(getContext(), str) : getOrientation.setMax(getContext(), str);
        }
        this.create = null;
        this.toIntRange.equals();
        ListPopupWindow<setVerticalGravity> listPopupWindow2 = this.valueOf;
        if (listPopupWindow2 != null) {
            listPopupWindow2.getMin(this.getMax);
            this.valueOf.setMax(this.length);
        }
        this.valueOf = listPopupWindow.length(this.getMax).getMax((setHorizontalGravity<Throwable>) this.length);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, (String) null);
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        ListPopupWindow<setVerticalGravity> min = getOrientation.getMin(inputStream, str);
        this.create = null;
        this.toIntRange.equals();
        ListPopupWindow<setVerticalGravity> listPopupWindow = this.valueOf;
        if (listPopupWindow != null) {
            listPopupWindow.getMin(this.getMax);
            this.valueOf.setMax(this.length);
        }
        this.valueOf = min.length(this.getMax).getMax((setHorizontalGravity<Throwable>) this.length);
    }

    public void setAnimationFromUrl(String str) {
        ListPopupWindow<setVerticalGravity> min = this.invoke ? getOrientation.setMin(getContext(), str) : getOrientation.length(getContext(), str, (String) null);
        this.create = null;
        this.toIntRange.equals();
        ListPopupWindow<setVerticalGravity> listPopupWindow = this.valueOf;
        if (listPopupWindow != null) {
            listPopupWindow.getMin(this.getMax);
            this.valueOf.setMax(this.length);
        }
        this.valueOf = min.length(this.getMax).getMax((setHorizontalGravity<Throwable>) this.length);
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
        ListPopupWindow<setVerticalGravity> length2 = getOrientation.length(getContext(), str, str2);
        this.create = null;
        this.toIntRange.equals();
        ListPopupWindow<setVerticalGravity> listPopupWindow = this.valueOf;
        if (listPopupWindow != null) {
            listPopupWindow.getMin(this.getMax);
            this.valueOf.setMax(this.length);
        }
        this.valueOf = length2.length(this.getMax).getMax((setHorizontalGravity<Throwable>) this.length);
    }

    public void setFailureListener(@Nullable setHorizontalGravity<Throwable> sethorizontalgravity) {
        this.setMax = sethorizontalgravity;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.equals = i;
    }

    public void setComposition(@NonNull setVerticalGravity setverticalgravity) {
        boolean z = setChildFrame.length;
        this.toIntRange.setCallback(this);
        this.create = setverticalgravity;
        this.toDoubleRange = true;
        boolean max = this.toIntRange.setMax(setverticalgravity);
        this.toDoubleRange = false;
        length();
        if (getDrawable() != this.toIntRange || max) {
            if (!max) {
                boolean isAnimating = isAnimating();
                setImageDrawable((Drawable) null);
                setImageDrawable(this.toIntRange);
                if (isAnimating) {
                    this.toIntRange.toIntRange();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<LinearLayoutCompat.OrientationMode> it = this.Mean$Arithmetic.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Nullable
    public setVerticalGravity getComposition() {
        return this.create;
    }

    public boolean hasMasks() {
        return this.toIntRange.getMin();
    }

    public boolean hasMatte() {
        return this.toIntRange.setMax();
    }

    @MainThread
    public void playAnimation() {
        if (isShown()) {
            this.toIntRange.toFloatRange();
            length();
            return;
        }
        this.toString = true;
    }

    @MainThread
    public void resumeAnimation() {
        if (isShown()) {
            this.toIntRange.toIntRange();
            length();
            return;
        }
        this.toString = false;
        this.FastBitmap$CoordinateSystem = true;
    }

    public void setMinFrame(int i) {
        this.toIntRange.length(i);
    }

    public float getMinFrame() {
        setTitleMarginEnd settitlemarginend = this.toIntRange.setMax;
        if (settitlemarginend.getMax == null) {
            return 0.0f;
        }
        if (settitlemarginend.setMin == -2.14748365E9f) {
            return settitlemarginend.getMax.values;
        }
        return settitlemarginend.setMin;
    }

    public void setMinProgress(float f) {
        this.toIntRange.getMax(f);
    }

    public void setMaxFrame(int i) {
        this.toIntRange.setMin(i);
    }

    public float getMaxFrame() {
        setTitleMarginEnd settitlemarginend = this.toIntRange.setMax;
        if (settitlemarginend.getMax == null) {
            return 0.0f;
        }
        if (settitlemarginend.setMax == 2.14748365E9f) {
            return settitlemarginend.getMax.toDoubleRange;
        }
        return settitlemarginend.setMax;
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.toIntRange.setMax(f);
    }

    public void setMinFrame(String str) {
        this.toIntRange.length(str);
    }

    public void setMaxFrame(String str) {
        this.toIntRange.setMax(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.toIntRange.getMax(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.toIntRange.getMin(str, str2, z);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.toIntRange.getMin(i, i2);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.toIntRange.getMax(f, f2);
    }

    public void reverseAnimationSpeed() {
        setTitleMarginEnd settitlemarginend = this.toIntRange.setMax;
        settitlemarginend.length = -settitlemarginend.length;
    }

    public void setSpeed(float f) {
        this.toIntRange.setMax.length = f;
    }

    public float getSpeed() {
        return this.toIntRange.setMax.length;
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.toIntRange.setMax.addUpdateListener(animatorUpdateListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.toIntRange.setMax.removeUpdateListener(animatorUpdateListener);
    }

    public void removeAllUpdateListeners() {
        LottieDrawable lottieDrawable = this.toIntRange;
        lottieDrawable.setMax.removeAllUpdateListeners();
        lottieDrawable.setMax.addUpdateListener(lottieDrawable.IsOverlapping);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.toIntRange.setMax.addListener(animatorListener);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.toIntRange.setMax.removeListener(animatorListener);
    }

    public void removeAllAnimatorListeners() {
        this.toIntRange.setMax.removeAllListeners();
    }

    @RequiresApi(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.toIntRange.setMax.addPauseListener(animatorPauseListener);
    }

    @RequiresApi(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.toIntRange.setMax.removePauseListener(animatorPauseListener);
    }

    @Deprecated
    public void loop(boolean z) {
        this.toIntRange.setMax.setRepeatCount(z ? -1 : 0);
    }

    public void setRepeatMode(int i) {
        this.toIntRange.setMax.setRepeatMode(i);
    }

    public int getRepeatMode() {
        return this.toIntRange.setMax.getRepeatMode();
    }

    public void setRepeatCount(int i) {
        this.toIntRange.setMax.setRepeatCount(i);
    }

    public int getRepeatCount() {
        return this.toIntRange.setMax.getRepeatCount();
    }

    public boolean isAnimating() {
        return this.toIntRange.IsOverlapping();
    }

    public void setImageAssetsFolder(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-423811827, oncanceled);
            onCancelLoad.getMin(-423811827, oncanceled);
        }
        this.toIntRange.isInside = str;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.toIntRange.isInside;
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        Bitmap bitmap2;
        LottieDrawable lottieDrawable = this.toIntRange;
        setSuggestionsAdapter values2 = lottieDrawable.values();
        if (values2 == null) {
            setTitleMargin.setMax("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        if (bitmap == null) {
            setGravity setgravity = values2.getMin.get(str);
            bitmap2 = setgravity.setMin;
            setgravity.setMin = null;
        } else {
            Bitmap bitmap3 = values2.getMin.get(str).setMin;
            values2.getMax(str, bitmap);
            bitmap2 = bitmap3;
        }
        lottieDrawable.invalidateSelf();
        return bitmap2;
    }

    public void setImageAssetDelegate(getNextLocationOffset getnextlocationoffset) {
        LottieDrawable lottieDrawable = this.toIntRange;
        lottieDrawable.toString = getnextlocationoffset;
        if (lottieDrawable.toFloatRange != null) {
            lottieDrawable.toFloatRange.length = getnextlocationoffset;
        }
    }

    public void setFontAssetDelegate(setOrientation setorientation) {
        LottieDrawable lottieDrawable = this.toIntRange;
        lottieDrawable.values = setorientation;
        if (lottieDrawable.hashCode != null) {
            lottieDrawable.hashCode.getMin = setorientation;
        }
    }

    public void setTextDelegate(ScrollingTabContainerView scrollingTabContainerView) {
        this.toIntRange.toDoubleRange = scrollingTabContainerView;
    }

    public List<setMaxWidth> resolveKeyPath(setMaxWidth setmaxwidth) {
        return this.toIntRange.setMin(setmaxwidth);
    }

    public <T> void addValueCallback(setMaxWidth setmaxwidth, T t, setTitleMarginBottom<T> settitlemarginbottom) {
        this.toIntRange.setMin(setmaxwidth, t, settitlemarginbottom);
    }

    public <T> void addValueCallback(setMaxWidth setmaxwidth, T t, final isTitleTruncated<T> istitletruncated) {
        this.toIntRange.setMin(setmaxwidth, t, new setTitleMarginBottom<T>() {
            public final T getMax() {
                return istitletruncated.setMax();
            }
        });
    }

    public void setScale(float f) {
        this.toIntRange.setMin = f;
        if (getDrawable() == this.toIntRange) {
            boolean isAnimating = isAnimating();
            setImageDrawable((Drawable) null);
            setImageDrawable(this.toIntRange);
            if (isAnimating) {
                this.toIntRange.toIntRange();
            }
        }
    }

    public float getScale() {
        return this.toIntRange.setMin;
    }

    @MainThread
    public void cancelAnimation() {
        this.values = false;
        this.FastBitmap$CoordinateSystem = false;
        this.toString = false;
        LottieDrawable lottieDrawable = this.toIntRange;
        lottieDrawable.toIntRange.clear();
        lottieDrawable.setMax.cancel();
        length();
    }

    @MainThread
    public void pauseAnimation() {
        this.hashCode = false;
        this.values = false;
        this.FastBitmap$CoordinateSystem = false;
        this.toString = false;
        LottieDrawable lottieDrawable = this.toIntRange;
        lottieDrawable.toIntRange.clear();
        lottieDrawable.setMax.toIntRange();
        length();
    }

    public void setFrame(int i) {
        this.toIntRange.getMax(i);
    }

    public int getFrame() {
        return (int) this.toIntRange.setMax.getMin;
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.toIntRange.getMin(f);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.toIntRange.setMax.getMin();
    }

    public long getDuration() {
        setVerticalGravity setverticalgravity = this.create;
        if (setverticalgravity != null) {
            return (long) ((float) ((long) (((setverticalgravity.toDoubleRange - setverticalgravity.values) / setverticalgravity.toString) * 1000.0f)));
        }
        return 0;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        LottieDrawable lottieDrawable = this.toIntRange;
        lottieDrawable.invokeSuspend = z;
        if (lottieDrawable.length != null) {
            lottieDrawable.length.setMin.getMax = z;
        }
    }

    @Nullable
    public LinearLayoutCompat.LayoutParams getPerformanceTracker() {
        LottieDrawable lottieDrawable = this.toIntRange;
        if (lottieDrawable.length != null) {
            return lottieDrawable.length.setMin;
        }
        return null;
    }

    public void setSafeMode(boolean z) {
        this.toIntRange.equals = z;
    }

    public void buildDrawingCache(boolean z) {
        setChildFrame.getMin("buildDrawingCache");
        this.Grayscale$Algorithm++;
        super.buildDrawingCache(z);
        if (this.Grayscale$Algorithm == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.Grayscale$Algorithm--;
        setChildFrame.length("buildDrawingCache");
    }

    public void setRenderMode(RenderMode renderMode) {
        this.invokeSuspend = renderMode;
        length();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.toIntRange.Mean$Arithmetic = z;
    }

    public void disableExtraScaleModeInFitXY() {
        this.toIntRange.Grayscale$Algorithm = false;
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$7  reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.RenderMode[] r0 = com.airbnb.lottie.RenderMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.AnonymousClass7.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = r4.create;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r0 != false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void length() {
        /*
            r4 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.AnonymousClass7.setMax
            com.airbnb.lottie.RenderMode r1 = r4.invokeSuspend
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x0047
            if (r0 == r1) goto L_0x0046
            r3 = 3
            if (r0 == r3) goto L_0x0014
            goto L_0x0048
        L_0x0014:
            o.setVerticalGravity r0 = r4.create
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.setMin()
            if (r0 == 0) goto L_0x0024
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r0 < r3) goto L_0x0042
        L_0x0024:
            o.setVerticalGravity r0 = r4.create
            if (r0 == 0) goto L_0x002d
            int r0 = r0.hashCode
            r3 = 4
            if (r0 > r3) goto L_0x0042
        L_0x002d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r0 < r3) goto L_0x0042
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 == r3) goto L_0x0042
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r0 != r3) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r0 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r1 = 1
        L_0x0047:
            r2 = r1
        L_0x0048:
            int r0 = r4.getLayerType()
            if (r2 == r0) goto L_0x0052
            r0 = 0
            r4.setLayerType(r2, r0)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.length():void");
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull LinearLayoutCompat.OrientationMode orientationMode) {
        return this.Mean$Arithmetic.add(orientationMode);
    }

    public boolean removeLottieOnCompositionLoadedListener(@NonNull LinearLayoutCompat.OrientationMode orientationMode) {
        return this.Mean$Arithmetic.remove(orientationMode);
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.Mean$Arithmetic.clear();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }
        };
        float getMax;
        String getMin;
        int isInside;
        String length;
        boolean setMax;
        int setMin;
        int toFloatRange;

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.getMin = parcel.readString();
            this.getMax = parcel.readFloat();
            this.setMax = parcel.readInt() != 1 ? false : true;
            this.length = parcel.readString();
            this.isInside = parcel.readInt();
            this.toFloatRange = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.getMin);
            parcel.writeFloat(this.getMax);
            parcel.writeInt(this.setMax ? 1 : 0);
            parcel.writeString(this.length);
            parcel.writeInt(this.isInside);
            parcel.writeInt(this.toFloatRange);
        }
    }

    public void setImageResource(int i) {
        ListPopupWindow<setVerticalGravity> listPopupWindow = this.valueOf;
        if (listPopupWindow != null) {
            listPopupWindow.getMin(this.getMax);
            this.valueOf.setMax(this.length);
        }
        super.setImageResource(i);
    }

    public void setImageDrawable(Drawable drawable) {
        ListPopupWindow<setVerticalGravity> listPopupWindow = this.valueOf;
        if (listPopupWindow != null) {
            listPopupWindow.getMin(this.getMax);
            this.valueOf.setMax(this.length);
        }
        super.setImageDrawable(drawable);
    }

    public void setImageBitmap(Bitmap bitmap) {
        ListPopupWindow<setVerticalGravity> listPopupWindow = this.valueOf;
        if (listPopupWindow != null) {
            listPopupWindow.getMin(this.getMax);
            this.valueOf.setMax(this.length);
        }
        super.setImageBitmap(bitmap);
    }
}
