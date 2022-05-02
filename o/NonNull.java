package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class NonNull {
    public static boolean setMin(@androidx.annotation.NonNull XmlPullParser xmlPullParser, @androidx.annotation.NonNull String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean length(@androidx.annotation.NonNull TypedArray typedArray, @androidx.annotation.NonNull XmlPullParser xmlPullParser, @androidx.annotation.NonNull String str, @StyleableRes int i, boolean z) {
        if (!setMin(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    public static InterpolatorRes setMin(@androidx.annotation.NonNull TypedArray typedArray, @androidx.annotation.NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @androidx.annotation.NonNull String str, @StyleableRes int i) {
        if (setMin(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return InterpolatorRes.setMin(typedValue.data);
            }
            InterpolatorRes min = InterpolatorRes.getMin(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (min != null) {
                return min;
            }
        }
        return InterpolatorRes.setMin(0);
    }
}
