package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

public final class ImageFilterView implements setTranslationY<BitmapDrawable> {
    private final setTranslationY<Bitmap> length;
    private final rebuildScene setMax;

    public ImageFilterView(rebuildScene rebuildscene, setTranslationY<Bitmap> settranslationy) {
        this.setMax = rebuildscene;
        this.length = settranslationy;
    }

    /* access modifiers changed from: private */
    /* renamed from: getMax */
    public boolean setMax(@NonNull fireTrigger<BitmapDrawable> firetrigger, @NonNull File file, @NonNull MotionHelper motionHelper) {
        return this.length.setMax(new getType(firetrigger.setMin().getBitmap(), this.setMax), file, motionHelper);
    }

    @NonNull
    public final EncodeStrategy getMax(@NonNull MotionHelper motionHelper) {
        return this.length.getMax(motionHelper);
    }
}
