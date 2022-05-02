package o;

import android.graphics.Bitmap;
import android.widget.ImageView;

public final class getSuggestedMinimumWidth extends setFitsSystemWindows<Bitmap> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void setMin(Object obj) {
        ((ImageView) this.getMax).setImageBitmap((Bitmap) obj);
    }

    public getSuggestedMinimumWidth(ImageView imageView) {
        super(imageView);
    }
}
