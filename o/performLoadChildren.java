package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class performLoadChildren {
    private final int getMax = 2;
    protected Result getMin;
    protected getRecycleChildrenOnDetach setMax;

    public performLoadChildren(Result result, getRecycleChildrenOnDetach getrecyclechildrenondetach) {
        this.getMin = result;
        this.setMax = getrecyclechildrenondetach;
    }

    public final Bitmap setMin() {
        getRecycleChildrenOnDetach getrecyclechildrenondetach = this.setMax;
        Rect rect = new Rect(0, 0, getrecyclechildrenondetach.getMax.getMax, getrecyclechildrenondetach.getMax.length);
        YuvImage yuvImage = new YuvImage(getrecyclechildrenondetach.getMax.setMin(), getrecyclechildrenondetach.length, getrecyclechildrenondetach.getMax.getMax, getrecyclechildrenondetach.getMax.length, (int[]) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 2;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (getrecyclechildrenondetach.setMax == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) getrecyclechildrenondetach.setMax);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    public final String getMin() {
        return this.getMin.getText();
    }

    public final byte[] length() {
        return this.getMin.getRawBytes();
    }

    public final BarcodeFormat setMax() {
        return this.getMin.getBarcodeFormat();
    }

    public final Map<ResultMetadataType, Object> getMax() {
        return this.getMin.getResultMetadata();
    }

    public final String toString() {
        return this.getMin.getText();
    }

    public static List<ResultPoint> getMin(List<ResultPoint> list, getRecycleChildrenOnDetach getrecyclechildrenondetach) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ResultPoint next : list) {
            float x = (next.getX() * ((float) getrecyclechildrenondetach.setMin)) + ((float) getrecyclechildrenondetach.getMin.left);
            float y = (next.getY() * ((float) getrecyclechildrenondetach.setMin)) + ((float) getrecyclechildrenondetach.getMin.top);
            if (getrecyclechildrenondetach.equals) {
                x = ((float) getrecyclechildrenondetach.getMax.getMax) - x;
            }
            arrayList.add(new ResultPoint(x, y));
        }
        return arrayList;
    }
}
