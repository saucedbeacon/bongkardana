package o;

import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
public final class startInterceptRequestLayout extends consumePendingUpdateOperations<Image> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void setMin(@NonNull Object obj, boolean z) {
        try {
            ((Image) obj).close();
        } catch (Exception unused) {
        }
    }

    public startInterceptRequestLayout(int i) {
        super(i, Image.class);
    }
}
