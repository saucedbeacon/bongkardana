package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.SolverVariable$Type;

public final class getContrast<Data> implements SolverVariable$Type<Uri, Data> {
    private static final Set<String> length = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));
    private final setMax<Data> getMin;

    public interface setMax<Data> {
        isUseOnHide<Data> setMin(Uri uri);
    }

    public final /* synthetic */ boolean getMin(@NonNull Object obj) {
        return length((Uri) obj);
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        Uri uri = (Uri) obj;
        return new SolverVariable$Type.setMax(new layoutChild(uri), this.getMin.setMin(uri));
    }

    public getContrast(setMax<Data> setmax) {
        this.getMin = setmax;
    }

    private static boolean length(@NonNull Uri uri) {
        return length.contains(uri.getScheme());
    }

    public static class length implements access$1900<Uri, InputStream>, setMax<InputStream> {
        private final ContentResolver getMax;

        public length(ContentResolver contentResolver) {
            this.getMax = contentResolver;
        }

        public final isUseOnHide<InputStream> setMin(Uri uri) {
            return new setTransition(this.getMax, uri);
        }

        @NonNull
        public final SolverVariable$Type<Uri, InputStream> getMax(setSaturation setsaturation) {
            return new getContrast(this);
        }
    }

    public static class getMin implements access$1900<Uri, ParcelFileDescriptor>, setMax<ParcelFileDescriptor> {
        private final ContentResolver length;

        public getMin(ContentResolver contentResolver) {
            this.length = contentResolver;
        }

        public final isUseOnHide<ParcelFileDescriptor> setMin(Uri uri) {
            return new onTransitionChange(this.length, uri);
        }

        @NonNull
        public final SolverVariable$Type<Uri, ParcelFileDescriptor> getMax(setSaturation setsaturation) {
            return new getContrast(this);
        }
    }

    public static final class setMin implements access$1900<Uri, AssetFileDescriptor>, setMax<AssetFileDescriptor> {
        private final ContentResolver getMax;

        public setMin(ContentResolver contentResolver) {
            this.getMax = contentResolver;
        }

        public final SolverVariable$Type<Uri, AssetFileDescriptor> getMax(setSaturation setsaturation) {
            return new getContrast(this);
        }

        public final isUseOnHide<AssetFileDescriptor> setMin(Uri uri) {
            return new calcCenters(this.getMax, uri);
        }
    }
}
