package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import o.SolverVariable$Type;

public final class WidgetRun$RunType<Data> implements SolverVariable$Type<Integer, Data> {
    private final SolverVariable$Type<Uri, Data> getMin;
    private final Resources length;

    public final /* bridge */ /* synthetic */ boolean getMin(@NonNull Object obj) {
        return true;
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        Uri max = setMax((Integer) obj);
        if (max == null) {
            return null;
        }
        return this.getMin.setMin(max, i, i2, motionHelper);
    }

    public WidgetRun$RunType(Resources resources, SolverVariable$Type<Uri, Data> solverVariable$Type) {
        this.length = resources;
        this.getMin = solverVariable$Type;
    }

    @Nullable
    private Uri setMax(Integer num) {
        try {
            StringBuilder sb = new StringBuilder("android.resource://");
            sb.append(this.length.getResourcePackageName(num.intValue()));
            sb.append('/');
            sb.append(this.length.getResourceTypeName(num.intValue()));
            sb.append('/');
            sb.append(this.length.getResourceEntryName(num.intValue()));
            return Uri.parse(sb.toString());
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static class getMax implements access$1900<Integer, InputStream> {
        private final Resources setMax;

        public getMax(Resources resources) {
            this.setMax = resources;
        }

        @NonNull
        public final SolverVariable$Type<Integer, InputStream> getMax(setSaturation setsaturation) {
            return new WidgetRun$RunType(this.setMax, setsaturation.length(Uri.class, InputStream.class));
        }
    }

    public static class getMin implements access$1900<Integer, ParcelFileDescriptor> {
        private final Resources getMax;

        public getMin(Resources resources) {
            this.getMax = resources;
        }

        @NonNull
        public final SolverVariable$Type<Integer, ParcelFileDescriptor> getMax(setSaturation setsaturation) {
            return new WidgetRun$RunType(this.getMax, setsaturation.length(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static final class setMax implements access$1900<Integer, AssetFileDescriptor> {
        private final Resources getMax;

        public setMax(Resources resources) {
            this.getMax = resources;
        }

        public final SolverVariable$Type<Integer, AssetFileDescriptor> getMax(setSaturation setsaturation) {
            return new WidgetRun$RunType(this.getMax, setsaturation.length(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class setMin implements access$1900<Integer, Uri> {
        private final Resources length;

        public setMin(Resources resources) {
            this.length = resources;
        }

        @NonNull
        public final SolverVariable$Type<Integer, Uri> getMax(setSaturation setsaturation) {
            return new WidgetRun$RunType(this.length, getSaturation.getMax());
        }
    }
}
