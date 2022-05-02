package o;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.HybridBinarizer;
import java.util.ArrayList;
import java.util.List;

public class ContiguousPagedList$FetchState implements ResultPointCallback {
    List<ResultPoint> setMax = new ArrayList();
    private Reader setMin;

    public ContiguousPagedList$FetchState(Reader reader) {
        this.setMin = reader;
    }

    public final Result getMin(LuminanceSource luminanceSource) {
        return getMin(getMax(luminanceSource));
    }

    /* access modifiers changed from: protected */
    public BinaryBitmap getMax(LuminanceSource luminanceSource) {
        return new BinaryBitmap(new HybridBinarizer(luminanceSource));
    }

    /* JADX INFO: finally extract failed */
    private Result getMin(BinaryBitmap binaryBitmap) {
        this.setMax.clear();
        try {
            if (this.setMin instanceof MultiFormatReader) {
                Result decodeWithState = ((MultiFormatReader) this.setMin).decodeWithState(binaryBitmap);
                this.setMin.reset();
                return decodeWithState;
            }
            Result decode = this.setMin.decode(binaryBitmap);
            this.setMin.reset();
            return decode;
        } catch (Exception unused) {
            this.setMin.reset();
            return null;
        } catch (Throwable th) {
            this.setMin.reset();
            throw th;
        }
    }

    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        this.setMax.add(resultPoint);
    }
}
