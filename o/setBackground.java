package o;

import android.media.MediaScannerConnection;
import android.net.Uri;
import o.ConfirmPopup;

final class setBackground implements MediaScannerConnection.OnScanCompletedListener {
    public static final setBackground setMin = new setBackground();

    public final void onScanCompleted(String str, Uri uri) {
        ConfirmPopup.AnonymousClass2.length(str, uri);
    }
}
