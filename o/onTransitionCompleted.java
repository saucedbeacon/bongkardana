package o;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import o.setProgress;

public final class onTransitionCompleted implements setProgress<InputStream> {
    public final setReferenceTags setMin;

    public onTransitionCompleted(InputStream inputStream, setOnHide setonhide) {
        setReferenceTags setreferencetags = new setReferenceTags(inputStream, setonhide);
        this.setMin = setreferencetags;
        setreferencetags.mark(5242880);
    }

    public final void getMax() {
        this.setMin.setMin();
    }

    public static final class getMax implements setProgress.getMin<InputStream> {
        private final setOnHide length;

        @NonNull
        public final /* synthetic */ setProgress setMax(Object obj) {
            return new onTransitionCompleted((InputStream) obj, this.length);
        }

        public getMax(setOnHide setonhide) {
            this.length = setonhide;
        }

        @NonNull
        public final Class<InputStream> setMin() {
            return InputStream.class;
        }
    }

    @NonNull
    public final /* synthetic */ Object getMin() throws IOException {
        this.setMin.reset();
        return this.setMin;
    }
}
