package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
final class StaticLayoutBuilderCompat {
    static final int DEFAULT_HYPHENATION_FREQUENCY = (Build.VERSION.SDK_INT >= 23 ? 1 : 0);
    static final float DEFAULT_LINE_SPACING_ADD = 0.0f;
    static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.0f;
    private static final String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    private static final String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    private static final String TEXT_DIR_CLASS_LTR = "LTR";
    private static final String TEXT_DIR_CLASS_RTL = "RTL";
    @Nullable
    private static Constructor<StaticLayout> constructor;
    private static boolean initialized;
    @Nullable
    private static Object textDirection;
    private Layout.Alignment alignment;
    @Nullable
    private TextUtils.TruncateAt ellipsize;
    private int end;
    private int hyphenationFrequency;
    private boolean includePad;
    private boolean isRtl;
    private float lineSpacingAdd;
    private float lineSpacingMultiplier;
    private int maxLines;
    private final TextPaint paint;
    private CharSequence source;
    private int start = 0;
    private final int width;

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.source = charSequence;
        this.paint = textPaint;
        this.width = i;
        this.end = charSequence.length();
        this.alignment = Layout.Alignment.ALIGN_NORMAL;
        this.maxLines = Integer.MAX_VALUE;
        this.lineSpacingAdd = 0.0f;
        this.lineSpacingMultiplier = 1.0f;
        this.hyphenationFrequency = DEFAULT_HYPHENATION_FREQUENCY;
        this.includePad = true;
        this.ellipsize = null;
    }

    @NonNull
    public static StaticLayoutBuilderCompat obtain(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, @IntRange(from = 0) int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    @NonNull
    public final StaticLayoutBuilderCompat setAlignment(@NonNull Layout.Alignment alignment2) {
        this.alignment = alignment2;
        return this;
    }

    @NonNull
    public final StaticLayoutBuilderCompat setIncludePad(boolean z) {
        this.includePad = z;
        return this;
    }

    @NonNull
    public final StaticLayoutBuilderCompat setStart(@IntRange(from = 0) int i) {
        this.start = i;
        return this;
    }

    @NonNull
    public final StaticLayoutBuilderCompat setEnd(@IntRange(from = 0) int i) {
        this.end = i;
        return this;
    }

    @NonNull
    public final StaticLayoutBuilderCompat setMaxLines(@IntRange(from = 0) int i) {
        this.maxLines = i;
        return this;
    }

    @NonNull
    public final StaticLayoutBuilderCompat setLineSpacing(float f, float f2) {
        this.lineSpacingAdd = f;
        this.lineSpacingMultiplier = f2;
        return this;
    }

    @NonNull
    public final StaticLayoutBuilderCompat setHyphenationFrequency(int i) {
        this.hyphenationFrequency = i;
        return this;
    }

    @NonNull
    public final StaticLayoutBuilderCompat setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
        this.ellipsize = truncateAt;
        return this;
    }

    public final StaticLayout build() throws StaticLayoutBuilderCompatException {
        if (this.source == null) {
            this.source = "";
        }
        int max = Math.max(0, this.width);
        CharSequence charSequence = this.source;
        if (this.maxLines == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.paint, (float) max, this.ellipsize);
        }
        this.end = Math.min(charSequence.length(), this.end);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.isRtl && this.maxLines == 1) {
                this.alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.start, this.end, this.paint, max);
            obtain.setAlignment(this.alignment);
            obtain.setIncludePad(this.includePad);
            obtain.setTextDirection(this.isRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.ellipsize;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.maxLines);
            if (!(this.lineSpacingAdd == 0.0f && this.lineSpacingMultiplier == 1.0f)) {
                obtain.setLineSpacing(this.lineSpacingAdd, this.lineSpacingMultiplier);
            }
            if (this.maxLines > 1) {
                obtain.setHyphenationFrequency(this.hyphenationFrequency);
            }
            return obtain.build();
        }
        createConstructorWithReflection();
        try {
            Constructor<StaticLayout> constructor2 = constructor;
            if (constructor2 != null) {
                Constructor constructor3 = constructor2;
                Object[] objArr = new Object[13];
                objArr[0] = charSequence;
                objArr[1] = Integer.valueOf(this.start);
                objArr[2] = Integer.valueOf(this.end);
                objArr[3] = this.paint;
                objArr[4] = Integer.valueOf(max);
                objArr[5] = this.alignment;
                Object obj = textDirection;
                if (obj != null) {
                    objArr[6] = obj;
                    objArr[7] = Float.valueOf(1.0f);
                    objArr[8] = Float.valueOf(0.0f);
                    objArr[9] = Boolean.valueOf(this.includePad);
                    objArr[10] = null;
                    objArr[11] = Integer.valueOf(max);
                    objArr[12] = Integer.valueOf(this.maxLines);
                    return (StaticLayout) constructor3.newInstance(objArr);
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        } catch (Exception e) {
            throw new StaticLayoutBuilderCompatException(e);
        }
    }

    private void createConstructorWithReflection() throws StaticLayoutBuilderCompatException {
        Class cls;
        if (!initialized) {
            try {
                boolean z = this.isRtl && Build.VERSION.SDK_INT >= 23;
                if (Build.VERSION.SDK_INT >= 18) {
                    cls = TextDirectionHeuristic.class;
                    textDirection = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = StaticLayoutBuilderCompat.class.getClassLoader();
                    String str = this.isRtl ? TEXT_DIR_CLASS_RTL : TEXT_DIR_CLASS_LTR;
                    Class<?> loadClass = classLoader.loadClass(TEXT_DIR_CLASS);
                    Class<?> loadClass2 = classLoader.loadClass(TEXT_DIRS_CLASS);
                    textDirection = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE});
                constructor = declaredConstructor;
                declaredConstructor.setAccessible(true);
                initialized = true;
            } catch (Exception e) {
                throw new StaticLayoutBuilderCompatException(e);
            }
        }
    }

    public final StaticLayoutBuilderCompat setIsRtl(boolean z) {
        this.isRtl = z;
        return this;
    }

    static class StaticLayoutBuilderCompatException extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        StaticLayoutBuilderCompatException(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Error thrown initializing StaticLayout "
                r0.<init>(r1)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException.<init>(java.lang.Throwable):void");
        }
    }
}
