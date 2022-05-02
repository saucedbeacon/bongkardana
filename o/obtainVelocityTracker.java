package o;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import o.setProgress;

public final class obtainVelocityTracker implements setProgress<ParcelFileDescriptor> {
    public final setMax setMin;

    public final void getMax() {
    }

    public static boolean length() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @RequiresApi(21)
    public obtainVelocityTracker(ParcelFileDescriptor parcelFileDescriptor) {
        this.setMin = new setMax(parcelFileDescriptor);
    }

    @RequiresApi(21)
    public static final class getMin implements setProgress.getMin<ParcelFileDescriptor> {
        @NonNull
        public final /* synthetic */ setProgress setMax(@NonNull Object obj) {
            return new obtainVelocityTracker((ParcelFileDescriptor) obj);
        }

        @NonNull
        public final Class<ParcelFileDescriptor> setMin() {
            return ParcelFileDescriptor.class;
        }
    }

    @RequiresApi(21)
    public static final class setMax {
        private final ParcelFileDescriptor getMax;

        setMax(ParcelFileDescriptor parcelFileDescriptor) {
            this.getMax = parcelFileDescriptor;
        }

        public final ParcelFileDescriptor setMin() throws IOException {
            try {
                Os.lseek(this.getMax.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.getMax;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    @RequiresApi(21)
    @NonNull
    public final /* synthetic */ Object getMin() throws IOException {
        return this.setMin.setMin();
    }
}
