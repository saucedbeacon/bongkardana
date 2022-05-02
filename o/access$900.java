package o;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o.SolverVariable$Type;
import o.isUseOnHide;

public final class access$900<Data> implements SolverVariable$Type<File, Data> {
    private final setMin<Data> length;

    public interface setMin<Data> {
        Class<Data> length();

        void length(Data data) throws IOException;

        Data setMax(File file) throws FileNotFoundException;
    }

    public final /* bridge */ /* synthetic */ boolean getMin(@NonNull Object obj) {
        return true;
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        File file = (File) obj;
        return new SolverVariable$Type.setMax(new layoutChild(file), new length(file, this.length));
    }

    public access$900(setMin<Data> setmin) {
        this.length = setmin;
    }

    static final class length<Data> implements isUseOnHide<Data> {
        private Data getMax;
        private final File getMin;
        private final setMin<Data> setMin;

        public final void getMax() {
        }

        length(File file, setMin<Data> setmin) {
            this.getMin = file;
            this.setMin = setmin;
        }

        public final void getMin(@NonNull Priority priority, @NonNull isUseOnHide.getMin<? super Data> getmin) {
            try {
                Data max = this.setMin.setMax(this.getMin);
                this.getMax = max;
                getmin.getMax(max);
            } catch (FileNotFoundException e) {
                getmin.setMax(e);
            }
        }

        public final void getMin() {
            Data data = this.getMax;
            if (data != null) {
                try {
                    this.setMin.length(data);
                } catch (IOException unused) {
                }
            }
        }

        @NonNull
        public final Class<Data> setMax() {
            return this.setMin.length();
        }

        @NonNull
        public final DataSource length() {
            return DataSource.LOCAL;
        }
    }

    public static class getMax<Data> implements access$1900<File, Data> {
        private final setMin<Data> getMin;

        public getMax(setMin<Data> setmin) {
            this.getMin = setmin;
        }

        @NonNull
        public final SolverVariable$Type<File, Data> getMax(@NonNull setSaturation setsaturation) {
            return new access$900(this.getMin);
        }
    }

    public static class getMin extends getMax<InputStream> {
        public getMin() {
            super(new setMin<InputStream>() {
                public final /* synthetic */ void length(Object obj) throws IOException {
                    ((InputStream) obj).close();
                }

                public final Class<InputStream> length() {
                    return InputStream.class;
                }

                public final /* synthetic */ Object setMax(File file) throws FileNotFoundException {
                    return new FileInputStream(file);
                }
            });
        }
    }

    public static class setMax extends getMax<ParcelFileDescriptor> {
        public setMax() {
            super(new setMin<ParcelFileDescriptor>() {
                public final /* synthetic */ void length(Object obj) throws IOException {
                    ((ParcelFileDescriptor) obj).close();
                }

                public final Class<ParcelFileDescriptor> length() {
                    return ParcelFileDescriptor.class;
                }

                public final /* synthetic */ Object setMax(File file) throws FileNotFoundException {
                    return ParcelFileDescriptor.open(file, 268435456);
                }
            });
        }
    }
}
