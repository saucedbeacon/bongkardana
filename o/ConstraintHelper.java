package o;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@RequiresApi(27)
public final class ConstraintHelper implements ImageHeaderParser {
    @NonNull
    public final ImageHeaderParser.ImageType setMax(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    public final ImageHeaderParser.ImageType setMax(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public final int setMin(@NonNull InputStream inputStream, @NonNull setOnHide setonhide) throws IOException {
        int length = new ExifInterface(inputStream).length("Orientation", 1);
        if (length == 0) {
            return -1;
        }
        return length;
    }
}
