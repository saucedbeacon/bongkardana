package o;

import android.graphics.Paint;
import android.graphics.drawable.PictureDrawable;
import android.widget.ImageView;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;

public final class getBackingFieldMap implements parseBehavior<PictureDrawable> {
    public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
        return setMax(layoutchildwithanchor);
    }

    public final boolean onLoadFailed(GlideException glideException, Object obj, layoutChildWithAnchor<PictureDrawable> layoutchildwithanchor, boolean z) {
        ((ImageView) ((setFitsSystemWindows) layoutchildwithanchor).length()).setLayerType(0, (Paint) null);
        return false;
    }

    private static boolean setMax(layoutChildWithAnchor<PictureDrawable> layoutchildwithanchor) {
        ((ImageView) ((setFitsSystemWindows) layoutchildwithanchor).length()).setLayerType(1, (Paint) null);
        return false;
    }
}
