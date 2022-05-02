package o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

public final class removeSubscription {
    public static BitMatrix setMin(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        try {
            return new MultiFormatWriter().encode(str, barcodeFormat, i, i2);
        } catch (WriterException e) {
            throw e;
        } catch (Exception e2) {
            throw new WriterException((Throwable) e2);
        }
    }
}
