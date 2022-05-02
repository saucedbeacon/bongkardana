package o;

import android.content.res.Configuration;
import o.PlaybackStateCompat;

final class ContentInfoCompat$Flags extends getTopFadingEdgeStrength {
    private final PlaybackStateCompat.ErrorCode<Integer, Object> setMax = new PlaybackStateCompat.ErrorCode<Integer, Object>() {
        public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
            if (obj2 instanceof String) {
                return ((String) obj2).length();
            }
            return 1;
        }
    };

    ContentInfoCompat$Flags(Configuration configuration) {
        super(configuration);
    }
}
