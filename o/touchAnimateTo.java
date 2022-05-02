package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import o.isUseOnHide;

public final class touchAnimateTo implements isUseOnHide<InputStream> {
    private final setInterpolatedProgress getMin;
    private InputStream length;
    private final Uri setMin;

    public final void getMax() {
    }

    public static touchAnimateTo getMin(Context context, Uri uri, animateTo animateto) {
        setOnHide setonhide = Glide.setMax(context).setMin;
        List<ImageHeaderParser> max = Glide.setMax(context).getMax.isInside.setMax();
        if (!max.isEmpty()) {
            return new touchAnimateTo(uri, new setInterpolatedProgress(max, animateto, setonhide, context.getContentResolver()));
        }
        throw new Registry.NoImageHeaderParserException();
    }

    @VisibleForTesting
    private touchAnimateTo(Uri uri, setInterpolatedProgress setinterpolatedprogress) {
        this.setMin = uri;
        this.getMin = setinterpolatedprogress;
    }

    public final void getMin() {
        InputStream inputStream = this.length;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @NonNull
    public final Class<InputStream> setMax() {
        return InputStream.class;
    }

    @NonNull
    public final DataSource length() {
        return DataSource.LOCAL;
    }

    public static class setMax implements animateTo {
        private static final String[] setMin = {"_data"};
        private final ContentResolver getMin;

        public setMax(ContentResolver contentResolver) {
            this.getMin = contentResolver;
        }

        public final Cursor setMin(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.getMin.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, setMin, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public static class setMin implements animateTo {
        private static final String[] length = {"_data"};
        private final ContentResolver getMin;

        public setMin(ContentResolver contentResolver) {
            this.getMin = contentResolver;
        }

        public final Cursor setMin(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.getMin.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, length, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public final void getMin(@NonNull Priority priority, @NonNull isUseOnHide.getMin<? super InputStream> getmin) {
        try {
            InputStream length2 = this.getMin.length(this.setMin);
            int min = length2 != null ? this.getMin.getMin(this.setMin) : -1;
            if (min != -1) {
                length2 = new MotionLayout(length2, min);
            }
            this.length = length2;
            getmin.getMax(length2);
        } catch (FileNotFoundException e) {
            getmin.setMax(e);
        }
    }
}
