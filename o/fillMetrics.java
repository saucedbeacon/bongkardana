package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class fillMetrics implements setElevation<InputStream, getViewWidget> {
    private final setElevation<ByteBuffer, getViewWidget> getMin;
    private final setOnHide setMax;
    private final List<ImageHeaderParser> setMin;

    public final /* synthetic */ fireTrigger getMax(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) throws IOException {
        byte[] max = getMax((InputStream) obj);
        if (max == null) {
            return null;
        }
        return this.getMin.getMax(ByteBuffer.wrap(max), i, i2, motionHelper);
    }

    public fillMetrics(List<ImageHeaderParser> list, setElevation<ByteBuffer, getViewWidget> setelevation, setOnHide setonhide) {
        this.setMin = list;
        this.getMin = setelevation;
        this.setMax = setonhide;
    }

    /* access modifiers changed from: private */
    /* renamed from: getMin */
    public boolean length(@NonNull InputStream inputStream, @NonNull MotionHelper motionHelper) throws IOException {
        setTranslationX<Boolean> settranslationx = getPaddingWidth.length;
        return !((Boolean) (motionHelper.length.containsKey(settranslationx) ? motionHelper.length.get(settranslationx) : settranslationx.getMax)).booleanValue() && setScaleY.setMax(this.setMin, inputStream, this.setMax) == ImageHeaderParser.ImageType.GIF;
    }

    private static byte[] getMax(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
