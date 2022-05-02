package o;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import o.SolverVariable$Type;

public final class access$700<Data> implements SolverVariable$Type<Uri, Data> {
    private static final int length = 22;
    private final AssetManager setMax;
    private final length<Data> setMin;

    public interface length<Data> {
        isUseOnHide<Data> getMin(AssetManager assetManager, String str);
    }

    public final /* synthetic */ boolean getMin(@NonNull Object obj) {
        return getMax((Uri) obj);
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        Uri uri = (Uri) obj;
        return new SolverVariable$Type.setMax(new layoutChild(uri), this.setMin.getMin(this.setMax, uri.toString().substring(length)));
    }

    public access$700(AssetManager assetManager, length<Data> length2) {
        this.setMax = assetManager;
        this.setMin = length2;
    }

    private static boolean getMax(@NonNull Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    public static class setMin implements access$1900<Uri, InputStream>, length<InputStream> {
        private final AssetManager getMax;

        public setMin(AssetManager assetManager) {
            this.getMax = assetManager;
        }

        @NonNull
        public final SolverVariable$Type<Uri, InputStream> getMax(setSaturation setsaturation) {
            return new access$700(this.getMax, this);
        }

        public final isUseOnHide<InputStream> getMin(AssetManager assetManager, String str) {
            return new isAttachedToWindow(assetManager, str);
        }
    }

    public static class getMax implements access$1900<Uri, ParcelFileDescriptor>, length<ParcelFileDescriptor> {
        private final AssetManager setMin;

        public getMax(AssetManager assetManager) {
            this.setMin = assetManager;
        }

        @NonNull
        public final SolverVariable$Type<Uri, ParcelFileDescriptor> getMax(setSaturation setsaturation) {
            return new access$700(this.setMin, this);
        }

        public final isUseOnHide<ParcelFileDescriptor> getMin(AssetManager assetManager, String str) {
            return new onTransitionTrigger(assetManager, str);
        }
    }
}
