package o;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.InputStream;
import o.SolverVariable$Type;

public final class ImageFilterButton<Data> implements SolverVariable$Type<String, Data> {
    private final SolverVariable$Type<Uri, Data> getMax;

    public final /* bridge */ /* synthetic */ boolean getMin(@NonNull Object obj) {
        return true;
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str));
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
        }
        if (uri == null || !this.getMax.getMin(uri)) {
            return null;
        }
        return this.getMax.setMin(uri, i, i2, motionHelper);
    }

    public ImageFilterButton(SolverVariable$Type<Uri, Data> solverVariable$Type) {
        this.getMax = solverVariable$Type;
    }

    public static class setMin implements access$1900<String, InputStream> {
        @NonNull
        public final SolverVariable$Type<String, InputStream> getMax(@NonNull setSaturation setsaturation) {
            return new ImageFilterButton(setsaturation.length(Uri.class, InputStream.class));
        }
    }

    public static class length implements access$1900<String, ParcelFileDescriptor> {
        @NonNull
        public final SolverVariable$Type<String, ParcelFileDescriptor> getMax(@NonNull setSaturation setsaturation) {
            return new ImageFilterButton(setsaturation.length(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static final class getMin implements access$1900<String, AssetFileDescriptor> {
        public final SolverVariable$Type<String, AssetFileDescriptor> getMax(@NonNull setSaturation setsaturation) {
            return new ImageFilterButton(setsaturation.length(Uri.class, AssetFileDescriptor.class));
        }
    }
}
