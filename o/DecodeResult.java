package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.zxing.DecodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.RGBLuminanceSource;
import id.dana.data.constant.BranchLinkConstant;
import java.util.EnumMap;

public final class DecodeResult {
    private Bitmap getMin;
    public MultiFormatReader setMax;
    public CODE setMin = new CODE(this.getMin);

    public final class CODE {
        private Bitmap setMin;

        public CODE(Bitmap bitmap) {
            this.setMin = bitmap;
        }

        public final LuminanceSource setMin() {
            int[] iArr = new int[(this.setMin.getWidth() * this.setMin.getHeight())];
            Bitmap bitmap = this.setMin;
            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, this.setMin.getWidth(), this.setMin.getHeight());
            return new RGBLuminanceSource(this.setMin.getWidth(), this.setMin.getHeight(), iArr);
        }
    }

    public DecodeResult(Bitmap bitmap) {
        this.getMin = bitmap;
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        this.setMax = multiFormatReader;
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        enumMap.put(DecodeHintType.PURE_BARCODE, Boolean.TRUE);
        multiFormatReader.setHints(enumMap);
    }

    public final class EXTRA implements RedDotDrawable {
        private final decodeByImageDecoder length;

        public EXTRA(decodeByImageDecoder decodebyimagedecoder) {
            this.length = decodebyimagedecoder;
        }

        public final Object apply(Object obj) {
            ParcelFileDescriptor openFileDescriptor = this.length.getMin.getContentResolver().openFileDescriptor((Uri) obj, BranchLinkConstant.PayloadKey.REFERRAL);
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
            openFileDescriptor.close();
            if (decodeFileDescriptor.getHeight() <= 700) {
                return decodeFileDescriptor;
            }
            return Bitmap.createScaledBitmap(decodeFileDescriptor, (int) ((((float) decodeFileDescriptor.getWidth()) / ((float) decodeFileDescriptor.getHeight())) * 700.0f), 700, true);
        }
    }
}
