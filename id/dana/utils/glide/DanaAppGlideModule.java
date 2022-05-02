package id.dana.utils.glide;

import android.graphics.drawable.PictureDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.caverock.androidsvg.SVG;
import java.io.InputStream;
import o.getCloseLock;
import o.getSuspendingTransactionId;
import o.setContentId;

@GlideModule
public class DanaAppGlideModule extends setContentId {
    public final boolean getMax() {
        return false;
    }

    public final void getMin(@NonNull Registry registry) {
        getSuspendingTransactionId getsuspendingtransactionid = new getSuspendingTransactionId();
        registry.IsOverlapping.setMin(SVG.class, PictureDrawable.class, getsuspendingtransactionid);
        getCloseLock getcloselock = new getCloseLock();
        registry.getMin.getMax("legacy_append", getcloselock, InputStream.class, SVG.class);
    }
}
