package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.SolverVariable$Type;
import o.isUseOnHide;

public final class access$1000 implements SolverVariable$Type<File, ByteBuffer> {
    public final /* bridge */ /* synthetic */ boolean getMin(@NonNull Object obj) {
        return true;
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        File file = (File) obj;
        return new SolverVariable$Type.setMax(new layoutChild(file), new setMin(file));
    }

    public static class getMax implements access$1900<File, ByteBuffer> {
        @NonNull
        public final SolverVariable$Type<File, ByteBuffer> getMax(@NonNull setSaturation setsaturation) {
            return new access$1000();
        }
    }

    static final class setMin implements isUseOnHide<ByteBuffer> {
        private final File length;

        public final void getMax() {
        }

        public final void getMin() {
        }

        setMin(File file) {
            this.length = file;
        }

        public final void getMin(@NonNull Priority priority, @NonNull isUseOnHide.getMin<? super ByteBuffer> getmin) {
            try {
                getmin.getMax(setInsetOffsetY.getMin(this.length));
            } catch (IOException e) {
                getmin.setMax(e);
            }
        }

        @NonNull
        public final Class<ByteBuffer> setMax() {
            return ByteBuffer.class;
        }

        @NonNull
        public final DataSource length() {
            return DataSource.LOCAL;
        }
    }
}
