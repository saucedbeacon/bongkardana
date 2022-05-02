package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import o.setScaleY;

interface setIds {
    void getMin();

    ImageHeaderParser.ImageType setMax() throws IOException;

    int setMin() throws IOException;

    @Nullable
    Bitmap setMin(BitmapFactory.Options options) throws IOException;

    public static final class getMin implements setIds {
        private final onTransitionCompleted getMin;
        private final setOnHide setMax;
        private final List<ImageHeaderParser> setMin;

        getMin(InputStream inputStream, List<ImageHeaderParser> list, setOnHide setonhide) {
            if (setonhide != null) {
                this.setMax = setonhide;
                if (list != null) {
                    this.setMin = list;
                    this.getMin = new onTransitionCompleted(inputStream, setonhide);
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }

        @Nullable
        public final Bitmap setMin(BitmapFactory.Options options) throws IOException {
            onTransitionCompleted ontransitioncompleted = this.getMin;
            ontransitioncompleted.setMin.reset();
            return BitmapFactory.decodeStream(ontransitioncompleted.setMin, (Rect) null, options);
        }

        public final ImageHeaderParser.ImageType setMax() throws IOException {
            List<ImageHeaderParser> list = this.setMin;
            onTransitionCompleted ontransitioncompleted = this.getMin;
            ontransitioncompleted.setMin.reset();
            return setScaleY.setMax(list, ontransitioncompleted.setMin, this.setMax);
        }

        public final int setMin() throws IOException {
            List<ImageHeaderParser> list = this.setMin;
            onTransitionCompleted ontransitioncompleted = this.getMin;
            ontransitioncompleted.setMin.reset();
            return setScaleY.length(list, ontransitioncompleted.setMin, this.setMax);
        }

        public final void getMin() {
            this.getMin.setMin.getMin();
        }
    }

    @RequiresApi(21)
    public static final class getMax implements setIds {
        private final List<ImageHeaderParser> getMin;
        private final obtainVelocityTracker length;
        private final setOnHide setMax;

        public final void getMin() {
        }

        getMax(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, setOnHide setonhide) {
            if (setonhide != null) {
                this.setMax = setonhide;
                if (list != null) {
                    this.getMin = list;
                    this.length = new obtainVelocityTracker(parcelFileDescriptor);
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }

        @Nullable
        public final Bitmap setMin(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.length.setMin.setMin().getFileDescriptor(), (Rect) null, options);
        }

        public final ImageHeaderParser.ImageType setMax() throws IOException {
            return setScaleY.setMin(this.getMin, new setScaleY.length(this.setMax) {
                final /* synthetic */ setOnHide getMax;

                {
                    this.getMax = r2;
                }

                /* JADX WARNING: Removed duplicated region for block: B:14:0x002e A[SYNTHETIC, Splitter:B:14:0x002e] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final com.bumptech.glide.load.ImageHeaderParser.ImageType getMax(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
                    /*
                        r4 = this;
                        r0 = 0
                        o.setReferenceTags r1 = new o.setReferenceTags     // Catch:{ all -> 0x002b }
                        java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x002b }
                        o.obtainVelocityTracker r3 = o.obtainVelocityTracker.this     // Catch:{ all -> 0x002b }
                        o.obtainVelocityTracker$setMax r3 = r3.setMin     // Catch:{ all -> 0x002b }
                        android.os.ParcelFileDescriptor r3 = r3.setMin()     // Catch:{ all -> 0x002b }
                        java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x002b }
                        r2.<init>(r3)     // Catch:{ all -> 0x002b }
                        o.setOnHide r3 = r4.getMax     // Catch:{ all -> 0x002b }
                        r1.<init>(r2, r3)     // Catch:{ all -> 0x002b }
                        com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.setMax((java.io.InputStream) r1)     // Catch:{ all -> 0x0028 }
                        r1.close()     // Catch:{ IOException -> 0x0020 }
                    L_0x0020:
                        o.obtainVelocityTracker r0 = o.obtainVelocityTracker.this
                        o.obtainVelocityTracker$setMax r0 = r0.setMin
                        r0.setMin()
                        return r5
                    L_0x0028:
                        r5 = move-exception
                        r0 = r1
                        goto L_0x002c
                    L_0x002b:
                        r5 = move-exception
                    L_0x002c:
                        if (r0 == 0) goto L_0x0031
                        r0.close()     // Catch:{ IOException -> 0x0031 }
                    L_0x0031:
                        o.obtainVelocityTracker r0 = o.obtainVelocityTracker.this
                        o.obtainVelocityTracker$setMax r0 = r0.setMin
                        r0.setMin()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setScaleY.AnonymousClass5.getMax(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
                }
            });
        }

        public final int setMin() throws IOException {
            return setScaleY.setMax(this.getMin, new setScaleY.setMin(this.setMax) {
                final /* synthetic */ setOnHide setMax;

                {
                    this.setMax = r2;
                }

                /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[SYNTHETIC, Splitter:B:14:0x0030] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final int getMax(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
                    /*
                        r4 = this;
                        r0 = 0
                        o.setReferenceTags r1 = new o.setReferenceTags     // Catch:{ all -> 0x002d }
                        java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x002d }
                        o.obtainVelocityTracker r3 = o.obtainVelocityTracker.this     // Catch:{ all -> 0x002d }
                        o.obtainVelocityTracker$setMax r3 = r3.setMin     // Catch:{ all -> 0x002d }
                        android.os.ParcelFileDescriptor r3 = r3.setMin()     // Catch:{ all -> 0x002d }
                        java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x002d }
                        r2.<init>(r3)     // Catch:{ all -> 0x002d }
                        o.setOnHide r3 = r4.setMax     // Catch:{ all -> 0x002d }
                        r1.<init>(r2, r3)     // Catch:{ all -> 0x002d }
                        o.setOnHide r0 = r4.setMax     // Catch:{ all -> 0x002a }
                        int r5 = r5.setMin(r1, r0)     // Catch:{ all -> 0x002a }
                        r1.close()     // Catch:{ IOException -> 0x0022 }
                    L_0x0022:
                        o.obtainVelocityTracker r0 = o.obtainVelocityTracker.this
                        o.obtainVelocityTracker$setMax r0 = r0.setMin
                        r0.setMin()
                        return r5
                    L_0x002a:
                        r5 = move-exception
                        r0 = r1
                        goto L_0x002e
                    L_0x002d:
                        r5 = move-exception
                    L_0x002e:
                        if (r0 == 0) goto L_0x0033
                        r0.close()     // Catch:{ IOException -> 0x0033 }
                    L_0x0033:
                        o.obtainVelocityTracker r0 = o.obtainVelocityTracker.this
                        o.obtainVelocityTracker$setMax r0 = r0.setMin
                        r0.setMin()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setScaleY.AnonymousClass1.getMax(com.bumptech.glide.load.ImageHeaderParser):int");
                }
            });
        }
    }
}
