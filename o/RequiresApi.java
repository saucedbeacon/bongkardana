package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import o.OptIn;
import o.PlaybackStateCompat;
import o.RequiresOptIn;

@SuppressLint({"NewApi"})
public class RequiresApi {
    private static final PlaybackStateCompat.ErrorCode<String, Typeface> getMax = new PlaybackStateCompat.ErrorCode<>(16);
    private static final enforcement length;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            length = new RequiresOptIn();
        } else if (Build.VERSION.SDK_INT >= 28) {
            length = new level();
        } else if (Build.VERSION.SDK_INT >= 26) {
            length = new RequiresOptIn.Level();
        } else if (Build.VERSION.SDK_INT >= 24 && RequiresFeature.setMax()) {
            length = new RequiresFeature();
        } else if (Build.VERSION.SDK_INT >= 21) {
            length = new Px();
        } else {
            length = new enforcement();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface getMin(@NonNull Resources resources, int i, int i2) {
        return getMax.get(getMax(resources, i, i2));
    }

    private static String getMax(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }

    private static Typeface setMin(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                return null;
            }
            return create;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface length(@NonNull Context context, @NonNull FontResourcesParserCompat.getMin getmin, @NonNull Resources resources, int i, int i2, @Nullable OptIn.setMax setmax, @Nullable Handler handler, boolean z) {
        Typeface typeface;
        FontResourcesParserCompat.getMin getmin2 = getmin;
        OptIn.setMax setmax2 = setmax;
        Handler handler2 = handler;
        if (getmin2 instanceof FontResourcesParserCompat.length) {
            FontResourcesParserCompat.length length2 = (FontResourcesParserCompat.length) getmin2;
            Typeface min = setMin(length2.setMax());
            if (min != null) {
                if (setmax2 != null) {
                    setmax2.callbackSuccessAsync(min, handler2);
                }
                return min;
            }
            typeface = FontsContractCompat.setMin(context, length2.setMin(), i2, !z ? setmax2 == null : length2.getMax() == 0, z ? length2.length() : -1, OptIn.setMax.getHandler(handler), new setMin(setmax2));
            Resources resources2 = resources;
            int i3 = i2;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = length.setMax(context, (FontResourcesParserCompat.setMin) getmin2, resources, i2);
            if (setmax2 != null) {
                if (typeface != null) {
                    setmax2.callbackSuccessAsync(typeface, handler2);
                } else {
                    setmax2.callbackFailAsync(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            getMax.put(getMax(resources, i, i2), typeface);
        }
        return typeface;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface setMin(@NonNull Context context, @NonNull Resources resources, int i, String str, int i2) {
        Typeface min = length.setMin(context, resources, i, str, i2);
        if (min != null) {
            getMax.put(getMax(resources, i, i2), min);
        }
        return min;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface getMax(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.setMin[] setminArr, int i) {
        return length.getMin(context, cancellationSignal, setminArr, i);
    }

    @Nullable
    private static Typeface getMin(Context context, Typeface typeface, int i) {
        FontResourcesParserCompat.setMin min = length.getMin(typeface);
        if (min == null) {
            return null;
        }
        return length.setMax(context, min, context.getResources(), i);
    }

    @NonNull
    public static Typeface setMax(@NonNull Context context, @Nullable Typeface typeface, int i) {
        Typeface min;
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (Build.VERSION.SDK_INT >= 21 || (min = getMin(context, typeface, i)) == null) {
            return Typeface.create(typeface, i);
        } else {
            return min;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class setMin extends FontsContractCompat.FontRequestCallback {
        @Nullable
        private OptIn.setMax getMin;

        public setMin(@Nullable OptIn.setMax setmax) {
            this.getMin = setmax;
        }

        public void length(@NonNull Typeface typeface) {
            OptIn.setMax setmax = this.getMin;
            if (setmax != null) {
                setmax.onFontRetrieved(typeface);
            }
        }

        public void getMin(int i) {
            OptIn.setMax setmax = this.getMin;
            if (setmax != null) {
                setmax.onFontRetrievalFailed(i);
            }
        }
    }
}
