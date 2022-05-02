package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.widget.TextViewCompat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import o.ActionBar$NavigationMode;
import o.IMediaControllerCallback;
import o.addQueueItem;
import o.cancelAll;
import o.getLaunchPendingIntent;
import o.getPackageName;
import o.getShuffleMode;
import o.isTransportControlEnabled;
import o.onStart;
import o.onSupportNavigateUp;
import o.setBackgroundResource;

public class AppCompatTextView extends TextView implements onStart, setBackgroundResource, onSupportNavigateUp {
    private final IMediaControllerCallback.Stub.Proxy mBackgroundTintHelper;
    private boolean mIsSetTypefaceProcessing;
    @Nullable
    private Future<ActionBar$NavigationMode> mPrecomputedTextFuture;
    private final getLaunchPendingIntent mTextClassifierHelper;
    private final getPackageName mTextHelper;

    public AppCompatTextView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(addQueueItem.getMax(context), attributeSet, i);
        this.mIsSetTypefaceProcessing = false;
        getShuffleMode.getMax(getContext());
        IMediaControllerCallback.Stub.Proxy proxy = new IMediaControllerCallback.Stub.Proxy(this);
        this.mBackgroundTintHelper = proxy;
        proxy.setMin(attributeSet, i);
        getPackageName getpackagename = new getPackageName(this);
        this.mTextHelper = getpackagename;
        getpackagename.getMax(attributeSet, i);
        this.mTextHelper.setMax();
        this.mTextClassifierHelper = new getLaunchPendingIntent(this);
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMax(i);
        }
    }

    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.getMax(drawable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMax(colorStateList);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            return proxy.getMax();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMin(mode);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            return proxy.length();
        }
        return null;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.setMax(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMax();
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.setMax();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.getMax(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (getMax) {
            super.setTextSize(i, f);
            return;
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.getMin(i, f);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper != null && !getMax && this.mTextHelper.getMin()) {
            this.mTextHelper.getMax();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (getMax) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.setMax(i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (getMax) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.getMin(i, i2, i3, i4);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (getMax) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.getMax(iArr, i);
        }
    }

    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (!getMax) {
            getPackageName getpackagename = this.mTextHelper;
            if (getpackagename != null) {
                return getpackagename.setMin();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (getMax) {
            return super.getAutoSizeStepGranularity();
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            return getpackagename.toIntRange();
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (getMax) {
            return super.getAutoSizeMinTextSize();
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            return getpackagename.equals();
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (getMax) {
            return super.getAutoSizeMaxTextSize();
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            return getpackagename.IsOverlapping();
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (getMax) {
            return super.getAutoSizeTextAvailableSizes();
        }
        getPackageName getpackagename = this.mTextHelper;
        return getpackagename != null ? getpackagename.isInside() : new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getMax(this, onCreateInputConnection, editorInfo);
        return isTransportControlEnabled.setMin(onCreateInputConnection, editorInfo, this);
    }

    public void setFirstBaselineToTopHeight(@Px @IntRange(from = 0) int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            TextViewCompat.setMin((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(@Px @IntRange(from = 0) int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            TextViewCompat.getMin((TextView) this, i);
        }
    }

    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.getMin((TextView) this);
    }

    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.length(this);
    }

    public void setLineHeight(@Px @IntRange(from = 0) int i) {
        TextViewCompat.length((TextView) this, i);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.length((TextView) this, callback));
    }

    @NonNull
    public ActionBar$NavigationMode.getMax getTextMetricsParamsCompat() {
        return TextViewCompat.getMax(this);
    }

    public void setTextMetricsParamsCompat(@NonNull ActionBar$NavigationMode.getMax getmax) {
        TextViewCompat.length((TextView) this, getmax);
    }

    public void setPrecomputedText(@NonNull ActionBar$NavigationMode actionBar$NavigationMode) {
        TextViewCompat.setMax((TextView) this, actionBar$NavigationMode);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<ActionBar$NavigationMode> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                TextViewCompat.setMax((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        getLaunchPendingIntent getlaunchpendingintent;
        if (Build.VERSION.SDK_INT >= 28 || (getlaunchpendingintent = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            getlaunchpendingintent.length(textClassifier);
        }
    }

    @RequiresApi(api = 26)
    @NonNull
    public TextClassifier getTextClassifier() {
        getLaunchPendingIntent getlaunchpendingintent;
        if (Build.VERSION.SDK_INT >= 28 || (getlaunchpendingintent = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return getlaunchpendingintent.setMin();
    }

    public void setTextFuture(@Nullable Future<ActionBar$NavigationMode> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.length();
        }
    }

    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.length();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.length();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable min = i != 0 ? cancelAll.getMin(context, i) : null;
        Drawable min2 = i2 != 0 ? cancelAll.getMin(context, i2) : null;
        Drawable min3 = i3 != 0 ? cancelAll.getMin(context, i3) : null;
        if (i4 != 0) {
            drawable = cancelAll.getMin(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(min, min2, min3, drawable);
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.length();
        }
    }

    @RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.length();
        }
    }

    @RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable min = i != 0 ? cancelAll.getMin(context, i) : null;
        Drawable min2 = i2 != 0 ? cancelAll.getMin(context, i2) : null;
        Drawable min3 = i3 != 0 ? cancelAll.getMin(context, i3) : null;
        if (i4 != 0) {
            drawable = cancelAll.getMin(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(min, min2, min3, drawable);
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.length();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.toFloatRange();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.setMin(colorStateList);
        this.mTextHelper.setMax();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.FastBitmap$CoordinateSystem();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.getMax(mode);
        this.mTextHelper.setMax();
    }

    public void setTypeface(@Nullable Typeface typeface, int i) {
        if (!this.mIsSetTypefaceProcessing) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                typeface2 = o.RequiresApi.setMax(getContext(), typeface, i);
            }
            this.mIsSetTypefaceProcessing = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.mIsSetTypefaceProcessing = false;
            }
        }
    }
}
