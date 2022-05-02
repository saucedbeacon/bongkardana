package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import o.ITrustedWebActivityCallback;

class getVolumeAttributes {
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> getMax = new ConcurrentHashMap<>();
    private static final RectF length = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> setMin = new ConcurrentHashMap<>();
    private final getMax FastBitmap$CoordinateSystem;
    private int[] IsOverlapping = new int[0];
    private boolean equals = false;
    private int getMin = 0;
    private TextPaint hashCode;
    private float isInside = -1.0f;
    private boolean setMax = false;
    private float toFloatRange = -1.0f;
    private float toIntRange = -1.0f;
    @NonNull
    private final TextView toString;
    private final Context values;

    static class getMax {
        /* access modifiers changed from: package-private */
        public void setMin(StaticLayout.Builder builder, TextView textView) {
        }

        getMax() {
        }

        /* access modifiers changed from: package-private */
        public boolean getMax(TextView textView) {
            return ((Boolean) getVolumeAttributes.setMax((Object) textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    @RequiresApi(23)
    static class setMin extends getMax {
        setMin() {
        }

        /* access modifiers changed from: package-private */
        public void setMin(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) getVolumeAttributes.setMax((Object) textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @RequiresApi(29)
    static class getMin extends setMin {
        getMin() {
        }

        /* access modifiers changed from: package-private */
        public boolean getMax(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        /* access modifiers changed from: package-private */
        public void setMin(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    getVolumeAttributes(@NonNull TextView textView) {
        this.toString = textView;
        this.values = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.FastBitmap$CoordinateSystem = new getMin();
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.FastBitmap$CoordinateSystem = new setMin();
        } else {
            this.FastBitmap$CoordinateSystem = new getMax();
        }
    }

    /* access modifiers changed from: package-private */
    public void getMin(@Nullable AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.values.obtainStyledAttributes(attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityService, i, 0);
        TextView textView = this.toString;
        ViewCompat.getMax(textView, textView.getContext(), ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityService, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(ITrustedWebActivityCallback.Stub.toIntRange.notifyNotificationWithChannel)) {
            this.getMin = obtainStyledAttributes.getInt(ITrustedWebActivityCallback.Stub.toIntRange.notifyNotificationWithChannel, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(ITrustedWebActivityCallback.Stub.toIntRange.getSmallIconId) ? obtainStyledAttributes.getDimension(ITrustedWebActivityCallback.Stub.toIntRange.getSmallIconId, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityCallback$Stub$Proxy) ? obtainStyledAttributes.getDimension(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityCallback$Stub$Proxy, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityCallback$Stub) ? obtainStyledAttributes.getDimension(ITrustedWebActivityCallback.Stub.toIntRange.ITrustedWebActivityCallback$Stub, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(ITrustedWebActivityCallback.Stub.toIntRange.getActiveNotifications) && (resourceId = obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.getActiveNotifications, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            setMin(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!toDoubleRange()) {
            this.getMin = 0;
        } else if (this.getMin == 1) {
            if (!this.equals) {
                DisplayMetrics displayMetrics = this.values.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                setMax(dimension2, dimension3, dimension);
            }
            toFloatRange();
        }
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void getMin(int i) {
        if (!toDoubleRange()) {
            return;
        }
        if (i == 0) {
            IsOverlapping();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.values.getResources().getDisplayMetrics();
            setMax(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (toFloatRange()) {
                isInside();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: ".concat(String.valueOf(i)));
        }
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMax(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (toDoubleRange()) {
            DisplayMetrics displayMetrics = this.values.getResources().getDisplayMetrics();
            setMax(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (toFloatRange()) {
                isInside();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMin(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (toDoubleRange()) {
            int length2 = iArr.length;
            if (length2 > 0) {
                int[] iArr2 = new int[length2];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length2);
                } else {
                    DisplayMetrics displayMetrics = this.values.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length2; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.IsOverlapping = setMax(iArr2);
                if (!toIntRange()) {
                    StringBuilder sb = new StringBuilder("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.equals = false;
            }
            if (toFloatRange()) {
                isInside();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getMax() {
        return this.getMin;
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getMin() {
        return Math.round(this.toFloatRange);
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int setMax() {
        return Math.round(this.toIntRange);
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int setMin() {
        return Math.round(this.isInside);
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] length() {
        return this.IsOverlapping;
    }

    private void setMin(TypedArray typedArray) {
        int length2 = typedArray.length();
        int[] iArr = new int[length2];
        if (length2 > 0) {
            for (int i = 0; i < length2; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.IsOverlapping = setMax(iArr);
            toIntRange();
        }
    }

    private boolean toIntRange() {
        int length2 = this.IsOverlapping.length;
        boolean z = length2 > 0;
        this.equals = z;
        if (z) {
            this.getMin = 1;
            int[] iArr = this.IsOverlapping;
            this.toIntRange = (float) iArr[0];
            this.isInside = (float) iArr[length2 - 1];
            this.toFloatRange = -1.0f;
        }
        return this.equals;
    }

    private int[] setMax(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private void setMax(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.getMin = 1;
            this.toIntRange = f;
            this.isInside = f2;
            this.toFloatRange = f3;
            this.equals = false;
        } else {
            StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    private boolean toFloatRange() {
        if (!toDoubleRange() || this.getMin != 1) {
            this.setMax = false;
        } else {
            if (!this.equals || this.IsOverlapping.length == 0) {
                int floor = ((int) Math.floor((double) ((this.isInside - this.toIntRange) / this.toFloatRange))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.toIntRange + (((float) i) * this.toFloatRange));
                }
                this.IsOverlapping = setMax(iArr);
            }
            this.setMax = true;
        }
        return this.setMax;
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void isInside() {
        int i;
        if (equals()) {
            if (this.setMax) {
                if (this.toString.getMeasuredHeight() > 0 && this.toString.getMeasuredWidth() > 0) {
                    if (this.FastBitmap$CoordinateSystem.getMax(this.toString)) {
                        i = 1048576;
                    } else {
                        i = (this.toString.getMeasuredWidth() - this.toString.getTotalPaddingLeft()) - this.toString.getTotalPaddingRight();
                    }
                    int height = (this.toString.getHeight() - this.toString.getCompoundPaddingBottom()) - this.toString.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (length) {
                            length.setEmpty();
                            length.right = (float) i;
                            length.bottom = (float) height;
                            float min = (float) getMin(length);
                            if (min != this.toString.getTextSize()) {
                                setMax(0, min);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.setMax = true;
        }
    }

    private void IsOverlapping() {
        this.getMin = 0;
        this.toIntRange = -1.0f;
        this.isInside = -1.0f;
        this.toFloatRange = -1.0f;
        this.IsOverlapping = new int[0];
        this.setMax = false;
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMax(int i, float f) {
        Resources resources;
        Context context = this.values;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        getMax(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    private void getMax(float f) {
        if (f != this.toString.getPaint().getTextSize()) {
            this.toString.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.toString.isInLayout() : false;
            if (this.toString.getLayout() != null) {
                this.setMax = false;
                try {
                    Method max = setMax("nullLayouts");
                    if (max != null) {
                        max.invoke(this.toString, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.toString.requestLayout();
                } else {
                    this.toString.forceLayout();
                }
                this.toString.invalidate();
            }
        }
    }

    private int getMin(RectF rectF) {
        int length2 = this.IsOverlapping.length;
        if (length2 != 0) {
            int i = length2 - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (length(this.IsOverlapping[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.IsOverlapping[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void getMax(int i) {
        TextPaint textPaint = this.hashCode;
        if (textPaint == null) {
            this.hashCode = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.hashCode.set(this.toString.getPaint());
        this.hashCode.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public StaticLayout setMin(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return setMax(charSequence, alignment, i, i2);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return getMax(charSequence, alignment, i);
        }
        return setMax(charSequence, alignment, i);
    }

    private boolean length(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.toString.getText();
        TransformationMethod transformationMethod = this.toString.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.toString)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.toString.getMaxLines() : -1;
        getMax(i);
        StaticLayout min = setMin(text, (Layout.Alignment) setMax((Object) this.toString, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (min.getLineCount() <= maxLines && min.getLineEnd(min.getLineCount() - 1) == text.length())) && ((float) min.getHeight()) <= rectF.bottom;
    }

    @RequiresApi(23)
    private StaticLayout setMax(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.hashCode, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.toString.getLineSpacingExtra(), this.toString.getLineSpacingMultiplier()).setIncludePad(this.toString.getIncludeFontPadding()).setBreakStrategy(this.toString.getBreakStrategy()).setHyphenationFrequency(this.toString.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.FastBitmap$CoordinateSystem.setMin(obtain, this.toString);
        } catch (ClassCastException unused) {
        }
        return obtain.build();
    }

    @RequiresApi(16)
    private StaticLayout getMax(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.hashCode, i, alignment, this.toString.getLineSpacingMultiplier(), this.toString.getLineSpacingExtra(), this.toString.getIncludeFontPadding());
    }

    private StaticLayout setMax(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.hashCode, i, alignment, ((Float) length(this.toString, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) length(this.toString, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) length(this.toString, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        return r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T setMax(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull T r3) {
        /*
            java.lang.reflect.Method r2 = setMax((java.lang.String) r2)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            java.lang.Object r3 = r2.invoke(r1, r0)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            goto L_0x000e
        L_0x000c:
            r1 = move-exception
            throw r1
        L_0x000e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getVolumeAttributes.setMax(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    private static <T> T length(@NonNull Object obj, @NonNull String str, @NonNull T t) {
        try {
            Field min = getMin(str);
            if (min == null) {
                return t;
            }
            return min.get(obj);
        } catch (IllegalAccessException unused) {
            return t;
        }
    }

    @Nullable
    private static Method setMax(@NonNull String str) {
        try {
            Method method = setMin.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                setMin.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    private static Field getMin(@NonNull String str) {
        try {
            Field field = getMax.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                getMax.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean equals() {
        return toDoubleRange() && this.getMin != 0;
    }

    private boolean toDoubleRange() {
        return !(this.toString instanceof AppCompatEditText);
    }
}
