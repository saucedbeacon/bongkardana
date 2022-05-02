package o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

public class ActionBar$NavigationMode implements Spannable {
    private static final Object getMin = new Object();
    @GuardedBy("sLock")
    @NonNull
    private static Executor setMin = null;
    @Nullable
    private final PrecomputedText getMax;
    @NonNull
    private final getMax length;
    @NonNull
    private final Spannable setMax;

    public static final class getMax {
        @NonNull
        private final TextPaint getMax;
        private final int getMin;
        private final int length;
        @Nullable
        private final TextDirectionHeuristic setMax;
        final PrecomputedText.Params setMin;

        /* renamed from: o.ActionBar$NavigationMode$getMax$getMax  reason: collision with other inner class name */
        public static class C0001getMax {
            private TextDirectionHeuristic getMax;
            private int getMin;
            private int length;
            @NonNull
            private final TextPaint setMax;

            public C0001getMax(@NonNull TextPaint textPaint) {
                this.setMax = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.length = 1;
                    this.getMin = 1;
                } else {
                    this.getMin = 0;
                    this.length = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.getMax = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.getMax = null;
                }
            }

            @RequiresApi(23)
            public C0001getMax getMin(int i) {
                this.length = i;
                return this;
            }

            @RequiresApi(23)
            public C0001getMax setMax(int i) {
                this.getMin = i;
                return this;
            }

            @RequiresApi(18)
            public C0001getMax length(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.getMax = textDirectionHeuristic;
                return this;
            }

            @NonNull
            public getMax length() {
                return new getMax(this.setMax, this.getMax, this.length, this.getMin);
            }
        }

        @SuppressLint({"NewApi"})
        getMax(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.setMin = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.setMin = null;
            }
            this.getMax = textPaint;
            this.setMax = textDirectionHeuristic;
            this.getMin = i;
            this.length = i2;
        }

        @RequiresApi(28)
        public getMax(@NonNull PrecomputedText.Params params) {
            this.getMax = params.getTextPaint();
            this.setMax = params.getTextDirection();
            this.getMin = params.getBreakStrategy();
            this.length = params.getHyphenationFrequency();
            this.setMin = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        @NonNull
        public final TextPaint getMax() {
            return this.getMax;
        }

        @RequiresApi(18)
        @Nullable
        public final TextDirectionHeuristic setMax() {
            return this.setMax;
        }

        @RequiresApi(23)
        public final int setMin() {
            return this.getMin;
        }

        @RequiresApi(23)
        public final int length() {
            return this.length;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final boolean getMin(@NonNull getMax getmax) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.getMin != getmax.setMin() || this.length != getmax.length())) || this.getMax.getTextSize() != getmax.getMax().getTextSize() || this.getMax.getTextScaleX() != getmax.getMax().getTextScaleX() || this.getMax.getTextSkewX() != getmax.getMax().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.getMax.getLetterSpacing() != getmax.getMax().getLetterSpacing() || !TextUtils.equals(this.getMax.getFontFeatureSettings(), getmax.getMax().getFontFeatureSettings()))) || this.getMax.getFlags() != getmax.getMax().getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.getMax.getTextLocales().equals(getmax.getMax().getTextLocales())) {
                    return false;
                }
            } else if (Build.VERSION.SDK_INT >= 17 && !this.getMax.getTextLocale().equals(getmax.getMax().getTextLocale())) {
                return false;
            }
            if (this.getMax.getTypeface() == null) {
                if (getmax.getMax().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.getMax.getTypeface().equals(getmax.getMax().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof getMax)) {
                return false;
            }
            getMax getmax = (getMax) obj;
            if (!getMin(getmax)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.setMax == getmax.setMax();
        }

        public final int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return setNegativeButtonIcon.setMin(Float.valueOf(this.getMax.getTextSize()), Float.valueOf(this.getMax.getTextScaleX()), Float.valueOf(this.getMax.getTextSkewX()), Float.valueOf(this.getMax.getLetterSpacing()), Integer.valueOf(this.getMax.getFlags()), this.getMax.getTextLocales(), this.getMax.getTypeface(), Boolean.valueOf(this.getMax.isElegantTextHeight()), this.setMax, Integer.valueOf(this.getMin), Integer.valueOf(this.length));
            } else if (Build.VERSION.SDK_INT >= 21) {
                return setNegativeButtonIcon.setMin(Float.valueOf(this.getMax.getTextSize()), Float.valueOf(this.getMax.getTextScaleX()), Float.valueOf(this.getMax.getTextSkewX()), Float.valueOf(this.getMax.getLetterSpacing()), Integer.valueOf(this.getMax.getFlags()), this.getMax.getTextLocale(), this.getMax.getTypeface(), Boolean.valueOf(this.getMax.isElegantTextHeight()), this.setMax, Integer.valueOf(this.getMin), Integer.valueOf(this.length));
            } else if (Build.VERSION.SDK_INT >= 18) {
                return setNegativeButtonIcon.setMin(Float.valueOf(this.getMax.getTextSize()), Float.valueOf(this.getMax.getTextScaleX()), Float.valueOf(this.getMax.getTextSkewX()), Integer.valueOf(this.getMax.getFlags()), this.getMax.getTextLocale(), this.getMax.getTypeface(), this.setMax, Integer.valueOf(this.getMin), Integer.valueOf(this.length));
            } else if (Build.VERSION.SDK_INT >= 17) {
                return setNegativeButtonIcon.setMin(Float.valueOf(this.getMax.getTextSize()), Float.valueOf(this.getMax.getTextScaleX()), Float.valueOf(this.getMax.getTextSkewX()), Integer.valueOf(this.getMax.getFlags()), this.getMax.getTextLocale(), this.getMax.getTypeface(), this.setMax, Integer.valueOf(this.getMin), Integer.valueOf(this.length));
            } else {
                return setNegativeButtonIcon.setMin(Float.valueOf(this.getMax.getTextSize()), Float.valueOf(this.getMax.getTextScaleX()), Float.valueOf(this.getMax.getTextSkewX()), Integer.valueOf(this.getMax.getFlags()), this.getMax.getTypeface(), this.setMax, Integer.valueOf(this.getMin), Integer.valueOf(this.length));
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            sb2.append(this.getMax.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder(", textScaleX=");
            sb3.append(this.getMax.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder(", textSkewX=");
            sb4.append(this.getMax.getTextSkewX());
            sb.append(sb4.toString());
            if (Build.VERSION.SDK_INT >= 21) {
                StringBuilder sb5 = new StringBuilder(", letterSpacing=");
                sb5.append(this.getMax.getLetterSpacing());
                sb.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder(", elegantTextHeight=");
                sb6.append(this.getMax.isElegantTextHeight());
                sb.append(sb6.toString());
            }
            if (Build.VERSION.SDK_INT >= 24) {
                StringBuilder sb7 = new StringBuilder(", textLocale=");
                sb7.append(this.getMax.getTextLocales());
                sb.append(sb7.toString());
            } else if (Build.VERSION.SDK_INT >= 17) {
                StringBuilder sb8 = new StringBuilder(", textLocale=");
                sb8.append(this.getMax.getTextLocale());
                sb.append(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder(", typeface=");
            sb9.append(this.getMax.getTypeface());
            sb.append(sb9.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder sb10 = new StringBuilder(", variationSettings=");
                sb10.append(this.getMax.getFontVariationSettings());
                sb.append(sb10.toString());
            }
            StringBuilder sb11 = new StringBuilder(", textDir=");
            sb11.append(this.setMax);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder(", breakStrategy=");
            sb12.append(this.getMin);
            sb.append(sb12.toString());
            StringBuilder sb13 = new StringBuilder(", hyphenationFrequency=");
            sb13.append(this.length);
            sb.append(sb13.toString());
            sb.append("}");
            return sb.toString();
        }
    }

    @RequiresApi(28)
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PrecomputedText setMin() {
        Spannable spannable = this.setMax;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @NonNull
    public getMax setMax() {
        return this.length;
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.getMax.setSpan(obj, i, i2, i3);
        } else {
            this.setMax.setSpan(obj, i, i2, i3);
        }
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.getMax.removeSpan(obj);
        } else {
            this.setMax.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.getMax.getSpans(i, i2, cls);
        }
        return this.setMax.getSpans(i, i2, cls);
    }

    public int getSpanStart(Object obj) {
        return this.setMax.getSpanStart(obj);
    }

    public int getSpanEnd(Object obj) {
        return this.setMax.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.setMax.getSpanFlags(obj);
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.setMax.nextSpanTransition(i, i2, cls);
    }

    public int length() {
        return this.setMax.length();
    }

    public char charAt(int i) {
        return this.setMax.charAt(i);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.setMax.subSequence(i, i2);
    }

    @NonNull
    public String toString() {
        return this.setMax.toString();
    }
}
