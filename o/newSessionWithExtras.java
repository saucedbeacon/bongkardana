package o;

import android.media.MediaDescription;
import android.net.Uri;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
public class newSessionWithExtras {
    public static Uri length(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }

    public static class length {
        public static void setMax(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }
}
