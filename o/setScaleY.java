package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class setScaleY {

    interface length {
        ImageHeaderParser.ImageType getMax(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    interface setMin {
        int getMax(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    @NonNull
    public static ImageHeaderParser.ImageType setMax(@NonNull List<ImageHeaderParser> list, @Nullable final InputStream inputStream, @NonNull setOnHide setonhide) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new setReferenceTags(inputStream, setonhide);
        }
        inputStream.mark(5242880);
        return setMin(list, new length() {
            public final ImageHeaderParser.ImageType getMax(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.setMax(inputStream);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    @NonNull
    public static ImageHeaderParser.ImageType setMin(@NonNull List<ImageHeaderParser> list, length length2) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType max = length2.getMax(list.get(i));
            if (max != ImageHeaderParser.ImageType.UNKNOWN) {
                return max;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int length(@NonNull List<ImageHeaderParser> list, @Nullable final InputStream inputStream, @NonNull final setOnHide setonhide) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new setReferenceTags(inputStream, setonhide);
        }
        inputStream.mark(5242880);
        return setMax(list, new setMin() {
            public final int getMax(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.setMin(inputStream, setonhide);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static int setMax(@NonNull List<ImageHeaderParser> list, setMin setmin) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int max = setmin.getMax(list.get(i));
            if (max != -1) {
                return max;
            }
        }
        return -1;
    }
}
