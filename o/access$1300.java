package o;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.SolverVariable$Type;
import o.isUseOnHide;

public final class access$1300<Model, Data> implements SolverVariable$Type<Model, Data> {
    private final length<Data> length;

    public interface length<Data> {
        Class<Data> getMax();

        void getMin(Data data) throws IOException;

        Data setMin(String str) throws IllegalArgumentException;
    }

    public access$1300(length<Data> length2) {
        this.length = length2;
    }

    public final SolverVariable$Type.setMax<Data> setMin(@NonNull Model model, int i, int i2, @NonNull MotionHelper motionHelper) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1540494320, oncanceled);
            onCancelLoad.getMin(1540494320, oncanceled);
        }
        return new SolverVariable$Type.setMax<>(new layoutChild(model), new getMax(model.toString(), this.length));
    }

    public final boolean getMin(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    static final class getMax<Data> implements isUseOnHide<Data> {
        private final length<Data> getMin;
        private final String length;
        private Data setMax;

        public final void getMax() {
        }

        getMax(String str, length<Data> length2) {
            this.length = str;
            this.getMin = length2;
        }

        public final void getMin(@NonNull Priority priority, @NonNull isUseOnHide.getMin<? super Data> getmin) {
            try {
                Data min = this.getMin.setMin(this.length);
                this.setMax = min;
                getmin.getMax(min);
            } catch (IllegalArgumentException e) {
                getmin.setMax(e);
            }
        }

        public final void getMin() {
            try {
                this.getMin.getMin(this.setMax);
            } catch (IOException unused) {
            }
        }

        @NonNull
        public final Class<Data> setMax() {
            return this.getMin.getMax();
        }

        @NonNull
        public final DataSource length() {
            return DataSource.LOCAL;
        }
    }

    public static final class setMax<Model> implements access$1900<Model, InputStream> {
        private final length<InputStream> getMax = new length<InputStream>() {
            public final /* synthetic */ void getMin(Object obj) throws IOException {
                ((InputStream) obj).close();
            }

            public final Class<InputStream> getMax() {
                return InputStream.class;
            }

            public final /* synthetic */ Object setMin(String str) throws IllegalArgumentException {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        };

        @NonNull
        public final SolverVariable$Type<Model, InputStream> getMax(@NonNull setSaturation setsaturation) {
            return new access$1300(this.getMax);
        }
    }
}
