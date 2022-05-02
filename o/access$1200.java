package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.SolverVariable$Type;
import o.isUseOnHide;

public final class access$1200<Data> implements SolverVariable$Type<byte[], Data> {
    private final getMin<Data> getMax;

    public interface getMin<Data> {
        Data getMin(byte[] bArr);

        Class<Data> length();
    }

    public final /* bridge */ /* synthetic */ boolean getMin(@NonNull Object obj) {
        return true;
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        byte[] bArr = (byte[]) obj;
        return new SolverVariable$Type.setMax(new layoutChild(bArr), new setMin(bArr, this.getMax));
    }

    public access$1200(getMin<Data> getmin) {
        this.getMax = getmin;
    }

    static class setMin<Data> implements isUseOnHide<Data> {
        private final getMin<Data> getMax;
        private final byte[] setMin;

        public final void getMax() {
        }

        public final void getMin() {
        }

        setMin(byte[] bArr, getMin<Data> getmin) {
            this.setMin = bArr;
            this.getMax = getmin;
        }

        public final void getMin(@NonNull Priority priority, @NonNull isUseOnHide.getMin<? super Data> getmin) {
            getmin.getMax(this.getMax.getMin(this.setMin));
        }

        @NonNull
        public final Class<Data> setMax() {
            return this.getMax.length();
        }

        @NonNull
        public final DataSource length() {
            return DataSource.LOCAL;
        }
    }

    public static class length implements access$1900<byte[], ByteBuffer> {
        @NonNull
        public final SolverVariable$Type<byte[], ByteBuffer> getMax(@NonNull setSaturation setsaturation) {
            return new access$1200(new getMin<ByteBuffer>() {
                public final Class<ByteBuffer> length() {
                    return ByteBuffer.class;
                }

                public final /* synthetic */ Object getMin(byte[] bArr) {
                    return ByteBuffer.wrap(bArr);
                }
            });
        }
    }

    public static class getMax implements access$1900<byte[], InputStream> {
        @NonNull
        public final SolverVariable$Type<byte[], InputStream> getMax(@NonNull setSaturation setsaturation) {
            return new access$1200(new getMin<InputStream>() {
                public final Class<InputStream> length() {
                    return InputStream.class;
                }

                public final /* synthetic */ Object getMin(byte[] bArr) {
                    return new ByteArrayInputStream(bArr);
                }
            });
        }
    }
}
