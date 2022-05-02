package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;
import o.ITrustedWebActivityCallback;
import o.OptIn;

public class getPackageName {
    private Typeface FastBitmap$CoordinateSystem;
    private addQueueItemAt IsOverlapping;
    private int equals = 0;
    private addQueueItemAt getMax;
    @NonNull
    private final TextView getMin;
    private boolean hashCode;
    private addQueueItemAt isInside;
    private addQueueItemAt length;
    private addQueueItemAt setMax;
    private addQueueItemAt setMin;
    @NonNull
    private final getVolumeAttributes toFloatRange;
    private addQueueItemAt toIntRange;
    private int values = -1;

    public getPackageName(@NonNull TextView textView) {
        this.getMin = textView;
        this.toFloatRange = new getVolumeAttributes(this.getMin);
    }

    @SuppressLint({"NewApi"})
    public void getMax(@Nullable AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        String str;
        ColorStateList colorStateList3;
        String str2;
        boolean z3;
        int i2;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i;
        Context context = this.getMin.getContext();
        unregisterCallbackListener max = unregisterCallbackListener.getMax();
        prepareFromUri min = prepareFromUri.getMin(context, attributeSet2, ITrustedWebActivityCallback.Stub.toIntRange.ICustomTabsService$Stub$Proxy, i3, 0);
        TextView textView = this.getMin;
        ViewCompat.getMax(textView, textView.getContext(), ITrustedWebActivityCallback.Stub.toIntRange.ICustomTabsService$Stub$Proxy, attributeSet, min.setMin, i, 0);
        int resourceId = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.onExtraCallback, -1);
        if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityCallback)) {
            this.getMax = getMin(context, max, min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityCallback, 0));
        }
        if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.IPostMessageService$Default)) {
            this.setMax = getMin(context, max, min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.IPostMessageService$Default, 0));
        }
        if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.IPostMessageService$Stub)) {
            this.setMin = getMin(context, max, min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.IPostMessageService$Stub, 0));
        }
        if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.IPostMessageService$Stub$Proxy)) {
            this.length = getMin(context, max, min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.IPostMessageService$Stub$Proxy, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.areNotificationsEnabled)) {
                this.toIntRange = getMin(context, max, min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.areNotificationsEnabled, 0));
            }
            if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityCallback$Default)) {
                this.IsOverlapping = getMin(context, max, min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityCallback$Default, 0));
            }
        }
        min.setMin.recycle();
        boolean z4 = this.getMin.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId != -1) {
            prepareFromUri min2 = prepareFromUri.setMin(context, resourceId, ITrustedWebActivityCallback.Stub.toIntRange.getOnBackPressedDispatcher);
            if (z4 || !min2.setMin(ITrustedWebActivityCallback.Stub.toIntRange.registerForActivityResult)) {
                z2 = false;
                z = false;
            } else {
                z2 = min2.setMax(ITrustedWebActivityCallback.Stub.toIntRange.registerForActivityResult, false);
                z = true;
            }
            length(context, min2);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList = min2.setMin(ITrustedWebActivityCallback.Stub.toIntRange.onActivityResult) ? min2.length(ITrustedWebActivityCallback.Stub.toIntRange.onActivityResult) : null;
                colorStateList3 = min2.setMin(ITrustedWebActivityCallback.Stub.toIntRange.onRequestPermissionsResult) ? min2.length(ITrustedWebActivityCallback.Stub.toIntRange.onRequestPermissionsResult) : null;
                colorStateList2 = min2.setMin(ITrustedWebActivityCallback.Stub.toIntRange.getSavedStateRegistry) ? min2.length(ITrustedWebActivityCallback.Stub.toIntRange.getSavedStateRegistry) : null;
            } else {
                colorStateList3 = null;
                colorStateList2 = null;
                colorStateList = null;
            }
            str = min2.setMin(ITrustedWebActivityCallback.Stub.toIntRange.ComponentActivity$3) ? min2.setMin.getString(ITrustedWebActivityCallback.Stub.toIntRange.ComponentActivity$3) : null;
            str2 = (Build.VERSION.SDK_INT < 26 || !min2.setMin(ITrustedWebActivityCallback.Stub.toIntRange.access$001)) ? null : min2.setMin.getString(ITrustedWebActivityCallback.Stub.toIntRange.access$001);
            min2.setMin.recycle();
        } else {
            str2 = null;
            colorStateList3 = null;
            str = null;
            z2 = false;
            z = false;
            colorStateList2 = null;
            colorStateList = null;
        }
        prepareFromUri min3 = prepareFromUri.getMin(context, attributeSet2, ITrustedWebActivityCallback.Stub.toIntRange.getOnBackPressedDispatcher, i3, 0);
        if (z4 || !min3.setMin(ITrustedWebActivityCallback.Stub.toIntRange.registerForActivityResult)) {
            z3 = z;
        } else {
            z2 = min3.setMax(ITrustedWebActivityCallback.Stub.toIntRange.registerForActivityResult, false);
            z3 = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (min3.setMin(ITrustedWebActivityCallback.Stub.toIntRange.onActivityResult)) {
                colorStateList = min3.length(ITrustedWebActivityCallback.Stub.toIntRange.onActivityResult);
            }
            if (min3.setMin(ITrustedWebActivityCallback.Stub.toIntRange.onRequestPermissionsResult)) {
                colorStateList3 = min3.length(ITrustedWebActivityCallback.Stub.toIntRange.onRequestPermissionsResult);
            }
            if (min3.setMin(ITrustedWebActivityCallback.Stub.toIntRange.getSavedStateRegistry)) {
                colorStateList2 = min3.length(ITrustedWebActivityCallback.Stub.toIntRange.getSavedStateRegistry);
            }
        }
        if (min3.setMin(ITrustedWebActivityCallback.Stub.toIntRange.ComponentActivity$3)) {
            str = min3.setMin.getString(ITrustedWebActivityCallback.Stub.toIntRange.ComponentActivity$3);
        }
        if (Build.VERSION.SDK_INT >= 26 && min3.setMin(ITrustedWebActivityCallback.Stub.toIntRange.access$001)) {
            str2 = min3.setMin.getString(ITrustedWebActivityCallback.Stub.toIntRange.access$001);
        }
        if (Build.VERSION.SDK_INT >= 28 && min3.setMin(ITrustedWebActivityCallback.Stub.toIntRange.onBackPressed)) {
            if (min3.setMin.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.toIntRange.onBackPressed, -1) == 0) {
                this.getMin.setTextSize(0, 0.0f);
            }
        }
        length(context, min3);
        min3.setMin.recycle();
        if (colorStateList != null) {
            this.getMin.setTextColor(colorStateList);
        }
        if (colorStateList3 != null) {
            this.getMin.setHintTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.getMin.setLinkTextColor(colorStateList2);
        }
        if (!z4 && z3) {
            setMin(z2);
        }
        Typeface typeface = this.FastBitmap$CoordinateSystem;
        if (typeface != null) {
            if (this.values == -1) {
                this.getMin.setTypeface(typeface, this.equals);
            } else {
                this.getMin.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            this.getMin.setFontVariationSettings(str2);
        }
        if (str != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.getMin.setTextLocales(LocaleList.forLanguageTags(str));
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.getMin.setTextLocale(Locale.forLanguageTag(str.substring(0, str.indexOf(44))));
            }
        }
        this.toFloatRange.getMin(attributeSet2, i3);
        if (onSupportNavigateUp.getMax && this.toFloatRange.getMax() != 0) {
            int[] length2 = this.toFloatRange.length();
            if (length2.length > 0) {
                if (((float) this.getMin.getAutoSizeStepGranularity()) != -1.0f) {
                    this.getMin.setAutoSizeTextTypeUniformWithConfiguration(this.toFloatRange.setMax(), this.toFloatRange.setMin(), this.toFloatRange.getMin(), 0);
                } else {
                    this.getMin.setAutoSizeTextTypeUniformWithPresetSizes(length2, 0);
                }
            }
        }
        prepareFromUri min4 = prepareFromUri.setMin(context, attributeSet2, ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityService);
        int resourceId2 = min4.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityService$Default, -1);
        Drawable length3 = resourceId2 != -1 ? max.length(context, resourceId2) : null;
        int resourceId3 = min4.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.INotificationSideChannel$Default, -1);
        Drawable length4 = resourceId3 != -1 ? max.length(context, resourceId3) : null;
        int resourceId4 = min4.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.INotificationSideChannel, -1);
        Drawable length5 = resourceId4 != -1 ? max.length(context, resourceId4) : null;
        int resourceId5 = min4.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.cancelNotification, -1);
        Drawable length6 = resourceId5 != -1 ? max.length(context, resourceId5) : null;
        int resourceId6 = min4.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.notify, -1);
        Drawable length7 = resourceId6 != -1 ? max.length(context, resourceId6) : null;
        int resourceId7 = min4.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.getSmallIconBitmap, -1);
        getMax(length3, length4, length5, length6, length7, resourceId7 != -1 ? max.length(context, resourceId7) : null);
        if (min4.setMin(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityService$Stub$Proxy)) {
            TextViewCompat.length(this.getMin, min4.length(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityService$Stub$Proxy));
        }
        if (min4.setMin(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityService$Stub)) {
            i2 = -1;
            TextViewCompat.getMin(this.getMin, adjustVolume.setMin(min4.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityService$Stub, -1), (PorterDuff.Mode) null));
        } else {
            i2 = -1;
        }
        int dimensionPixelSize = min4.setMin.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.toIntRange.cancelAll, i2);
        int dimensionPixelSize2 = min4.setMin.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.toIntRange.INotificationSideChannel$Stub$Proxy, i2);
        int dimensionPixelSize3 = min4.setMin.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.toIntRange.INotificationSideChannel$Stub, i2);
        min4.setMin.recycle();
        if (dimensionPixelSize != i2) {
            TextViewCompat.setMin(this.getMin, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i2) {
            TextViewCompat.getMin(this.getMin, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i2) {
            TextViewCompat.length(this.getMin, dimensionPixelSize3);
        }
    }

    private void length(Context context, prepareFromUri preparefromuri) {
        int i;
        String string;
        this.equals = preparefromuri.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.startActivityForResult, this.equals);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int i2 = preparefromuri.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.getActivityResultRegistry, -1);
            this.values = i2;
            if (i2 != -1) {
                this.equals = (this.equals & 2) | 0;
            }
        }
        if (preparefromuri.setMin(ITrustedWebActivityCallback.Stub.toIntRange.startIntentSenderForResult) || preparefromuri.setMin(ITrustedWebActivityCallback.Stub.toIntRange.reportFullyDrawn)) {
            Typeface typeface = null;
            this.FastBitmap$CoordinateSystem = null;
            if (preparefromuri.setMin(ITrustedWebActivityCallback.Stub.toIntRange.reportFullyDrawn)) {
                i = ITrustedWebActivityCallback.Stub.toIntRange.reportFullyDrawn;
            } else {
                i = ITrustedWebActivityCallback.Stub.toIntRange.startIntentSenderForResult;
            }
            final int i3 = this.values;
            final int i4 = this.equals;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.getMin);
                AnonymousClass2 r9 = new OptIn.setMax() {
                    public void onFontRetrievalFailed(int i) {
                    }

                    public void onFontRetrieved(@NonNull Typeface typeface) {
                        int i;
                        if (Build.VERSION.SDK_INT >= 28 && (i = i3) != -1) {
                            typeface = Typeface.create(typeface, i, (i4 & 2) != 0);
                        }
                        getPackageName.this.length((WeakReference<TextView>) weakReference, typeface);
                    }
                };
                try {
                    int i5 = this.equals;
                    int resourceId = preparefromuri.setMin.getResourceId(i, 0);
                    if (resourceId != 0) {
                        if (preparefromuri.setMax == null) {
                            preparefromuri.setMax = new TypedValue();
                        }
                        typeface = OptIn.length(preparefromuri.length, resourceId, preparefromuri.setMax, i5, r9);
                    }
                    if (typeface != null) {
                        if (Build.VERSION.SDK_INT < 28 || this.values == -1) {
                            this.FastBitmap$CoordinateSystem = typeface;
                        } else {
                            this.FastBitmap$CoordinateSystem = Typeface.create(Typeface.create(typeface, 0), this.values, (this.equals & 2) != 0);
                        }
                    }
                    this.hashCode = this.FastBitmap$CoordinateSystem == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.FastBitmap$CoordinateSystem == null && (string = preparefromuri.setMin.getString(i)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.values == -1) {
                    this.FastBitmap$CoordinateSystem = Typeface.create(string, this.equals);
                    return;
                }
                Typeface create = Typeface.create(string, 0);
                int i6 = this.values;
                if ((this.equals & 2) != 0) {
                    z = true;
                }
                this.FastBitmap$CoordinateSystem = Typeface.create(create, i6, z);
            }
        } else if (preparefromuri.setMin(ITrustedWebActivityCallback.Stub.toIntRange.ensureViewModelStore)) {
            this.hashCode = false;
            int i7 = preparefromuri.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.ensureViewModelStore, 1);
            if (i7 == 1) {
                this.FastBitmap$CoordinateSystem = Typeface.SANS_SERIF;
            } else if (i7 == 2) {
                this.FastBitmap$CoordinateSystem = Typeface.SERIF;
            } else if (i7 == 3) {
                this.FastBitmap$CoordinateSystem = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void length(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.hashCode) {
            this.FastBitmap$CoordinateSystem = typeface;
            final TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            if (ViewCompat.ICustomTabsService(textView)) {
                final int i = this.equals;
                textView.post(new Runnable() {
                    public void run() {
                        textView.setTypeface(typeface, i);
                    }
                });
                return;
            }
            textView.setTypeface(typeface, this.equals);
        }
    }

    public void setMax(Context context, int i) {
        String string;
        ColorStateList length2;
        ColorStateList length3;
        ColorStateList length4;
        prepareFromUri min = prepareFromUri.setMin(context, i, ITrustedWebActivityCallback.Stub.toIntRange.getOnBackPressedDispatcher);
        if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.registerForActivityResult)) {
            setMin(min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.registerForActivityResult, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.onActivityResult) && (length4 = min.length(ITrustedWebActivityCallback.Stub.toIntRange.onActivityResult)) != null) {
                this.getMin.setTextColor(length4);
            }
            if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.getSavedStateRegistry) && (length3 = min.length(ITrustedWebActivityCallback.Stub.toIntRange.getSavedStateRegistry)) != null) {
                this.getMin.setLinkTextColor(length3);
            }
            if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.onRequestPermissionsResult) && (length2 = min.length(ITrustedWebActivityCallback.Stub.toIntRange.onRequestPermissionsResult)) != null) {
                this.getMin.setHintTextColor(length2);
            }
        }
        if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.onBackPressed)) {
            if (min.setMin.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.toIntRange.onBackPressed, -1) == 0) {
                this.getMin.setTextSize(0, 0.0f);
            }
        }
        length(context, min);
        if (Build.VERSION.SDK_INT >= 26 && min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.access$001) && (string = min.setMin.getString(ITrustedWebActivityCallback.Stub.toIntRange.access$001)) != null) {
            this.getMin.setFontVariationSettings(string);
        }
        min.setMin.recycle();
        Typeface typeface = this.FastBitmap$CoordinateSystem;
        if (typeface != null) {
            this.getMin.setTypeface(typeface, this.equals);
        }
    }

    public void setMin(boolean z) {
        this.getMin.setAllCaps(z);
    }

    public void length() {
        setMax();
    }

    public void setMax() {
        if (!(this.getMax == null && this.setMax == null && this.setMin == null && this.length == null)) {
            Drawable[] compoundDrawables = this.getMin.getCompoundDrawables();
            getMax(compoundDrawables[0], this.getMax);
            getMax(compoundDrawables[1], this.setMax);
            getMax(compoundDrawables[2], this.setMin);
            getMax(compoundDrawables[3], this.length);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.toIntRange != null || this.IsOverlapping != null) {
            Drawable[] compoundDrawablesRelative = this.getMin.getCompoundDrawablesRelative();
            getMax(compoundDrawablesRelative[0], this.toIntRange);
            getMax(compoundDrawablesRelative[2], this.IsOverlapping);
        }
    }

    private void getMax(Drawable drawable, addQueueItemAt addqueueitemat) {
        if (drawable != null && addqueueitemat != null) {
            unregisterCallbackListener.setMax(drawable, addqueueitemat, this.getMin.getDrawableState());
        }
    }

    private static addQueueItemAt getMin(Context context, unregisterCallbackListener unregistercallbacklistener, int i) {
        ColorStateList min = unregistercallbacklistener.getMin(context, i);
        if (min == null) {
            return null;
        }
        addQueueItemAt addqueueitemat = new addQueueItemAt();
        addqueueitemat.setMin = true;
        addqueueitemat.getMax = min;
        return addqueueitemat;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void getMax(boolean z, int i, int i2, int i3, int i4) {
        if (!onSupportNavigateUp.getMax) {
            getMax();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void getMin(int i, float f) {
        if (!onSupportNavigateUp.getMax && !getMin()) {
            getMax(i, f);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void getMax() {
        this.toFloatRange.isInside();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean getMin() {
        return this.toFloatRange.equals();
    }

    private void getMax(int i, float f) {
        this.toFloatRange.setMax(i, f);
    }

    public void setMax(int i) {
        this.toFloatRange.getMin(i);
    }

    public void getMin(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.toFloatRange.setMax(i, i2, i3, i4);
    }

    public void getMax(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        this.toFloatRange.setMin(iArr, i);
    }

    public int setMin() {
        return this.toFloatRange.getMax();
    }

    public int toIntRange() {
        return this.toFloatRange.getMin();
    }

    public int equals() {
        return this.toFloatRange.setMax();
    }

    public int IsOverlapping() {
        return this.toFloatRange.setMin();
    }

    public int[] isInside() {
        return this.toFloatRange.length();
    }

    @Nullable
    public ColorStateList toFloatRange() {
        addQueueItemAt addqueueitemat = this.isInside;
        if (addqueueitemat != null) {
            return addqueueitemat.getMax;
        }
        return null;
    }

    public void setMin(@Nullable ColorStateList colorStateList) {
        if (this.isInside == null) {
            this.isInside = new addQueueItemAt();
        }
        this.isInside.getMax = colorStateList;
        this.isInside.setMin = colorStateList != null;
        values();
    }

    @Nullable
    public PorterDuff.Mode FastBitmap$CoordinateSystem() {
        addQueueItemAt addqueueitemat = this.isInside;
        if (addqueueitemat != null) {
            return addqueueitemat.length;
        }
        return null;
    }

    public void getMax(@Nullable PorterDuff.Mode mode) {
        if (this.isInside == null) {
            this.isInside = new addQueueItemAt();
        }
        this.isInside.length = mode;
        this.isInside.getMin = mode != null;
        values();
    }

    private void values() {
        addQueueItemAt addqueueitemat = this.isInside;
        this.getMax = addqueueitemat;
        this.setMax = addqueueitemat;
        this.setMin = addqueueitemat;
        this.length = addqueueitemat;
        this.toIntRange = addqueueitemat;
        this.IsOverlapping = addqueueitemat;
    }

    private void getMax(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.getMin.getCompoundDrawablesRelative();
            TextView textView = this.getMin;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.getMin.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.getMin;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.getMin.getCompoundDrawables();
            TextView textView3 = this.getMin;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    public void getMax(@NonNull TextView textView, @Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            setSupportProgressBarIndeterminate.getMin(editorInfo, textView.getText());
        }
    }
}
