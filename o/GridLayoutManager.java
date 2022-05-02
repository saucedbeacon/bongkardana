package o;

import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.Reader;
import com.google.zxing.common.HybridBinarizer;

public final class GridLayoutManager {
    public ConcatAdapter$Config$StableIdMode getMax;
    public OrientationEventListener length;
    public WindowManager setMax;
    public int setMin;

    public final class LayoutParams extends ContiguousPagedList$FetchState {
        private boolean getMax = true;

        public LayoutParams(Reader reader) {
            super(reader);
        }

        /* access modifiers changed from: protected */
        public final BinaryBitmap getMax(LuminanceSource luminanceSource) {
            if (this.getMax) {
                this.getMax = false;
                return new BinaryBitmap(new HybridBinarizer(luminanceSource.invert()));
            }
            this.getMax = true;
            return new BinaryBitmap(new HybridBinarizer(luminanceSource));
        }
    }
}
