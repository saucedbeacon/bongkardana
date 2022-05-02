package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import o.getUploadFile;
import o.parseDelimitedFrom;

public final class getDefaultInstanceForType implements parseDelimitedFrom.setMin {
    private final getDefaultInstance setMax;

    public getDefaultInstanceForType(@NonNull getDefaultInstance getdefaultinstance) {
        this.setMax = getdefaultinstance;
    }

    public final getUploadFile length(@NonNull Map<String, String> map) {
        getUploadFile.getMax getmax;
        getUploadFile.getMax getmax2;
        String str = map.get(TtmlNode.TAG_STYLE);
        if (!TextUtils.isEmpty(str)) {
            getmax2 = null;
            getmax = null;
            for (assignDescriptors next : this.setMax.setMax(str)) {
                String str2 = next.getMax;
                if ("width".equals(str2)) {
                    getmax2 = length(next.length);
                } else if ("height".equals(str2)) {
                    getmax = length(next.length);
                }
                if (getmax2 != null && getmax != null) {
                    break;
                }
            }
        } else {
            getmax2 = null;
            getmax = null;
        }
        if (getmax2 != null && getmax != null) {
            return new getUploadFile(getmax2, getmax);
        }
        if (getmax2 == null) {
            getmax2 = length(map.get("width"));
        }
        if (getmax == null) {
            getmax = length(map.get("height"));
        }
        if (getmax2 == null && getmax == null) {
            return null;
        }
        return new getUploadFile(getmax2, getmax);
    }

    @VisibleForTesting
    @Nullable
    private static getUploadFile.getMax length(@Nullable String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length();
        int i = length - 1;
        int i2 = i;
        while (i2 >= 0) {
            if (Character.isDigit(str.charAt(i2))) {
                int i3 = i2 + 1;
                try {
                    float parseFloat = Float.parseFloat(str.substring(0, i3));
                    if (i2 == i) {
                        str2 = null;
                    } else {
                        str2 = str.substring(i3, length);
                    }
                    return new getUploadFile.getMax(parseFloat, str2);
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                i2--;
            }
        }
        return null;
    }
}
