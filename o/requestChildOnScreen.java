package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.DngCreator;
import android.hardware.camera2.TotalCaptureResult;
import android.media.ImageReader;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.otaliastudios.cameraview.controls.PictureFormat;
import o.calculateDtToFit;

@RequiresApi(21)
public final class requestChildOnScreen extends removeOnItemTouchListener implements ImageReader.OnImageAvailableListener {
    private final setHasFixedSize IsOverlapping = new setScrollingTouchSlop() {
        public final void length(@NonNull getFullClassName getfullclassname) {
            super.length(getfullclassname);
            requestChildOnScreen.this.equals.addTarget(requestChildOnScreen.this.toIntRange.getSurface());
            if (requestChildOnScreen.this.length.toIntRange == PictureFormat.JPEG) {
                requestChildOnScreen.this.equals.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(requestChildOnScreen.this.length.length));
            }
            requestChildOnScreen.this.equals.setTag(2);
            try {
                getfullclassname.setMax(requestChildOnScreen.this.equals);
            } catch (CameraAccessException e) {
                requestChildOnScreen.this.length = null;
                requestChildOnScreen.this.getMin = e;
                requestChildOnScreen.this.getMin();
                getMax(Integer.MAX_VALUE);
            }
        }

        public final void getMax(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest) {
            super.getMax(getfullclassname, captureRequest);
            if (captureRequest.getTag() == 2) {
                removeOnItemTouchListener.getMax.getMax(1, "onCaptureStarted:", "Dispatching picture shutter.");
                requestChildOnScreen requestchildonscreen = requestChildOnScreen.this;
                if (requestchildonscreen.setMax != null) {
                    requestchildonscreen.setMax.getMin(false);
                }
                getMax(Integer.MAX_VALUE);
            }
        }

        public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            int i;
            super.getMin(getfullclassname, captureRequest, totalCaptureResult);
            if (requestChildOnScreen.this.length.toIntRange == PictureFormat.DNG) {
                DngCreator unused = requestChildOnScreen.this.toFloatRange = new DngCreator(getfullclassname.toDoubleRange(), totalCaptureResult);
                DngCreator max = requestChildOnScreen.this.toFloatRange;
                int i2 = requestChildOnScreen.this.length.length;
                int i3 = (i2 + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE;
                if (i3 == 0) {
                    i = 1;
                } else if (i3 == 90) {
                    i = 6;
                } else if (i3 == 180) {
                    i = 3;
                } else if (i3 == 270) {
                    i = 8;
                } else {
                    throw new IllegalArgumentException("Invalid orientation: ".concat(String.valueOf(i2)));
                }
                max.setOrientation(i);
                if (requestChildOnScreen.this.length.setMax != null) {
                    requestChildOnScreen.this.toFloatRange.setLocation(requestChildOnScreen.this.length.setMax);
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public final CaptureRequest.Builder equals;
    private final getFullClassName setMin;
    /* access modifiers changed from: private */
    public DngCreator toFloatRange;
    /* access modifiers changed from: private */
    public final ImageReader toIntRange;

    public requestChildOnScreen(@NonNull calculateDtToFit.length length, @NonNull initAutofill initautofill, @NonNull CaptureRequest.Builder builder, @NonNull ImageReader imageReader) {
        super(length, initautofill);
        this.setMin = initautofill;
        this.equals = builder;
        this.toIntRange = imageReader;
        imageReader.setOnImageAvailableListener(this, ensureTopGlow.length().length);
    }

    public final void getMax() {
        this.IsOverlapping.getMin(this.setMin);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:11|12|13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0047 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onImageAvailable(android.media.ImageReader r8) {
        /*
            r7 = this;
            com.otaliastudios.cameraview.CameraLogger r0 = getMax
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "onImageAvailable started."
            r4 = 0
            r2[r4] = r3
            r0.getMax(r1, r2)
            r0 = 0
            android.media.Image r8 = r8.acquireNextImage()     // Catch:{ Exception -> 0x00bb, all -> 0x00b6 }
            int[] r2 = o.requestChildOnScreen.AnonymousClass1.setMax     // Catch:{ Exception -> 0x00b4 }
            o.calculateDtToFit$length r3 = r7.length     // Catch:{ Exception -> 0x00b4 }
            com.otaliastudios.cameraview.controls.PictureFormat r3 = r3.toIntRange     // Catch:{ Exception -> 0x00b4 }
            int r3 = r3.ordinal()     // Catch:{ Exception -> 0x00b4 }
            r2 = r2[r3]     // Catch:{ Exception -> 0x00b4 }
            if (r2 == r1) goto L_0x0065
            r3 = 2
            if (r2 != r3) goto L_0x004d
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00b4 }
            r2.<init>()     // Catch:{ Exception -> 0x00b4 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00b4 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x00b4 }
            android.hardware.camera2.DngCreator r5 = r7.toFloatRange     // Catch:{ IOException -> 0x003e }
            r5.writeImage(r3, r8)     // Catch:{ IOException -> 0x003e }
            r3.flush()     // Catch:{ IOException -> 0x003e }
            o.calculateDtToFit$length r5 = r7.length     // Catch:{ IOException -> 0x003e }
            byte[] r2 = r2.toByteArray()     // Catch:{ IOException -> 0x003e }
            r5.isInside = r2     // Catch:{ IOException -> 0x003e }
            goto L_0x009e
        L_0x003e:
            r1 = move-exception
            android.hardware.camera2.DngCreator r2 = r7.toFloatRange     // Catch:{ Exception -> 0x00b4 }
            r2.close()     // Catch:{ Exception -> 0x00b4 }
            r3.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00b4 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00b4 }
            throw r2     // Catch:{ Exception -> 0x00b4 }
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00b4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r3 = "Unknown format: "
            r2.<init>(r3)     // Catch:{ Exception -> 0x00b4 }
            o.calculateDtToFit$length r3 = r7.length     // Catch:{ Exception -> 0x00b4 }
            com.otaliastudios.cameraview.controls.PictureFormat r3 = r3.toIntRange     // Catch:{ Exception -> 0x00b4 }
            r2.append(r3)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b4 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00b4 }
            throw r1     // Catch:{ Exception -> 0x00b4 }
        L_0x0065:
            android.media.Image$Plane[] r2 = r8.getPlanes()     // Catch:{ Exception -> 0x00b4 }
            r2 = r2[r4]     // Catch:{ Exception -> 0x00b4 }
            java.nio.ByteBuffer r2 = r2.getBuffer()     // Catch:{ Exception -> 0x00b4 }
            int r3 = r2.remaining()     // Catch:{ Exception -> 0x00b4 }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x00b4 }
            r2.get(r3)     // Catch:{ Exception -> 0x00b4 }
            o.calculateDtToFit$length r2 = r7.length     // Catch:{ Exception -> 0x00b4 }
            r2.isInside = r3     // Catch:{ Exception -> 0x00b4 }
            o.calculateDtToFit$length r2 = r7.length     // Catch:{ Exception -> 0x00b4 }
            r2.length = r4     // Catch:{ Exception -> 0x00b4 }
            androidx.exifinterface.media.ExifInterface r2 = new androidx.exifinterface.media.ExifInterface     // Catch:{ IOException -> 0x009d }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x009d }
            o.calculateDtToFit$length r5 = r7.length     // Catch:{ IOException -> 0x009d }
            byte[] r5 = r5.isInside     // Catch:{ IOException -> 0x009d }
            r3.<init>(r5)     // Catch:{ IOException -> 0x009d }
            r2.<init>(r3)     // Catch:{ IOException -> 0x009d }
            java.lang.String r3 = "Orientation"
            int r2 = r2.length((java.lang.String) r3, (int) r1)     // Catch:{ IOException -> 0x009d }
            o.calculateDtToFit$length r3 = r7.length     // Catch:{ IOException -> 0x009d }
            int r2 = o.getMaxFlingVelocity.getMax(r2)     // Catch:{ IOException -> 0x009d }
            r3.length = r2     // Catch:{ IOException -> 0x009d }
            goto L_0x009e
        L_0x009d:
        L_0x009e:
            if (r8 == 0) goto L_0x00a3
            r8.close()
        L_0x00a3:
            com.otaliastudios.cameraview.CameraLogger r8 = getMax
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "onImageAvailable ended."
            r0[r4] = r1
            r8.setMax(r0)
            r7.getMin()
            return
        L_0x00b2:
            r0 = move-exception
            goto L_0x00ca
        L_0x00b4:
            r1 = move-exception
            goto L_0x00bd
        L_0x00b6:
            r8 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x00ca
        L_0x00bb:
            r1 = move-exception
            r8 = r0
        L_0x00bd:
            r7.length = r0     // Catch:{ all -> 0x00b2 }
            r7.getMin = r1     // Catch:{ all -> 0x00b2 }
            r7.getMin()     // Catch:{ all -> 0x00b2 }
            if (r8 == 0) goto L_0x00c9
            r8.close()
        L_0x00c9:
            return
        L_0x00ca:
            if (r8 == 0) goto L_0x00cf
            r8.close()
        L_0x00cf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.requestChildOnScreen.onImageAvailable(android.media.ImageReader):void");
    }

    /* renamed from: o.requestChildOnScreen$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.otaliastudios.cameraview.controls.PictureFormat[] r0 = com.otaliastudios.cameraview.controls.PictureFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                com.otaliastudios.cameraview.controls.PictureFormat r1 = com.otaliastudios.cameraview.controls.PictureFormat.JPEG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.otaliastudios.cameraview.controls.PictureFormat r1 = com.otaliastudios.cameraview.controls.PictureFormat.DNG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.requestChildOnScreen.AnonymousClass1.<clinit>():void");
        }
    }
}
