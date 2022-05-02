package o;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;

public final /* synthetic */ class ensureAnimationInfo {
    public static /* synthetic */ boolean lambda$static$0(String str) {
        String lowerInvariant = Util.toLowerInvariant(str);
        if (!TextUtils.isEmpty(lowerInvariant)) {
            return (!lowerInvariant.contains("text") || lowerInvariant.contains(MimeTypes.TEXT_VTT)) && !lowerInvariant.contains("html") && !lowerInvariant.contains("xml");
        }
        return false;
    }
}
