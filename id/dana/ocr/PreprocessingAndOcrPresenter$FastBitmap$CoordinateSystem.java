package id.dana.ocr;

import android.graphics.Bitmap;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import o.setContentViewAfter;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "call"}, k = 3, mv = {1, 4, 2})
final class PreprocessingAndOcrPresenter$FastBitmap$CoordinateSystem<V> implements Callable<Bitmap> {
    final /* synthetic */ String getMin;

    PreprocessingAndOcrPresenter$FastBitmap$CoordinateSystem(String str) {
        this.getMin = str;
    }

    public final /* synthetic */ Object call() {
        return setContentViewAfter.length(this.getMin);
    }
}
