package o;

import android.graphics.Bitmap;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.common.HybridBinarizer;
import o.TitleBarRightButtonView;

public final class onHeaderDecoded implements RedDotDrawable {
    public static final onHeaderDecoded getMin = new onHeaderDecoded();

    public final Object apply(Object obj) {
        DecodeResult decodeResult = new DecodeResult((Bitmap) obj);
        return TitleBarRightButtonView.AnonymousClass1.just(decodeResult.setMax.decode(new BinaryBitmap(new HybridBinarizer(decodeResult.setMin.setMin()))));
    }
}
